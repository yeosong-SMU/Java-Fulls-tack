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
String name="김철수";
int year=1990;
int age = 2025 - year;
%>
이름: <%=name %><br>
연도: <%=year %><br>
나이: <%=age %>
</body>
</html>