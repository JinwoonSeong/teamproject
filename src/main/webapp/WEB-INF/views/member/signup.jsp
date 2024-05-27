<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<div class="container">
    <h2>회원가입</h2>
    <% if (request.getAttribute("signupSuccess") != null) { %>
        <p style="color: green;">회원가입 성공!</p>
    <% } else if (request.getAttribute("signupFailure") != null) { %>
        <p style="color: red;">회원가입 실패!</p>
    <% } %>
    <form action="${pageContext.request.contextPath}/signup" method="post">
        <div class="form-group">
            <label for="id">아이디</label>
            <input type="text" id="id" name="id" required>
        </div>
        <div class="form-group">
            <label for="password">패스워드</label>
            <input type="text" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="phone">연락처</label>
            <input type="text" id="phone" name="phone" required>
        </div>
        <button type="submit">가입하기</button>
    </form>
</div>

</body>
</html>
