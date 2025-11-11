<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
document.addEventListener("DOMContentLoaded", function () {
	const chkAll = document.getElementById("chkAll");
	const btnAllDel = document.getElementById("btnAllDel");
	
	chkAll.addEventListener("change", function() {
		const checkboxes = document.querySelectorAll("input[name='idx']");
		checkboxes.forEach(cb => cb.checked = chkAll.checked);
	});
	
	btnAllDel.addEventListener("click", function () {
		const checkboxes = document.querySelectorAll("input[name='idx']");
		const checkedCount = Array.from(checkboxes).filter(cb => cb.checked).length;
		
		if(checkedCount === 0) {
			alert("삭제할 메모를 선택하세요.");
			return;
		}
		
		const form = document.forms["form1"];
		form.action = "<%=request.getContextPath()%>/memo_servlet/delete_all.do";
		form.submit();
	});
});

function memo_del(idx) {
	location.href = "<%=request.getContextPath()%>/memo_servlet/del.do ? idx=" + idx;
}
</script>
</head>
<body>
<form method="post" name="form1">
<table border="1">
	<tr>
		<th><input type="checkbox" id="chkAll"></th>
		<th>번호</th>
		<th>이름</th>
		<th>메모</th>
		<th>날짜</th>
		<th><input type="button" value="선택삭제" id="btnAllDel"></th>
	</tr>
	<c:forEach var="row" items="${list}">
	<tr>
		<td><input type="checkbox" name="idx" value="${row.IDX}"></td>
		<td>${row.IDX}</td>
		<td>${row.WRITER}</td>
		<td><a href="<%=request.getContextPath()%>/memo_servlet/view.do?idx=${row.IDX}">${row.MEMO}</a></td>
		<td>${row.POST_DATE}</td>
		<td><input type="button" value="삭제" onclick="memo_del('${row.IDX}')"></td>
	</tr>
	</c:forEach>
</table>
</form>
</body>
</html>