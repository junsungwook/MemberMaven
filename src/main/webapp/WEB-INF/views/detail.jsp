<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<form action="myUpdate.my" method="post">
아이디 : <input type="text" id="id" name="id" class="text" value="${user.id }"><br>
비밀번호 : <input type="text" id="pass" name="pass" class="text" value="${user.pass }"><br>
이름: <input type="text" id="name" name="name" class="text" value="${user.name }"><br>
주소 : <input type="text" id="addr" name="addr "class="text" value="${user.addr }"><br>
메모 : <textarea rows="8" cols="8" id="memo" class="textarea" name="memo">${user.memo }</textarea><br>
<input type="submit" value="수정" class="btn">
</form>
</div>
</body>
</html>