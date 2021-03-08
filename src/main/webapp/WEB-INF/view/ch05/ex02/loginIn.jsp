<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='f' uri='http://www.springframework.org/tags/form' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<div class='container'>
	<f:form modelAttribute='user' method='post'>
		<div class='form-group row'>
			<label class='col-2 col-form-label' for='userId'>아이디: </label>
			<div class='col-4'>
				<f:input class='form-control' id='userId' path='userId'/>
			</div>
			<div class='col'>
				<f:errors path='userId'/>
			</div>
		</div>
		<div class='form-group row'>
			<label class='col-2 col-form-label' id='userPw' for='userPw'>암호: </label>
			<div class='col-4'>
				<f:password class='form-control' id='userPw' path='userPw'/>
			</div>
			<div class='col'>
				<f:errors path='userPw'/>
			</div>
		</div>
		<div class='row'>
			<div class='col-6 d-flex justify-content-end'>
				<button type='submit' class='btn btn-primary'>로그인</button>
			</div>
			<div class='col'>
				<div class='form-check form-check-inline'>
					<input type='checkbox' class='form-check-input' id='rememberId' name='rememberId'/>
					<label class='form-check-label' for='rememberId'>아이디 저장</label>
				</div>
			</div>
		</div>
	</f:form>
</div>