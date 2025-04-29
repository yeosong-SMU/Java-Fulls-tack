<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="board.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function view(no) {
	document.form1.no.value = no;
	document.form1.submit();
}
</script>
</head>
<body>
<h1>게시물 목록</h1>
<a href="<%=request.getContextPath()%>/board/form.jsp">글쓰기</a>
<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>등록일자</th>
	</tr>
<%
Map map=(Map)request.getAttribute("map");
List<BoardDTO> items=(List)map.get("list");
for(BoardDTO dto : items) {
%>
	<tr>
		<td style="text-align:center"><%=dto.getNo()%></td>
		<td style="text-overflow:ellipsis; width:200px;">
			<a href="#" onclick="view('<%=dto.getNo()%>')"><%=dto.getTitle()%></a>
		</td>
		<%-- <td><%=dto.getContent()%></td> --%>
		<td style="text-overflow:ellipsis; width:90px;"></td>
		<td><%=dto.getReg_date()%></td>
	</tr>
<%
}
%>
</table>
<form name="form1" method="post" action="<%=request.getContextPath()%>/board_servlet/view.do">
	<input type="hidden" name="no">
</form>
</body>
</html>