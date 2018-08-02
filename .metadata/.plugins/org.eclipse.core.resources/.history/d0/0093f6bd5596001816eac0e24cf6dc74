<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<portlet:defineObjects />

<div class="cabinet_title"><liferay-ui:message key="article_updater"/></div>

<portlet:renderURL var="redirectToHomeUrl">
	<portlet:param name="page" value="home"/>
</portlet:renderURL>

<portlet:actionURL var="updateArticleUrl" name="updateArticle">
	<portlet:param name = "articleId" value = "${param.articleId}"/>
</portlet:actionURL>

<div class="custom">
	<div class="custom_buttons">
		<a class="cabinet_buttons_left" href="${redirectToHomeUrl}"><liferay-ui:message key="news"/></a>
	</div>
</div>

<aui:form action = "${updateArticleUrl}" method = "post" >
	<div class="cabinet_article"><liferay-ui:message key="article"/>:</div>
	<aui:input type = "text" name = "title" value = "${newsArticle.title}"/>
	<aui:input type = "text" name = "content" value = "${newsArticle.content}"/>
	<aui:input type = "text" name = "editorComment" value = "${newsArticle.editorComment}"/>
	<button type = "submit"><liferay-ui:message key="update_article"/></button>
</aui:form>