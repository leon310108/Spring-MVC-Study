<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>upload page</title>
</head>
<body>
	<div class="upload">
		<form action="upload" enctype="multpart/form-data" method="post">
			<input type="file" name="file" /> <br/><input type="submit" value="上传">
		</form>
	</div>
</body>
</html>