<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<div class='row'>
		<div class='col'>
			${user.userId} / ${user.userPw} 
		</div>
		<div class='col'>
			<a href='logout'>로그아웃</a>
		</div>
		<div class='col'>
			<a href='article'>기사</a>
		</div>
	</div>
</div>