<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//session.removeAttribute("id");    //세션변수 1개를 삭제한다.
//session.removeAttribute("passwd");
session.invalidate();  //세션 초기화. 모든 세션 변수들을 삭제한다.
%>
세션이 초기화되었습니다.
<a href="view_session.jsp">세션 확인</a>
</body>
</html>