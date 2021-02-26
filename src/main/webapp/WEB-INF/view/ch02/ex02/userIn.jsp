<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>

<div class='container'>
<!-- 	<form action='userOut'> -->'
	<form method='post'>
		<div class='form-group row'>
			<label for='userName' class='col-1 col-form-label'>이름: </label>
			<div class='col'>
				<input type='text' class='form-control' name='name' id='name'/>
			</div>
		</div>
		<div class='form-group row'>
			<label for='age' class='col-1 col-form-label'>나이: </label>
			<div class='col'>
				<input type='number' class='form-control' name='age' id='age'/>
			</div>
		</div>
		<div class='row'>
			<div class='col-3 d-flex justify-content-end form-check form-check-inline'>
				<input type='checkbox' class='form-check-input' name='agree' id='agree'/>
				<label class='form-check-label' for='agree'>약관에 동의합니다.</label>				
			</div>
			<div class='col'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
</div>