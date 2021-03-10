<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<div class='container'>
	<form method='post'>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='to'>수신지: </label>
			<div class='col'>
				<input type='email' class='form-control' id='to' name='to'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='subject'>제목: </label>
			<div class='col'>
				<input type='text' class='form-control' id='subject' name='subject'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='text'>내용: </label>
			<div class='col'>
				<textarea class='form-control' cols='50' rows='10' id='text' name='text'></textarea>
			</div>
		</div>
		<div class='row'>
			<div class='col d-flex justify-content-end'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
</div>