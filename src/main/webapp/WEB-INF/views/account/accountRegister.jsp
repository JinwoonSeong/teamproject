<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="kr.ac.kopo.member.vo.MemberVO" %>
<%@ page import="kr.ac.kopo.account.dao.RandomAccountNumberGenerator" %>

<%
    // 로그인 여부 확인
    MemberVO userVO = (MemberVO) session.getAttribute("userVO");
    if (userVO == null) {
        // 로그인이 되어 있지 않다면 경고창 표시 후 홈페이지로 돌아가기
%>
    <script>
        alert("로그인이 필요한 서비스입니다");
        window.location.href = "<%= request.getContextPath() %>/#!";
        function validatePassword() {
            var passwordInput = document.getElementById("password");
            var password = passwordInput.value;
            var passwordRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,15}$/;

            if (!passwordRegex.test(password)) {
                alert("비밀번호는 영문자, 숫자, 특수 문자의 조합으로 8글자에서 15글자로 입력해주세요.");
                passwordInput.value = "";
                passwordInput.focus();
                return false;
            }
            return true;
        }
    </script>
<%
        return; // 중단
    }
%>
<%
    // 로그인된 사용자의 정보를 세션에서 가져오기
    String customerId = (String) session.getAttribute("id");
%>


<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>계좌 등록</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>계좌 등록 폼</h2>
    <form action="${pageContext.request.contextPath}/accountRegister" method="post">
        <div>
    		<label for="account_num">계좌 번호:</label>
    		<input type="text" id="account_num" name="account_num" value="<%= kr.ac.kopo.account.dao.RandomAccountNumberGenerator.generateRandomAccountNumber() %>" required readonly>
		</div>

        <div>
		    <label for="customer_id">고객 ID:</label>
		    <!-- 세션에서 가져온 고객 ID를 입력 필드에 자동으로 채워넣기 -->
		    <input type="text" id="id" name="id" value="<%= userVO.getId() %>" required readonly>
		</div>

        <div>
            <label for="account_name">계좌명:</label>
            <!-- 계좌명 입력 필드를 비활성화 -->
            <input type="text" id="account_name" name="name" value="<%= userVO.getName() %>" required readonly>
        </div>
        <div>
            <label for="account_password">계좌 비밀번호:</label> 
			<input type="number" id="account_password" name="account_password" required pattern="[0-9]{6}" title="숫자 6자리로 입력해주세요."> [6자리 숫자]
        </div>
        <button type="submit">등록</button>
    </form>
</body>
</html>
