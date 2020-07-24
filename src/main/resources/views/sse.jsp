<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SSE DEMO</title>
</head>
<body>
	<div id="msgFrompPush"></div>
	<script type="text/javascript"
		src="<c:url value="assets/js/jquery.js" />"></script>
	<script type="text/javascript">
if (!!window.EventSource){
	var source=new EventSource('push');
	s=' ';
	source.addEventListener('message',function(e){
		s+=e.data+"<br/>";
		$("#msgFrompPush").html(s);
	}); 
	source.addEventListener('open',function(e){
		if(e.readyState==EventSource.CLOSED){
			console.log("连接关闭")；
		}else{
			console.log(e.readyState);
		}
	},false);
	}else{
		console.log("你的浏览器不支持SSE")；
	}
</script>
</body>
</html>