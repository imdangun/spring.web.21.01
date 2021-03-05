<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<div class='row'>
		<div class='col'>
			<ul>
				<li>이름: ${user.name}</li>
				<li>나이: ${user.age}</li>
				<li>이메일: ${user.email}</li>
				<li>생일: ${user.birthday}</li>
				<li>취미:
					<c:forEach var='hobby' items='${user.hobbys}'>
						${hobby}, 
					</c:forEach>
				</li>
			</ul>
		</div>
	</div>
</div>