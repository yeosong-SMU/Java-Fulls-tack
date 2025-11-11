<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
document.addEventListener("DOMContentLoaded", function() {
	const btnUpdate = document.getElementById("btnUpdate");
	const btnDelete = document.getElementById("btnDelete");
	const writer = document.getElementById("writer");
	const memo = document.getElementById("memo");
	const form = document.forms["form1"];
	
	btnUpdate.addEventListener("click", function () {
		if(writer.value.trim() === "") {
			alert("이름을 입력하세요");
			writer.focus();
			return;
		}
		if(memo.value.trim() === ""){
			alert("메모를 입력하세요");
			memo.focus();
			return;
		}
		form.action = "<%=request.getContextPath()%>/memo_servlet/update.do";
		form.submit();
	});
	
	btnDelete.addEventListener("click", function() {
		if(confirm("삭제하시겠습니까?")){
			form.action = "<%=request.getContextPath()%>/memo_servlet/del.do";
			form.submit();
		}
	});
});
</script>
</head>
<body>
<h2>메모 수정</h2>
<form name="form1" method="post">
<table border="1" style="width: 550px">
	<tr>
		<td>이름</td>
		<td><input type="text" name="writer" id="writer" value="${map.WRITER}"></td>
	</tr>
	<tr>
		<td>메모</td>
		<td><input type="text" name="memo" id="memo" size="60" value="${map.MEMO}"></td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<input type="hidden" name="idx" value="${map.IDX}">
			<input type="button" value="수정" id="btnUpdate">
			<input type="button" value="삭제" id="btnDelete">
</table>
</form>
</body>
</html>