package com.softwerke.nrv.newspaper.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.softwerke.nrv.newspaper.service.NewspaperServiceImpl;
import com.softwerke.nrv.newspaper.util.PortletUtils;


/**
 * Portlet implementation class NewspaperPortlet
 */
public class NewspaperPortlet extends MVCPortlet {
	
	private NewspaperServiceImpl newspaperServiceImpl = NewspaperServiceImpl.getNewspaperServiceImpl();
	private PortletUtils portletUtils = new PortletUtils();
	private static final Log log = LogFactoryUtil.getLog(NewspaperServiceImpl.class);

	public void render (RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException  {    	
    	
		String redirect = ParamUtil.getString(renderRequest, "page"); 
		
		portletUtils.getUserRole(renderRequest, renderResponse);
		newspaperServiceImpl.showPublishedArticles(renderRequest, renderResponse);
					
		if(redirect.equalsIgnoreCase("authorCabinet")) {
			include("/html/newspaper/author/authorCabinet.jsp", renderRequest, renderResponse);
		} else if(redirect.equalsIgnoreCase("editorCabinet")) {
			include("/html/newspaper/editor/editorCabinet.jsp", renderRequest, renderResponse);
		} else if(redirect.equalsIgnoreCase("authorArticles")) {
			newspaperServiceImpl.showAuthorArticles(renderRequest, renderResponse);
			include("/html/newspaper/author/authorArticles.jsp", renderRequest, renderResponse);
		} else if(redirect.equalsIgnoreCase("waitingForCheckArticles")) {
			newspaperServiceImpl.showEditorArticles(renderRequest, renderResponse);
			include("/html/newspaper/editor/waitingForCheckArticles.jsp", renderRequest, renderResponse);
		} else if(redirect.equalsIgnoreCase("updateArticle")) {
			newspaperServiceImpl.showUpdateArticle(renderRequest, renderResponse);
			include("/html/newspaper/updateArticle.jsp", renderRequest, renderResponse);
		} else {
			include("/html/newspaper/home.jsp", renderRequest, renderResponse);
		}
	}
	
	public void saveArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.saveArticle(actionRequest, actionResponse);
		log.info("Article is saved.");
	}
	
	public void deleteArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.deleteArticle(actionRequest, actionResponse); 
		log.info("Article is deleted.");
	}
	
	public void updateArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.updateArticle(actionRequest, actionResponse);
		log.info("Article is updated.");
	}
	
	public void publishArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.publishArticle(actionRequest, actionResponse);
		log.info("Article is published.");
	}
	
	public void saveComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.saveComment(actionRequest, actionResponse);
		log.info("Comment is saved.");
	}
	
	public void deleteComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.deleteComment(actionRequest, actionResponse);
		log.info("Comment is deleted.");
	}
	
	public void showComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		newspaperServiceImpl.showComment(actionRequest, actionResponse);
		log.info("Comments are shown.");
	}
}
