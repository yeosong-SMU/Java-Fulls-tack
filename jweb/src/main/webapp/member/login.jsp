<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
function login(userid, pwd) {
	/* let params = {"userid" : userid, "passwd" : pwd};
	$.ajax({
		type : "post",
		url : "/jweb/login.do",
		data : params,
		success : function(result) {
			$("#result").html(result);
			window.android.setMessage(result);
		}
	}); */
	fetch("/jweb/login.do?userid="+userid+"&passwd="+pwd)
	.then(response => response.text())
	.then(result => {
		$("#result").html(result);
		window.android.setMessage(result);
	});
}
</script>
<title>Insert title here</title>
</head>
<body>

<button type="button" onclick="login('kim', '1234')">login test</button>

<div id="result"></div>
</body>
</html>