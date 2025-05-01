<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세</title>
<script src="http://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
$(function() {
	$("#btn_previous").click(function() {
		document.form1.action = "<%=request.getContextPath()%>/board_servlet/list.do";
		document.form1.submit();
	});
	
	$("#btnUpdate").click(function() {
		document.form1.action = "<%=request.getContextPath()%>/board_servlet/update.do";
		document.form1.submit();
	});
	
	$("#btnDelete").click(function() {
		if(confirm("삭제할까요?")){
			document.form1.action = "<%=request.getContextPath()%>/board_servlet/delete.do";
			document.form1.submit();
		}
	});
	
	$("#btn_logout").click(function() {
		if(confirm("로그 아웃할까요?")){
			document.form1.action = "<%=request.getContextPath()%>/board_servlet/logout.do";
			document.form1.submit();
		}
	});
});
</script>
<style>
.main-pos{
	position: absolute;
	left: 15%;
	width:70%;
}
.btn-r{
	text-align: right;
	margin-bottom: 5px;
}
table, td, th {
	border-collapse: collapse;
	border: 1px solid black;
}
table{
	width: 100%;
}
</style>
</head>
<body>
<div class="main-pos">
	<h1 style="text-align: center;">게시판</h1>
	
	<div class="btn-r">
		<button type="button" id="btn_previous" onclick="">이전</button>
		<button type="button" id="btnUpdate">수정</button>
		<button type="button" id="btnDelete">삭제</button>
		<button type="button" id="btn_logout">로그 아웃</button>
	</div>
	<%
	BoardDTO dto = (BoardDTO) request.getAttribute("dto");
	%>
	<form name="form1" method="post">
	<table>
		<tr>
			<td>번호</td>
			<td><%=dto.getNum()%></td>
		</tr>
	 	<tr>
			<td>제목</td>
			<td><input name="title" value="<%=dto.getTitle()%>"></td>
	 	</tr>
	 	<tr>
			<td>내용</td>
			<td><input name="content" value="<%=dto.getContent()%>" size="50"></td>
	 	</tr>
	 	<tr>
			<td>등록일자</td>
			<td><%=dto.getReg_date()%></td>
	 	</tr>
	 	<tr>
			<td colspan="2" align="center">
				<input type="hidden" name="id" value="<%=dto.getId()%>">
			</td>
	 	</tr>
	</table>
	</form>
</div>
</body>
</html>