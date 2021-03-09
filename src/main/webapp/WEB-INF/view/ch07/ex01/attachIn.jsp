<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<div class='container'>
	<form method='post' encType='multipart/form-data'>
		<div class='form-row'>
			<div class='col'>
				<input type='text' class='form-control' placeholder='제목' name='title'/>
			</div>
			<div class='col'>
				<div class='custom-file'>
					<input type='file' class='custom-file-input' name='attachFile'/>
					
				</div>
			</div>
		</div>
	</form>
</div>