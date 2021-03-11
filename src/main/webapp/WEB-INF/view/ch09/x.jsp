<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function print(msg){
	$('#msg').html('<i>' + msg + '</i>');
}

function clear() {
	$('ul').empty();
	$('#msg').text('');
}

function init() {
	$('#addNumBtn').click(() => {
		clear();
		$.ajax('x/addNum')
			.done(result => print(result + '건을 추가했습니다.'));
	});
	
	$('#addNum2Btn').click(() => {
		clear();
		$.ajax('x/addNum2')
			.fail(err => print(err.statusText + ': addNum2'));		
	});
	
	$('#addNum2NoXBtn').click(() => {
		clear();
		$.ajax('x/addNum2NoX')
			.fail(err => print(err.statusText + ': addNum2NoX'));
	});
	
	$('#addNum3Btn').click(() => {
		clear();
		$.ajax('x/addNum3')
			.always(err => print(err.statusText + ': addNum3'));
	});
	
	$('#listBtn').click(() =>{
		clear();
		$.ajax('x/getNums')
			.done(nums => $(nums).each(
					(idx, num) => $('ul').append('<li>' + num + '</li>')));
	});
}

$(init);
</script>
<div class='container'>
	<div class='row'>
		<div class='col'>			
			<button type='button' class='btn btn-primary' id='addNumBtn'>addNum</button>
			<button type='button' class='btn btn-warning' id='addNum2Btn'>addNum2</button>
			<button type='button' class='btn btn-danger' id='addNum2NoXBtn'>addNum2NoX</button>
			<button type='button' class='btn btn-warning' id='addNum3Btn'>addNum3</button>
			<button type='button' class='btn btn-info' id='listBtn'>list</button>			
		</div>
	</div>
	<div class='row mt-3'>
		<div class='col'>
			<ul></ul>
			<span id='msg'></span>
		</div>
	</div>
</div>