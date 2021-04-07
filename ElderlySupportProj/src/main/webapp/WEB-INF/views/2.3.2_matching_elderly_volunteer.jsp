<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div#container {
	position: relative;
	top: 10%;
	left: 25%;
}
table {
	width: 50%;
	border: 1px solid #444444;
	border-collapse: collapse;
}

th, td {
	border: 1px solid #444444;
	padding: 3px;
}

th {
	background-color: #c8c8c8;
}
</style>
</head>
<body>
	<form action="./matchvolunteer3" method="post" id="matchvolunteer2">
		<div id="container">
		<h3>노인 - 봉사자 매칭</h3>

		<h5>노인</h5>
		<table>
			<tr>
				<th>노인 ID</th>
				<th>노인 이름</th>
				<th>노인 주소</th>
				<th>희망활동종료일</th>
				<th>성별</th>
				<th>희망분야1</th>
				<th>희망분야2</th>
			</tr>
			<tr>
				<td>${elderly.e_id}</td>
				<td>${elderly.e_name}</td>
				<td>${elderly.e_address}</td>
				<td>${elderly.e_period}</td>
				<td>${elderly.e_sex}</td>
				<td>${elderly.e_hope1}</td>
				<td>${elderly.e_hope2}</td>
			</tr>
		</table>
<br>
		<h5>봉사자</h5>
		<table>
			<tr>
				<th>봉사자 ID</th>
				<th>봉사자 이름</th>
				<th>봉사자 주소</th>
				<th>희망활동종료일
				</th>
				<th>성별</th>
				<th>특기1</th>
				<th>특기2</th>
				<th>포인트</th>
			</tr>
			<c:forEach var="volunteer" items="${volunteerList }">
				<tr>
					<td>${volunteer.v_id}</td>
					<td>${volunteer.v_name}</td>
					<td>${volunteer.v_address}</td>
					<td>${volunteer.v_period}</td>
					<td>${volunteer.v_sex}</td>
					<td>${volunteer.v_expertise1}</td>
					<td>${volunteer.v_expertise2}</td>
					<td>${volunteer.point}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<table>
			<tr>
				<td><b>매칭할 봉사자 ID</b></td>
				<td><input type="text" name="v_id_match" /></td>
				<td><input type="submit" value="매칭 결정" /></td>
			</tr>
			<tr>
				<td><input type="hidden" name="e_id_match"
					value="${elderly.e_id}"></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		<br><br><a href="./menu">돌아가기</a><br> <br>
		</div>
	</form>

</body>
</html>