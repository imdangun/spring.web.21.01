<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<form action='ex03/survey' method='post'>
		<div class='row'>
			<div class='col'>
				<div class='form-check form-check-inline'>
					<input type='checkbox' class='form-check-input' value='사과' id='fruit1' name='fruits'/>
					<label class='form-check-label' for='fruit1'>사과</label>
				</div>
				<div class='form-check form-check-inline'>
					<input type='checkbox' class='form-check-input' value='딸기' id='fruit2' name='fruits'/>
					<label class='form-check-label' for='fruit2'>딸기</label>
				</div>
				<div class='form-check form-check-inline'>
					<input type='checkbox' class='form-check-input' value='포도' id='fruit3' name='fruits'/>
					<label class='form-check-label' for='fruit3'>포도</label>
				</div>
			</div>
		</div>
		<div class='row'>
			<div class='col'>
				<input type='text' class='form-control' placeholder='나라' name='location.nation'/>
			</div>
			<div class='col'>
				<input type='text' class='form-control' placeholder='도시' name='location.city'/>
			</div>
			<div class='col'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</form>
</div>