<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>HttpMessageConverter</title>
</head>
<body>
	<div id="resp"></div>
	<input type="button" onclick="req();" value="请求" />
	<script type="image/jpg" src="file:d:/h002.jpg"></script>
	<script>
		function req() {
			$.ajax({
				url : "convert",
				data : "1-zhangsan",
				type : "POST",
				contentType : "application/x-wisely",
				success : function(data) {
					$("#resp").html(data);
				}
			});
		}
	</script>
</body>
</html>