<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
			<span>用户信息</span>
			<table>
				<tr>
					<td>userid</td>
					<td>用户名</td>
					<td>密码</td>
				</tr>
<c:forEach var="person" items="${persons }">
				<tr>
					<td width="15%">${person.userId}</td>
					<td width="15%">${person.userName}</td>
					<td width="15%">${person.passWorld}</td>
				</tr>
</c:forEach>
			</table>
	
	
</body>
</html>
