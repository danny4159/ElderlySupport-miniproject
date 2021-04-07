<%@page import="com.danny.elder.bean.Elderly"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		text-align: center;}
</style>
</head>
<body>
	<div>
	<b>${elderly.e_name} 어르신</b>과  <b>${volunteer.v_name} 봉사자</b>의 매칭이 완료되었습니다.
	<br><br>
	<a href="./menu">돌아가기</a><br><br>
	</div>

</body>
</html>