<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
document.addEventListener("DOMContentLoaded", function () {
	list();
	
	document.getElementById("btnSave").addEventListener("click", insert);
	document.getElementById("btnSearch").addEventListener("click", list);
});

function list() {
	const search_option = document.getElementById("search_option").value;
	const search = document.getElementById("search").value;
	
	const params = new URLSearchParams({search_option, search});
	
	fetch(`<%=request.getContextPath()%>/memo_servlet/list.do?${params}`)
	.then(response => response.text())
	.then(html => {
		document.getElementById("result").innerHTML = html;
	});
}

function insert() {
	const writer = document.getElementById("writer").value;
	const memo = document.getElementById("memo").value;
	
	const params = new URLSearchParams({writer, memo});
	
	fetch("<%=request.getContextPath()%>/memo_servlet/insert.do")
	.then(response => {
		return response.text();
	})
	.then(() => {
		list();
		document.getElementById("writer").value = "";
		document.getElementById("memo").value = "";
	});
}
</script>
</head>
<body>
이름 : <input id="writer" size="10"><br>
메모 : <input id="memo" size="40">
<input type="button" id="btnSave" value="확인"><br>
<select id="search_option">
	<option value="writer">이름</option>
	<option value="memo">메모</option>
	<option value="writer_memo">이름+메모</option>
</select>
<input type="text" id="search" value="${search}">
<input type="button" id="btnSearch" value="조회">
<div id="result"></div>
</body>
</html>