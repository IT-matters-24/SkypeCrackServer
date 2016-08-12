<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
	<head>
		<title>宝宝淘论坛登录</title>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<script src="//cdn.bootcss.com/jquery/3.0.0/jquery.js"></script>
	</head>
	<body>
this is  test for two post methods
		<form action="/dealMsg2.do" method="post" accept-charset="utf-8">
			id：
			<input type="text" name="id" id="jenis">
			<br>
		body_xml：
			<input type="text" name="body_xml" id="model">
			<br>
			<input type="submit" value="login" />
			<input type="reset" value="reset" />
			<input type="button" value="send" id="send" />
		</form>
		<script>
			$(function(){
				console.log(1);
			})
		</script>
		<script>
			$('#send').click(function(event) {
				var id = $('#jenis').val();
				var body_xml = $('#model').val();
				var json = { "id" : id, "body_xml" : body_xml};
				$.ajax({
					url: '/dealMsg1.do',
					data: JSON.stringify(json),
					type: "POST",

					beforeSend: function(xhr) {
						xhr.setRequestHeader("Accept", "application/json");
						xhr.setRequestHeader("Content-Type", "application/json;charset=utf-8");
					},
					success: function(data){
						alert(data);
					}
				});

				//event.preventDefault();
			});
		</script>

	</body>
</html>
