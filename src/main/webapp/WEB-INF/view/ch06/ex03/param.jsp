<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function init() {
	$('#1').click(() => {
		$.ajax({
			url: '1',
			data: {
				userId: 1,
				userName: '최한석',
				birthday: '2025-12-12'
			},
			method: 'get'
			// method: 'post' -- 성공
			// method: 'put' -- 실패
		});
	});
	
	$('#2').click(() => {
		$.ajax({
			url: '2',
			data: {
				userId: 2,
				userName: '한아름',
				birthday: '2030-10-12'
			},
			// method: 'get'    // 성공
			method: 'post'   // 성공
			// method: 'put'    // 실패
			// method: 'patch'  // 실패
			// method: 'delete' // 실패
		});
	});
	
	$('#3-1').click(() => {
		$.ajax({
			url: '3',
			data: {
				userId: 2,
				userName: '한아름',
				birthday: '2030-10-12'
			},
			// method: 'get'    // 실패
			// method: 'post'   // 실패
			// method: 'put'    // 실패
			// method: 'patch'  // 실패
			// method: 'delete' // 실패
		});
	});
	
	$('#3-2').click(() => {
		$.ajax({
			url: '3',
			data: JSON.stringify({
				userId: 3,
				userName: '양승일',
				birthday: '2035-10-10'
			}),
			contentType: 'application/json',
			// method: 'get'    // 실패
			// method: 'post'   // 성공
			// method: 'put'    // 성공
			// method: 'patch'  // 성공
			method: 'delete' // 성공
		});
	});
}

$(init);
</script>
<div class='container'>
	<div class='row'>
		<div class='col'>
			<button type='button' class='btn btn-outline-primary' id='1'>1</button>
			<button type='button' class='btn btn-outline-secondary' id='2'>2</button>
			<button type='button' class='btn btn-outline-success' id='3-1'>3-1</button>
			<button type='button' class='btn btn-outline-warning' id='3-2'>3-2</button>
		</div>
	</div>
</div>