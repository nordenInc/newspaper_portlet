<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<b><liferay-ui:message key="editors_cabinet"/></b><br><br>

<portlet:renderURL var="redirectToHomeUrl">
	<portlet:param name="page" value="home"/>
</portlet:renderURL>

<portlet:renderURL var="redirectToWaitingForCheckArticlesUrl">
	<portlet:param name="page" value="waitingForCheckArticles"/>
</portlet:renderURL>

<portlet:actionURL var="saveArticleUrl" name="saveArticle">
</portlet:actionURL>

<a href = "${redirectToHomeUrl}"><button type = "submit" ><liferay-ui:message key="news"/></button></a>
<a href = "${redirectToWaitingForCheckArticlesUrl}"><button type = "submit" style="float:right"><liferay-ui:message key="articles_to_check"/></button></a>
<br><br>

<aui:form action = "${saveArticleUrl}" method = "post" >
	<liferay-ui:message key="new_article"/>:<br><br>
	<aui:input type = "text" name = "title"/>
	<aui:input type = "text" name = "content"/>
	<button type = "submit"><liferay-ui:message key="publish"/></button>
</aui:form>