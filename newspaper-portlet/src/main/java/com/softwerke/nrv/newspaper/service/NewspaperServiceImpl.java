package com.softwerke.nrv.newspaper.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.softwerke.nrv.newsapaper.model.NewsArticle;
import com.softwerke.nrv.newsapaper.model.UserComment;
import com.softwerke.nrv.newsapaper.service.NewsArticleLocalServiceUtil;
import com.softwerke.nrv.newsapaper.service.UserCommentLocalServiceUtil;
import com.softwerke.nrv.newspaper.portlet.NewspaperPortlet;
import com.softwerke.nrv.newspaper.util.PortletUtils;
import com.softwerke.nrv.newspaper.util.StatusEnums;

public class NewspaperServiceImpl implements NewspaperService {
	
	private static final Log log = LogFactoryUtil.getLog(NewspaperServiceImpl.class); 
	private PortletUtils portletUtils = new PortletUtils();
																									
	private static volatile NewspaperServiceImpl newspaperServiceImpl;
	private NewspaperServiceImpl() {}
	
	public static NewspaperServiceImpl getNewspaperServiceImpl() {
		NewspaperServiceImpl localNewspaperServiceImpl = newspaperServiceImpl;
		if (localNewspaperServiceImpl == null) {
			synchronized (NewspaperServiceImpl.class) {
				localNewspaperServiceImpl = newspaperServiceImpl;
				if (localNewspaperServiceImpl == null) {
					newspaperServiceImpl = localNewspaperServiceImpl = new NewspaperServiceImpl();
				}
			}
		}
		return localNewspaperServiceImpl;
	}

