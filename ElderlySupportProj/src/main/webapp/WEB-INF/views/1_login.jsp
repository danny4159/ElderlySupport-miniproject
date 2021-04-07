<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
	text-align: center;
}

table {
	margin-left: auto;
	margin-right: auto;
}
#login_bt{
	float:right;
}
</style>
</head>
<body>
	<form action="./menu" method="post" id="login">
		<div>
			<h1>독거노인 매칭 시스템</h1>
			<br>
			<h2>복지사 로그인</h2>
			<table>
				<tr>
					<td>복지사 ID</td>
					<td><input type="text" name="s_id" /></td>
				</tr>

				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="s_password" /></td>
				</tr>
				<tr>
					<td></td>
					<td id='login_bt'><input type="submit" value="로그인" /></td>
				</tr>

			</table>
		</div>
	</form>
</body>
</html>