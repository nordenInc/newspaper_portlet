<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous">
</script>

<script type="text/javascript" src="//cdn.datatables.net/1.10.5/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.5/css/jquery.dataTables.min.css">

<div class="cabinet_title"><liferay-ui:message key="editors_cabinet"/></div>

<portlet:renderURL var = "redirectToHomeUrl">
	<portlet:param name = "page" value = "home"/>
</portlet:renderURL>

<portlet:renderURL var = "redirectToEditorCabinetUrl">
	<portlet:param name = "page" value = "editorCabinet"/>
</portlet:renderURL>

<div class="custom">
	<div class="custom_buttons">
		<a class="cabinet_buttons_left" href="${redirectToHomeUrl}"><liferay-ui:message key="news"/></a>
		<a class="cabinet_buttons" href = "${redirectToEditorCabinetUrl}"><liferay-ui:message key="write_new_article"/></a>
	</div>
</div>
<br><br><br>

<table id="articleTableEditor" class="articleTableEditor">

	<thead>
		<tr>
			<th><liferay-ui:message key="author_name"/></th>
			<th><liferay-ui:message key="article_title"/></th>
			<th><liferay-ui:message key="article_text"/></th>
			<th><liferay-ui:message key="status"/></th>
			<th><liferay-ui:message key="actions"/></th>
			<th><liferay-ui:message key="create_date"/></th>
			<th><liferay-ui:message key="editors_comment"/></th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${myEditorArticles}" var="article" varStatus="loop">
			
			<portlet:renderURL var = "redirectToUpdateArticleUrl">
				<portlet:param name = "page" value = "updateArticle"/>
				<portlet:param name = "articleId" value = "${article.articleId}"/>
			</portlet:renderURL>
			
			<portlet:actionURL var="publishArticleUrl" name="publishArticle">
				<portlet:param name="articleId" value="${article.articleId}"/>
			</portlet:actionURL>
			
			<portlet:actionURL var="deleteArticleUrl" name="deleteArticle">
				<portlet:param name="articleId" value="${article.articleId}"/>
			</portlet:actionURL>
		
			<tr>
				<td>${article.author}</td>
				<td>${article.title}</td>	
				<td>${article.content}</td>
				<td>
					<c:set var = "status" scope = "session" value = "${article.status}"/>
					<c:choose>
						<c:when test = "${status == 1}">
							<liferay-ui:message key="unchecked"/>
						</c:when>
						<c:when test = "${status == 2}">
							<liferay-ui:message key="checked"/>
						</c:when>
						<c:when test = "${status == 3}">
							<liferay-ui:message key="published"/>
						</c:when>
					</c:choose>
				</td>
				<td>
					<a href="${redirectToUpdateArticleUrl}"><button onClick='updateWarning("${article.articleId}");' type = "submit">
						<liferay-ui:message key="update"/></button>
					</a>
					<a href="${publishArticleUrl}" ><button onClick='publishWarning("${article.articleId}");'>
						<liferay-ui:message key="publish"/></button>
					</a>
					<a href="${deleteArticleUrl}" ><button onClick='deleteWarning("${article.articleId}");'>
						<liferay-ui:message key="delete"/></button>
					</a>
				</td>
				<td>${article.createDate}</td>
				<td>${article.editorComment}</td>
			</tr>
		</c:forEach>
	</tbody>
	
</table>

<script>
	$(document).ready( function () {
	    $('#articleTableEditor').DataTable();
	} );
		
	function updateWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to update article with id: " + articleId);
	}
	
	function publishWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to publish article with id: " + articleId);
	}
	
	function deleteWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to delete article with id: " + articleId);
	}
</script>