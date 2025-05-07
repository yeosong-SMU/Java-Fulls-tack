<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.Constants" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 외부 jsp 파일을 불러온다. -->
<%@ include file="sub.jsp" %>
<style>
body{
	background: <%=background%>;
}
</style>
</head>
<body>
<h2>max: <%=Constants.MAX%></h2>
<h2>msg: <%=msg%></h2>
</body>
</html>