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
	left: 32%;
}

table {
	width: 40%;
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
	<form action="updateelderly2" method="post"
		id="updateelderly2">
		<div id="container">
			<h3>노인</h3>

			<table>
				<tr>
					<th>노인 ID</th>
					<th>이름</th>
					<th>소득</th>
					<th>성별</th>
					<th>전화번호</th>
					<th>비상연락망</th>
					<th>희망 활동 종료일</th>
					<th>주소</th>
					<th>생년월일</th>
					<th>희망분야1</th>
					<th>희망분야2</th>
				</tr>
				<c:forEach var="elderly" items="${elderlyList }">
					<tr>
						<td>${elderly.e_id}</td>
						<td>${elderly.e_name}</td>
						<td>${elderly.e_income}</td>
						<td>${elderly.e_sex}</td>
						<td>${elderly.e_tel_no}</td>
						<td>${elderly.e_emergency_no}</td>
						<td>${elderly.e_period}</td>
						<td>${elderly.e_address}</td>
						<td>${elderly.e_birth_date}</td>
						<td>${elderly.e_hope1}</td>
						<td>${elderly.e_hope2}</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<table>
				<tr>
					<td><b>변경할 노인 ID</b></td>
					<td><input type="text" name="e_id_update" /></td>
					<td><input type="submit" value="수정하기" /></td>
				</tr>
			</table>
			
			<br><br> <a href="./menu" id="menu">돌아가기</a><br> <br>
		</div>
	</form>
</body>
</html>