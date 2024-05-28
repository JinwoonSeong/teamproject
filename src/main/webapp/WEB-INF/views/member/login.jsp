<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/layout.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/table.css">
<script>
	let checkForm = function() {
		let f = document.loginForm
		let id = f.id
		let password = f.password
		
		if(id.value === '') {
			alert('ID를 입력해주세요')
			id.focus()
			return false
		}
		
		if(password.value === '') {
			alert('패스워드를 입력해주세요')
			password.focus()
			return false
		}
		return true
	}
</script>
</head>
<body>

	<%-- <header>
		<jsp:include page="../include/topMenu.jsp"/>
	</header> --%>
	<section>
<div align="center">
		<hr>
		<h2>로그인</h2>
		<hr>
		<br>
		<form method="post" onsubmit="return checkForm()" name="loginForm">
			<table border="1">
				<tr>
					<th>ID</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>PASSWORD</th>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="로그인">
		</form>
	</div>
	</section>
	<footer>
		<strong>2024년 서버구축실습중...</strong>
	</footer>
</body>
</html>








