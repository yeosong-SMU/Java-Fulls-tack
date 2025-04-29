<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/board_servlet/join.do" method="post">
	<!-- 번호 <input name="no"><br> -->
	<h3>게시물 작성하기</h3>
	제목 <input name="title"><br>
	내용 <textarea name="content" cols="40" rows="8">내용을 입력하세요.</textarea>
	<br>
	<!-- 등록일자 <input name="reg_date"><br> -->
	<br>
	<input type="submit" value="확인">
</form>
</body>
</html>