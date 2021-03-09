<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<script src='http://code.jquery.com/jquery-3.5.1.min.js'></script>
<script>
function init() {
	$('#strBtn').click(() => {
		$.ajax({
			url: 'str',
			data: 'aiden',
			method: 'put'
		}).done(result => console.log(result));
	});
	
	$('#intBtn').click(() => {
		$.ajax({
			url: 'int',
			data: '12',
			method: 'put'
		}).done(result => console.log(result + 10));
	});
	
	$('#dateBtn').click(() => {
		$.ajax({
			url: 'date',
			data: '2025-05-12',
			method: 'put'
		}).done(result => console.log(result));
	});
	
	$('#booleanBtn').click(() => {
		$.ajax({
			url: 'boolean',
			data: 'true',
			method: 'put'
		}).done(result => console.log(result && false));
	});
}

$(init);
</script>
<div class='container'>
	<div class='row'>
		<div class='col'>
			<button type='button' class='btn btn-outline-primary' id='strBtn'>String</button>
			<button type='button' class='btn btn-outline-secondary' id='intBtn'>int</button>
			<button type='button' class='btn btn-outline-success' id='dateBtn'>LocalDate</button>
			<button type='button' class='btn btn-outline-warning' id='booleanBtn'>boolean</button>
		</div>
	</div>
</div>