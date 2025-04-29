<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
$(function() {
	
	$("#btnUpdate").click(function() {
		if(confirm("저장할까요?")){
			document.form1.action = "<%=request.getContextPath()%>/board_servlet/update.do";
			document.form1.submit();
		}
	});
	
	$("#btnDelete").click(function() {
		if(confirm("삭제할까요?")){
			document.form1.action = "<%=request.getContextPath()%>/board_servlet/delete.do";
			document.form1.submit();
		}
	});
});
</script>
</head>
<body>
<%
BoardDTO dto = (BoardDTO) request.getAttribute("dto");
%>
<form name="form1" method="post">
<table border="1">
	<%-- <tr>
		<td>번호</td>
		<td><%=dto.getNo()%></td>
	</tr> --%>
 	<tr>
		<td>등록일자</td>
		<td><%=dto.getReg_date()%></td>
 	</tr>
 	<tr>
		<td style="width:60px; height:20px;">제목</td>
		<td style="width:500px;"><input name="title" value="<%=dto.getTitle()%>"></td>
 	</tr>
 	<tr>
		<td>내용</td>
		<td><input name="content" value="<%=dto.getContent()%>"></pre></td>
 	</tr>
 	<tr>
		<td colspan="2" align="center">
			<input type="hidden" name="no" value="<%=dto.getNo()%>">
			<button type="button" id="btnUpdate">저장</button>
			<button type="button" id="btnDelete">삭제</button>
		</td>
 	</tr>
</table>
</form>
</body>
</html>