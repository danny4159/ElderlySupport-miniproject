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
	<form action="updatevolunteer2" method="post"
		id="updatevolunteer2">
		<div id="container">
			<h3>봉사자</h3>

			<table>
				<tr>
					<th>봉사자 ID</th>
					<th>이름</th>
					<th>성별</th>
					<th>전화번호</th>
					<th>희망 활동 종료일</th>
					<th>주소</th>
					<th>생년월일</th>
					<th>희망분야1</th>
					<th>희망분야2</th>
				</tr>
				<c:forEach var="volunteer" items="${volunteerList }">
					<tr>
						<td>${volunteer.v_id}</td>
						<td>${volunteer.v_name}</td>
						<td>${volunteer.v_sex}</td>
						<td>${volunteer.v_tel_no}</td>
						<td>${volunteer.v_period}</td>
						<td>${volunteer.v_address}</td>
						<td>${volunteer.v_birth_date}</td>
						<td>${volunteer.v_expertise1}</td>
						<td>${volunteer.v_expertise2}</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<table>
				<tr>
					<td><b>변경할 봉사자 ID</b></td>
					<td><input type="text" name="v_id_update" /></td>
					<td><input type="submit" value="수정하기" /></td>
				</tr>
			</table>
			
			<br><br> <a href="./menu" id="menu">돌아가기</a><br> <br>
		</div>
	</form>
</body>
</html>