	@Override
	public void saveArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY); 
			long authorId = themeDisplay.getUserId();
			String authorName = themeDisplay.getUser().getFullName();
			String title = ParamUtil.getString(actionRequest, "title");
			String content = ParamUtil.getString(actionRequest, "content");
			Date date = new Date();
			
			long articleId = CounterLocalServiceUtil.increment(NewspaperPortlet.class.getName());
			String user = portletUtils.getUserRole(actionRequest, actionResponse);
			log.info(user);
			StatusEnums statusEnums = StatusEnums.UNCHECKED;
			if (user.equals("Editor") || user.equals("Administrator")) {
				statusEnums = StatusEnums.PUBLISHED;
			}
			int status = statusEnums.getValue();
			log.info(status);
			
			NewsArticle newsArticle = NewsArticleLocalServiceUtil.createNewsArticle(articleId);
			newsArticle.setAuthorId(authorId);
			newsArticle.setAuthor(authorName);
			newsArticle.setTitle(title);
			newsArticle.setContent(content);
			newsArticle.setStatus(status);
			newsArticle.setCreateDate(date);
			NewsArticleLocalServiceUtil.addNewsArticle(newsArticle);
		} catch (SystemException e) {
			log.error("SystemException, check saveArticle method." + e.getMessage());
		}		
	}

	@Override
	public void deleteArticle(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		try {
			long newsArticleId = ParamUtil.getLong(actionRequest, "articleId");
			NewsArticle newsArticle = NewsArticleLocalServiceUtil.getNewsArticle(newsArticleId);
			NewsArticleLocalServiceUtil.deleteNewsArticle(newsArticle);
			deleteComments(newsArticleId);
		} catch (PortalException e) {
			log.error("PortalException, check deleteArticle method." + e.getMessage());
		} catch (SystemException e) {
			log.error("SystemException, check deleteArticle method." + e.getMessage());
		}	
	}

	@Override
	public void updateArticle(ActionRequest actionRequest,ActionResponse actionResponse) {
		
		try {
			long newsArticleId = ParamUtil.getLong(actionRequest, "articleId");
			String title = ParamUtil.getString(actionRequest, "title");
			String content = ParamUtil.getString(actionRequest, "content");
			String editorComment = ParamUtil.getString(actionRequest, "editorComment");
			StatusEnums statusEnums = StatusEnums.CHECKED;
			int status = statusEnums.getValue();
			
			NewsArticle newsArticle = NewsArticleLocalServiceUtil.fetchNewsArticle(newsArticleId);
			newsArticle.setTitle(title);
			newsArticle.setContent(content);
			newsArticle.setStatus(status);
			newsArticle.setEditorComment(editorComment);
			NewsArticleLocalServiceUtil.updateNewsArticle(newsArticle);
		} catch (SystemException e) {
			log.error("SystemException, check updateArticle method." + e.getMessage());
		}
	}	
	
	@Override
	public void publishArticle(ActionRequest actionRequest,ActionResponse actionResponse) {
		
		try {
			long newsArticleId = ParamUtil.getLong(actionRequest, "articleId");
			StatusEnums statusEnums = StatusEnums.PUBLISHED;
			int status = statusEnums.getValue();
			
			NewsArticle newsArticle = NewsArticleLocalServiceUtil.fetchNewsArticle(newsArticleId);
			newsArticle.setStatus(status);
			NewsArticleLocalServiceUtil.updateNewsArticle(newsArticle);
		} catch (SystemException e) {
			log.error("SystemException, check publishArticle method." + e.getMessage());
		}
	}
	
	@Override
	public void showPublishedArticles(RenderRequest renderRequest, RenderResponse renderResponse) {
		
		try {
			List<NewsArticle> publishedArticles = new ArrayList<>();
			List<NewsArticle> myArticles = NewsArticleLocalServiceUtil.getNewsArticles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (NewsArticle myArticle: myArticles) {
				StatusEnums statusEnums = StatusEnums.valueOf(myArticle.getStatus());
				if(statusEnums.equals(StatusEnums.PUBLISHED)) {
					publishedArticles.add(myArticle);
				}
			}
			renderRequest.setAttribute("publishedArticles", publishedArticles);
		} catch (SystemException e) {
			log.error("SystemException, check showPublishedArticles method." + e.getMessage());
		}
	}
	
	@Override
	public void showAuthorArticles(RenderRequest renderRequest, RenderResponse renderResponse) {
		
		try {
			List<NewsArticle> myAuthorArticles = new ArrayList<>();
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long authorId = themeDisplay.getUserId();
			List<NewsArticle> myArticles= NewsArticleLocalServiceUtil.getNewsArticles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (NewsArticle myArticle: myArticles) {
				if (myArticle.getAuthorId() == authorId) {
					myAuthorArticles.add(myArticle);
				}
			}
			renderRequest.setAttribute("myAuthorArticles", myAuthorArticles);
		} catch (SystemException e) {
			log.error("SystemException, check showArticles method." + e.getMessage());
		}
	}
	
	@Override
	public void showEditorArticles(RenderRequest renderRequest, RenderResponse renderResponse) {
	
		try {
			List<NewsArticle> myEditorArticles = new ArrayList<>();
			List<NewsArticle> myArticles = NewsArticleLocalServiceUtil.getNewsArticles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (NewsArticle myArticle: myArticles) {
				StatusEnums statusEnums = StatusEnums.valueOf(myArticle.getStatus());
				if ((statusEnums.equals(StatusEnums.CHECKED)) || 
						(statusEnums.equals(StatusEnums.UNCHECKED))) { 
					myEditorArticles.add(myArticle);
				}
			}
			renderRequest.setAttribute("myEditorArticles", myEditorArticles);
		} catch (SystemException e) {
			log.error("SystemException, check showEditorArticles method." + e.getMessage());
		}
	}
	
	@Override
	public void showUpdateArticle(RenderRequest renderRequest, RenderResponse renderResponse) {
		
		try {
			long newsArticleId = ParamUtil.getLong(renderRequest, "articleId");
			List<NewsArticle> myArticles = NewsArticleLocalServiceUtil.getNewsArticles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (NewsArticle newsArticle: myArticles) {
				if (newsArticle.getArticleId() == newsArticleId) {
					renderRequest.setAttribute("newsArticle", newsArticle);
				}
			}
		} catch (SystemException e) {
			log.error("SystemException, check showUpdateArticle method." + e.getMessage());
		}
	}
	
	@Override
	public void saveComment(ActionRequest actionRequest, ActionResponse actionResponse) {
				
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String reviewerName = themeDisplay.getUser().getFullName();
			String commentContent = ParamUtil.getString(actionRequest, "comment");
			String commentTitle = ParamUtil.getString(actionRequest, "title");
			Date createDate = new Date();
			long authorImageId = themeDisplay.getUser().getPortraitId();
			log.info(authorImageId);
			long commentId = CounterLocalServiceUtil.increment(NewspaperPortlet.class.getName());
			long articleId = ParamUtil.getLong(actionRequest, "articleId");
			String userImageUrl = themeDisplay.getUser().getPortraitURL(themeDisplay);	
			log.info(userImageUrl);

			UserComment userComment = UserCommentLocalServiceUtil.createUserComment(commentId);
			//userComment.setImageUrl(userImageUrl);
			userComment.setAuthor(reviewerName);
			userComment.setArticleId(articleId);
			userComment.setCommentTitle(commentTitle);
			userComment.setCommentContent(commentContent);
			userComment.setCreateDate(createDate);
			userComment.setAuthorImageId(authorImageId);
			UserCommentLocalServiceUtil.addUserComment(userComment);
		} catch (SystemException | PortalException e) {
			log.error("SystemException, check saveComment method." + e.getMessage());
		}
	}
	
	@Override
	public void deleteComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		try {
			long commentId = ParamUtil.getLong(actionRequest, "commentId");
			UserComment userComment = UserCommentLocalServiceUtil.getUserComment(commentId);
			UserCommentLocalServiceUtil.deleteUserComment(userComment);
		} catch (PortalException e) {
			log.error("PortalException, check deleteComment method." + e.getMessage());
		} catch (SystemException e) {
			log.error("SystemException, check deleteComment method." + e.getMessage());
		}
	}
	
	@Override
	public void showComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		try {
			long articleId = ParamUtil.getLong(actionRequest, "articleId");
			List<UserComment> userComments = new ArrayList<>();
			List<UserComment> myComments = UserCommentLocalServiceUtil.getUserComments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (UserComment myComment: myComments) {
				if(myComment.getArticleId() == articleId) {
					userComments.add(myComment);
				}
			}
			actionRequest.setAttribute("userComments", userComments);
		} catch (SystemException e) {
			log.error("SystemException, check showUserComment method." + e.getMessage());
		}
	}
	
	private void deleteComments(long articleId) {
		
		try {
			List<UserComment> myComments = UserCommentLocalServiceUtil.getUserComments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			for (UserComment myComment: myComments) {
				if(myComment.getArticleId() == articleId) {
					UserCommentLocalServiceUtil.deleteUserComment(myComment);
				}
			}
		} catch (SystemException e) {
			log.error("SystemException, check deleteComments method." + e.getMessage());
		}
	}
}
