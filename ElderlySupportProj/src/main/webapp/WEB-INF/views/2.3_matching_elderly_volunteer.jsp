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
	<form action="./matchvolunteer2" method="post" id="matchvolunteer1">
		<div id="container">
			<h3>매칭시킬 노인</h3>

			<table>
				<tr>
					<th>노인 ID</th>
					<th>노인 이름</th>
				</tr>
				<c:forEach var="elderly" items="${elderlyList }">
					<tr>
						<td>${elderly.e_id }</td>
						<td>${elderly.e_name }</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<table>
				<tr>
					<td><b>매칭할 노인 ID</b></td>
					<td><input type="text" name="e_id_match" /></td>
					<td><input type="submit" value="봉사자 매칭" /></td>
				</tr>
			</table>
			<br> <a href="./menu" id="menu">돌아가기</a><br>
			<br>
		</div>
	</form>
</body>
</html>