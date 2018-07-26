package com.softwerke.nrv.newspaper.util;

import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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
	
	public void getUserRole(RenderRequest renderRequest, RenderResponse renderResponse) {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY); 
			long currentUserId = themeDisplay.getUserId();
			List<Role> defaultRoles =  RoleLocalServiceUtil.getUserRoles(currentUserId);
			Role role = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "User");
			long roleId = role.getRoleId();
			
			for (Role defaultRole:defaultRoles) {
				if ((defaultRole.getName().equals("Administrator")) || (defaultRole.getName().equals("Editor")) ||
						(defaultRole.getName().equals("Author")) || (defaultRole.getName().equals("Reviewer"))) {
					roleId = defaultRole.getRoleId();
				}
			}
			String userRole = RoleLocalServiceUtil.getRole(roleId).getName();
			renderRequest.setAttribute("userRole", userRole);
		} catch (SystemException e) {
			log.error("SystemException, check getUserRole method." + e.getMessage());
		} catch (PortalException e) {
			log.error("PortalException, check getUserRole method." + e.getMessage());
		}
	}
	
	

}
