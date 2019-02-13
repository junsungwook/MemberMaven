<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입
<hr>
<form action="myInsert.my" method="post">
아이디 : <input type="text" id="id" name="id"><br>
비밀번호 : <input type="password" id="pass" name="pass"><br>
이름: <input type="text" id="name" name="name"><br>
주소 : <input type="text" id="addr" name="addr"><br>
메모 : <textarea rows="8" cols="8" id="memo" name="memo"></textarea><br>
<input type="submit" value="가입">
</form>

<a href="myList.my">전체보기</a>
</body>
</html>