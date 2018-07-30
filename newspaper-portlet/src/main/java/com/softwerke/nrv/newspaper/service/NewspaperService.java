package com.softwerke.nrv.newspaper.service;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public interface NewspaperService {
	
	public void saveArticle(ActionRequest actionRequest, ActionResponse actionResponse);
	
	public void deleteArticle(ActionRequest actionRequest, ActionResponse actionResponse);
	
	public void updateArticle(ActionRequest actionRequest, ActionResponse actionResponse);
	
	public void publishArticle(ActionRequest actionRequest,ActionResponse actionResponse);
	
	public void showPublishedArticles(RenderRequest renderRequest, RenderResponse renderResponse);
	
	public void showAuthorArticles(RenderRequest renderRequest, RenderResponse renderResponse);
	
	public void showEditorArticles(RenderRequest renderRequest, RenderResponse renderResponse);
	
	public void showUpdateArticle(RenderRequest renderRequest, RenderResponse renderResponse);
	
	public void saveComment(ActionRequest actionRequest, ActionResponse actionResponse);
	
	public void deleteComment(ActionRequest actionRequest, ActionResponse actionResponse);
	
	public void showComment(ActionRequest actionRequest, ActionResponse actionResponse);
}
