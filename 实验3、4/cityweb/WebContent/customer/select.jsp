<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>联系人</th>
		</tr>
		<c:forEach var="user" items="${ list }">
			<tr>
				<th>${ user.id }</th>
				<th>${ user.name }</th>
				<th>${ user.person }</th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>