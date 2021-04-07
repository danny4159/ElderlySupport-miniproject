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
	<form action="createelderlycomplete" method="post">
		<div>
			<h3>노인 신규 등록</h3>
			<table>
				<tr>
					<td>노인 ID</td>
					<td><input type="text" name="e_id" /></td>
				</tr>	
				<tr>
					<td>이름</td>
					<td><input type="text" name="e_name" /></td>
				</tr>
				<tr>
					<td>소득</td>
					<td><input type="text" name="e_income" /></td>
				</tr>
				<tr>
					<td>성별</td>
					<td><input type="radio" value="남" name="e_sex" /> 남&nbsp; <input
						type="radio" value="여" name="e_sex" /> 여</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="e_tel_no" /></td>
				</tr>
				<tr>
					<td>비상연락망</td>
					<td><input type="text" name="e_emergency_no" /></td>
				</tr>
				<tr>
					<td>희망 활동 종료일</td>
					<td><input type="date" value="2099-12-31" name="e_period" /></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="e_address" /></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input type="date" name="e_birth_date" /></td>
				</tr>
				<tr>
					<td>희망 분야 1</td>
					<td><select name="e_hope1">
							<option value="none">선택하세요</option>
							<option value="요리">요리</option>
							<option value="미술치료">미술치료</option>
							<option value="미용">미용</option>
							<option value="건강관리">건강관리</option>
							<option value="말동무">말동무</option>
					</select></td>
				</tr>
				<tr>
					<td>희망 분야 2</td>
					<td><select name="e_hope2">
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
					<td><input type="submit" value="노인 등록" /></td>
				</tr>
			</table>
			
			<br><br> <a href="./menu">돌아가기</a><br> <br>
		</div>
	</form>
</body>
</html>