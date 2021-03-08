<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='f' uri='http://www.springframework.org/tags/form' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<f:form method='post' modelAttribute='user'>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='name'>이름:: </label>
			<div class='col'>
				<f:input class='form-control' id='name' path='name'/>
			</div>
			<div class='col-6'>
				<f:errors path='name'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='age'>나이: </label>
			<div class='col'>
				<f:input type='number' class='form-control' id='age' path='age'/>
			</div>
			<div class='col-6'>
				<f:errors path='age'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='email'>이메일: </label>
			<div class='col'>
				<f:input class='form-control' id='email' path='email'/>
			</div>
			<div class='col-6'>
				<f:errors path='email'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='birthday'>생일: </label>
			<div class='col'>
				<f:input type='date' class='form-control' id='birthday' path='birthday'/>
			</div>
			<div class='col-6'>
				<f:errors path='birthday'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label'>취미: </label>
			<div class='col'>
				<div class='form-check form-check-inline'>
					<f:checkbox class='form-check-input' id='hobby1' value='등산' path='hobbys'/>
					<label class='form-check-label' for='hobby1'>등산</label>
				</div>
				<div class='form-check form-check-inline'>
					<f:checkbox class='form-check-input' id='hobby2' value='수영' path='hobbys'/>
					<label class='form-check-label' for='hobby2'>수영</label>
				</div>
				<div class='form-check form-check-inline'>
					<f:checkbox class='form-check-input' id='hobby3' value='독서' path='hobbys'/>
					<label class='form-check-label' for='hobby3'>독서</label>
				</div>
			</div>
			<div class='col-6'>
				<f:errors path='hobbys'/>
			</div>
		</div>
		<div class='row'>
			<div class='col'>
				<button type='submit' class='btn btn-primary'>제출</button>
			</div>
		</div>
	</f:form>
</div>