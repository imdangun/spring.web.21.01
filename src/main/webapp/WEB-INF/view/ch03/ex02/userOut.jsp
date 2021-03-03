<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<div class='row'>
		<div class='col'>
			${requestScope.user.name} / ${requestScope.user.age}
		</div>
		<div class='col'>
			${sessionScope.user.name} / ${sessionScope.user.age}
		</div>	
	</div>	
</div>