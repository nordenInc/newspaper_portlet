<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<div class="main_title"><liferay-ui:message key="motorsport_news"/></div>

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

	<div class="article_content">
		<img class="image" src="${article.imageUrl}"/>
		<liferay-ui:message key="by"/>: ${article.author}
		<div class="date">${article.createDate}</div>
	</div>
	
	<div class="custom">
		<div class="custom_buttons">
			<div class="comment_buttons"><a href = "${showCommentUrl}" ><liferay-ui:message key="show_all_comments"/></a></div>
		</div>
	</div>
	<hr>
	
	<c:if test="${(role eq 'Administrator') || (role eq 'Editor')}">
		<a href="${redirectToUpdateArticleUrl}">
			<button class="comment_button" onClick='updateWarning("${article.articleId}");'><liferay-ui:message key="update"/></button>
		</a>
		<button class="comment_button" onClick = 'deleteWarn();'><liferay-ui:message key="delete"/></button>
	</c:if>
	<br><br>

	<c:forEach items="${userComments}" var="comment">
		<c:if test="${comment.articleId eq article.articleId}">
		<div class="article_content"><liferay-ui:message key="comment"/>:</div>

		<portlet:actionURL var = "deleteCommentUrl" name = "deleteComment">
			<portlet:param name = "commentId" value = "${comment.commentId}"/>
		</portlet:actionURL>
		
		<div class="article_content">
			<img class="image" src="${comment.imageUrl}"/>
			<liferay-ui:message key="by"/>:
			${comment.author}
			<div class="date">
				<liferay-ui:message key="date"/>:
				${comment.createDate}
			</div>
			<div class="comment_title">${comment.commentTitle}</div>
			<div class="custom">
				<div class="custom_buttons">
					${comment.commentContent}
					<c:if test="${(role eq 'Administrator') || (role eq 'Editor')}">
						<a class="comment_delete" href = "${deleteCommentUrl}" ><liferay-ui:message key="delete_comment"/></a><br>
					</c:if>
					<hr>
				</div>
			</div>
		</div>
	</c:if>
	</c:forEach>
	
	<c:if test="${(role eq 'Administrator') || (role eq 'Editor') || (role eq 'Author') || (role eq 'Reviewer')}">

	<aui:form action = "${saveCommentUrl}" method = "post" >
		<aui:input class = "field" type = "text" name = "title"/>
		<aui:input type = "text" name = "comment"/>
		<button class="comment_button" type = "submit"><liferay-ui:message key="leave_a_comment"/></button>	
	</aui:form>
	<hr>
	
	</c:if>
	<br>
</c:forEach>

<div class="license_align">
	<a id="toggler" href="#">� License agreement</a>
</div>
<div id="box">All rights reserved by a macaroni monster.</div>

<script>
	window.onload= function() {
		document.getElementById('toggler').onclick = function() {
			openbox('box', this);
			return false;
		};
	};
	function openbox(id, toggler) {
		var div = document.getElementById(id);
		if(div.style.display == 'block') {
			div.style.display = 'none';
		}
		else {
			div.style.display = 'block';
		}
	}

	function deleteWarn() {
    	var r = confirm("Are you sure that you want to delete this?");
   			if (r == true) {
   				window.location.replace("${deleteArticleUrl}");
    		}
	}    
	    
	function updateWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to publish article with id: " + articleId);
	}

	function publishWarning(_articleId){
		var articleId = _articleId;
		alert("You are going to publish article with id: " + articleId);
	}	
</script>
