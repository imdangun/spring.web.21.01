<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<div class='row'>
		<div class='col'>
			<ol>
				<c:forEach var='fruit' items='${answer.fruits}'>
					<li>${fruit}</li>
				</c:forEach>
			</ol>
		</div>
		<div class='col'>
			${answer.location.nation} / ${answer.location.city}
		</div>
	</div>
	
</div>