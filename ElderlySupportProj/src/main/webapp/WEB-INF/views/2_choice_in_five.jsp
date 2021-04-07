<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div#container {
	position: absolute;
	top: 10%;
	left: 37%;
}

div#top {
	text-align: center;
	width: 200px;
	height: 180px;
	border: 2px solid black;
	float: left;
	margin-right: 10px;
	text-align: center;
}

div#bottom {
	width: 414px;
	height: 80px;
	border: 2px solid black;
	float: left;
	margin-top:2px;
	margin-right: 10px;
	text-align: center;
}
</style>
</head>
<body>
	<div id="container">
		<div id="top">
		<h3>노인</h3><br>
			<a href="./createelderly">노인 신규 등록</a><br> <br> 
			<a href="./updateelderly">노인 정보 수정</a><br> <br>
		</div>
		<div id="top">
		<h3>봉사자</h3><br>
			<a href="./createvolunteer">봉사자 신규 등록</a><br> <br> 
			<a href="./updatevolunteer">봉사자 정보 수정</a><br> <br>
		</div>
		<br> <br> <br> <br> <br>
		<div id="bottom">
			<br> <a href="./matchvolunteer">노인 - 봉사자 매칭</a><br> <br>
		</div>
	</div>
</body>
</html>