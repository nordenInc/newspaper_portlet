<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<div class="cabinet_title"><liferay-ui:message key="editors_cabinet"/></div>

<portlet:renderURL var="redirectToHomeUrl">
	<portlet:param name="page" value="home"/>
</portlet:renderURL>

<portlet:renderURL var="redirectToWaitingForCheckArticlesUrl">
	<portlet:param name="page" value="waitingForCheckArticles"/>
</portlet:renderURL>

<portlet:actionURL var="saveArticleUrl" name="saveArticle">
</portlet:actionURL>

<div class="custom">
	<div class="custom_buttons">
		<a class="cabinet_buttons_left" href = "${redirectToHomeUrl}"><liferay-ui:message key="news"/></a>
		<a class="cabinet_buttons" href = "${redirectToWaitingForCheckArticlesUrl}"><liferay-ui:message key="articles_to_check"/></a>
	</div>
</div>

<aui:form action = "${saveArticleUrl}" method = "post" >
	<div class="cabinet_article"><liferay-ui:message key="new_article"/>:</div>
	<aui:input type = "text" name = "title"/>
	<aui:input type = "text" name = "content"/>
	<button class="comment_button" type = "submit"><liferay-ui:message key="publish"/></button>
</aui:form>

<button class="task_button">Click me!</button>
<button id="get_some" class="comment_button">Get some</button>
<div id="some"></div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script>
window.onload = function(){
	document.querySelector('#get_some').onclick = function() {
		ajaxGet();
	}
	
}
	
function ajaxGet() {
	var request = new XMLHttpRequest();
	request.onreadystatechange = function() {
		if(request.readyState == 4 && request.status == 200) {
			document.querySelector('#some').innerHTML = request.responseText;
		}	
	}
	request.open('GET','https://httpbin.org/get');
	request.send();
}

</script>
