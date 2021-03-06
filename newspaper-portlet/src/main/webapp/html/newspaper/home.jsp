<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>


<portlet:defineObjects />

<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous">
</script>

<div class="main_title"><liferay-ui:message key="home_of_guardian"/></div>

<portlet:renderURL var = "redirectToAuthorCabinetUrl">
	<portlet:param name = "page" value = "authorCabinet"/>
</portlet:renderURL>

<portlet:renderURL var = "redirectToEditorCabinetUrl">
	<portlet:param name = "page" value = "editorCabinet"/>
</portlet:renderURL>

<c:set var = "role"  value = "${userRole}"/> 
<div class="custom">
	<div class="custom_buttons">
		<c:if test="${(role eq 'Administrator') || (role eq 'Author')}">
			<a class="cabinet_buttons" href = "${redirectToAuthorCabinetUrl}"><liferay-ui:message key="authors_cabinet"/></a>
		</c:if>
		
		<c:if test="${(role eq 'Administrator') || (role eq 'Editor')}">
			<a class="cabinet_buttons " href = "${redirectToEditorCabinetUrl}"><liferay-ui:message key="editors_cabinet"/></a>
		</c:if>
	</div>
</div>
<br><br>

<c:forEach items="${publishedArticles}" var="article"> 
	<portlet:renderURL var = "redirectToUpdateArticleUrl">
		<portlet:param name = "page" value = "updateArticle"/>
		<portlet:param name = "articleId" value = "${article.articleId}"/>
	</portlet:renderURL>
	
	<portlet:actionURL var = "deleteArticleUrl" name = "deleteArticle">
		<portlet:param name = "articleId" value = "${article.articleId}"/>
	</portlet:actionURL>

	<portlet:actionURL var = "saveCommentUrl" name = "saveComment">
		<portlet:param name = "articleId" value = "${article.articleId}"/>
	</portlet:actionURL>
	
	<portlet:actionURL var = "showCommentUrl" name = "showComment">
		<portlet:param name = "articleId" value = "${article.articleId}"/>
	</portlet:actionURL>

	
	<div class="article_title">${article.title}</div>
	<div class="article_content">${article.content}</div>
	
	<div class="article_content">Author: ${article.author}</div>
	
	<div class="custom">
		<div class="custom_buttons">
			<c:if test="${(role eq 'Administrator') || (role eq 'Editor')}">
				<a class="article_buttons" href="${redirectToUpdateArticleUrl}" onClick = 'updateWarning("${article.articleId}");'>
					<liferay-ui:message key="update"/>
				</a>
				<a class="article_buttons" href="${deleteArticleUrl}" onClick = 'deleteWarning("${article.articleId}");'>
					<liferay-ui:message key="delete"/>
				</a>
			</c:if>
		</div>
	</div>
	
	<br><br>
	
	<liferay-ui:message key="comments"/>:
	<br>
	<a href = "${showCommentUrl}" ><button><liferay-ui:message key="show_all_comments"/></button></a>
	<br><br>

	<c:forEach items="${userComments}" var="comment">
		<portlet:actionURL var = "deleteCommentUrl" name = "deleteComment">
			<portlet:param name = "commentId" value = "${comment.commentId}"/>
		</portlet:actionURL>
		<liferay-ui:message key="author"/>:
		${comment.author}<br>
		<liferay-ui:message key="date"/>:
		${comment.createDate}<br>
		${comment.commentTitle}<br>
		${comment.commentContent}
		<c:if test="${(role eq 'Administrator') || (role eq 'Editor')}">
			<a href = "${deleteCommentUrl}" ><button><liferay-ui:message key="delete_comment"/></button></a><br>
		</c:if>
		<br>
	</c:forEach>
	
	<c:if test="${(role eq 'Administrator') || (role eq 'Editor') || (role eq 'Author') || (role eq 'Reviewer')}">
	<aui:form action = "${saveCommentUrl}" method = "post" >
		<aui:input type = "text" name = "title"/>
		<aui:input type = "text" name = "comment"/>
		<button type = "submit"><liferay-ui:message key="leave_a_comment"/></button>
	</aui:form>
	</c:if>
	<br>
</c:forEach>

<script>
	function updateWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to update article with id: " + articleId);
	}
	
	function deleteWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to delete article with id: " + articleId);
	}
</script>