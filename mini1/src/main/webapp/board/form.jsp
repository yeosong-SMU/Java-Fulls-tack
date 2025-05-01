<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 추가</title>
<script src="http://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
$(function() {
	$("#btn_previous").click(function() {
		document.form1.action = "<%=request.getContextPath()%>/board_servlet/list.do";
		document.form1.submit();
	});
	
	$("#btn_logout").click(function() {
		if(confirm("로그 아웃할까요?")){
			document.form1.action = "<%=request.getContextPath()%>/board_servlet/logout.do";
			document.form1.submit();
		}
	});
});
</script>
</head>
<body>
<form name="form1" action="<%=request.getContextPath()%>/board_servlet/join.do" method="post">
	<button type="button" id="btn_previous" onclick="">이전</button>
	<input type="submit" value="확인">
	<button id="btn_logout" onclick="">로그 아웃</button>
	<table id="table1" border="1" style="width:50%;">
		<tr>
			<th>제목</th>
			<td><input name="title"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><input name="content"></td>
		</tr>
	</table>
</form>
</body>
</html>