<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function init() {
	$('#getBtn').click(() => {
		$.ajax('get')
			.done(user => console.log(user));
	});
	
	$('#postBtn').click(() => {
		$.ajax({
			url: 'post',
			data: JSON.stringify({
				userId: 1,
				userName: '최한석',
				birthday: '2025-10-12'
			}),
			contentType: 'application/json',
			method: 'post'
		}).done(user => console.log(user));
	});
	
	$('#putBtn').click(() => {
		$.ajax({
			url: 'put',
			data: JSON.stringify({
				userId: 1,
				userName: '한아름',
				birthday: '2010-01-02'
			}),
			contentType: 'application/json',
			method: 'put'
		}).done(user => console.log(user));
	});
	
	$('#patchBtn').click(() => {
		$.ajax({
			url: 'patch',
			data: JSON.stringify({
				userId: 1,
				userName: '최한석',
				birthday: '2010-01-02'
			}),
			contentType: 'application/json',
			method: 'patch'
		}).done(user => console.log(user));
	});
	
	$('#deleteBtn').click(() => {
		$.ajax({
			url: 'delete',
			data: JSON.stringify({
				userId: 1
			}),
			contentType: 'application/json',
			method: 'delete'
		}).done(user => console.log(user));
	});
}

$(init);
</script>
<div class='container'>
	<button type='button' class='btn btn-primary' id='getBtn'>GET</button>
	<button type='button' class='btn btn-secondary' id='postBtn'>POST</button>
	<button type='button' class='btn btn-success' id='putBtn'>PUT</button>
	<button type='button' class='btn btn-warning' id='patchBtn'>PATCH</button>
	<button type='button' class='btn btn-danger' id='deleteBtn'>DELETE</button>
</div>