<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<form method='post'>
		<div class='form-group row'>
			<label for='userName' class='form-label'>이름: </label>
			<input type='text' class='form-control' id='userName' name='userName'/>
		</div>
		<div class='form-group row'>
			<label for='age' class='form-label'>나이: </label>
			<input type='number' class='form-control' id='age' name='age'/>
		</div>
		<div class='row'>
			<div class='col'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
</div>