<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
	position: relative;
	top: 10%;
	left: 37%;
}
</style>
</head>
<body>
	<form action="createvolunteercomplete" method="post">
		<div>
			<h3>봉사자 신규 등록</h3>
			<table>
				<tr>
					<td>봉사자 ID</td>
					<td><input type="text" name="v_id" /></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="v_name" /></td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="radio" value="남" name="v_sex" /> 남&nbsp; <input
						type="radio" value="여" name="v_sex" /> 여</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="v_tel_no" /></td>
				</tr>
				<tr>
					<td>희망 활동 종료일</td>
					<td><input type="date" value="2099-12-31" name="v_period" /></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="v_address" /></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input type="date" name="v_birth_date" /></td>
				</tr>
				<tr>
					<td>특기 1</td>
					<td><select name="v_expertise1">
							<option value="none">선택하세요</option>
							<option value="요리">요리</option>
							<option value="미술치료">미술치료</option>
							<option value="미용">미용</option>
							<option value="건강관리">건강관리</option>
							<option value="말동무">말동무</option>
					</select></td>
				</tr>
				<tr>
					<td>특기 2</td>
					<td><select name="v_expertise2">
							<option value="none">선택하세요</option>
							<option value="요리">요리</option>
							<option value="미술치료">미술치료</option>
							<option value="미용">미용</option>
							<option value="건강관리">건강관리</option>
							<option value="말동무">말동무</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="봉사자 등록" /></td>
				</tr>
			</table>

			<br><br><a href="./menu">돌아가기</a><br> <br>
		</div>
	</form>
</body>
</html>