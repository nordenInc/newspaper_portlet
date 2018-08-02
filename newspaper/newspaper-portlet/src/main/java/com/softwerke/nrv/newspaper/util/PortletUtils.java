package com.softwerke.nrv.newspaper.util;

import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class PortletUtils {
	
	private static final Log log = LogFactoryUtil.getLog(PortletUtils.class); 
	private static final String USER = "User";
	private static final String AUTHOR = "Author";
	private static final String EDITOR = "Editor";
	private static final String REVIEWER = "Reviewer";
	private static final String ADMINISTRATOR = "Administrator";
		
	public Role getUserRole(PortletRequest portletRequest, PortletResponse portletResponse) {
		
		Role userRole = null;
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY); 
			long currentUserId = themeDisplay.getUserId();
			List<Role> defaultRoles =  RoleLocalServiceUtil.getUserRoles(currentUserId);
			Role role = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), USER);
			long roleId = role.getRoleId();
			//rename defaultRole to userRole
			for (Role defaultRole:defaultRoles) {
				if ((defaultRole.getName().equals(ADMINISTRATOR)) || (defaultRole.getName().equals(EDITOR)) ||
						(defaultRole.getName().equals(AUTHOR)) || (defaultRole.getName().equals(REVIEWER))) {
					roleId = defaultRole.getRoleId();
				}
			}
			userRole = RoleLocalServiceUtil.getRole(roleId);
		} catch (SystemException e) {
			log.error("SystemException, check getUserRole method." + e.getMessage());
		} catch (PortalException e) {
			log.error("PortalException, check getUserRole method." + e.getMessage());
		}
		return userRole;
	}
	
	public void setUserRoleName(PortletRequest portletRequest, PortletResponse portletResponse) {
		
		String userRoleName = null;
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY); 
			long currentUserId = themeDisplay.getUserId();
			List<Role> defaultRoles =  RoleLocalServiceUtil.getUserRoles(currentUserId);
			Role role = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), USER);
			long roleId = role.getRoleId();
			//rename defaultRole to userRole
			for (Role userRole:defaultRoles) {
				if ((userRole.getName().equals(ADMINISTRATOR)) || (userRole.getName().equals(EDITOR)) ||
						(userRole.getName().equals(AUTHOR)) || (userRole.getName().equals(REVIEWER))) {
					roleId = userRole.getRoleId();
				}
			}
			userRoleName = RoleLocalServiceUtil.getRole(roleId).getName();
			portletRequest.setAttribute("userRole", userRoleName);
		} catch (SystemException e) {
			log.error("SystemException, check getUserRole method." + e.getMessage());
		} catch (PortalException e) {
			log.error("PortalException, check getUserRole method." + e.getMessage());
		}
	}
}
