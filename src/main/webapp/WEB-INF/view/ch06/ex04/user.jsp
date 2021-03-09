<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function alert(job, isSuccess) {
	if(isSuccess) {
		$('#alert').removeClass('alert-danger').addClass('alert-success');
		$('#msg').text(job + ' 성공했습니다.');
	} else {
		$('#alert').removeClass('alert-success').addClass('alert-danger');
		$('#msg').text(job + ' 실패했습니다.');
	}
}

$(() => {
	$('#addBtn').click(() => {
		$.ajax({
			url: 'user/add',
			method: 'post',
			contentType: 'application/json',
			data: JSON.stringify({
				userId: $('#userId').val(),
				userName: $('#userName').val(),
				birthday: $('#birthday').val()
			}),
			success: result => alert('추가', result),
			error: e => alert('추가', false)
		});
	});
	
	$('#fixBtn').click(() => {
		$.ajax({
			url: 'user/fix',
			method: 'put',
			contentType: 'application/json',
			data: JSON.stringify({
				userId: $('#userId').val(),
				userName: $('#userName').val(),
				birthday: $('#birthday').val()
			}),
			success: result => alert('수정', result),
			error: e => alert('수정', false)
		});
	});
	
	$('#delBtn').click(() => {
		$.ajax({
			url: 'user/del/' + $('#userId').val(),
			method: 'delete',
			success: result => alert('삭제', result),
			error: e => alert('삭제', false)
		});
	});
});
</script>
<div class='container'>
	<form id='userForm'>
		<div class='row'>
			<div class='form-group col'>
				<label class='form-label' for='userId'>ID: </label>
				<input type='number' class='form-control' value='1' id='userId'/>
			</div>
			<div class='form-group col'>
				<label class='form-label' for='userName'>이름: </label>
				<input type='text' class='form-control' value='최한석' id='userName'/>
			</div>
			<div class='form-group col'>
				<label class='form-label' for='birthday'>생일: </label>
				<input type='date' class='form-control' value='2025-05-05' id='birthday'/>
			</div>
		</div>
		<div class='row'>
			<div class='col'>
				<div class='btn-toolbar'>
					<div class='btn-group mr-3'>
						<a href='user/list' class='btn btn-primary'>목록</a>
					</div>
					<div class='btn-group'>
						<button type='button' class='btn btn-primary' id='addBtn'>추가</button>
						<button type='button' class='btn btn-primary' id='fixBtn'>수정</button>
						<button type='button' class='btn btn-primary' id='delBtn'>삭제</button>
					</div>
				</div>
			</div>
		</div>		
	</form>
	<div class='row'>
		<div class='col'>
			<div class='alert mt-3' id='alert'>
				<strong id='msg'></strong>
			</div>
		</div>
	</div>
</div>