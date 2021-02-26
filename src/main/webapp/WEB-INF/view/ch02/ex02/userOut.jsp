<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

${user.age}살인, ${user.name}은 약관에 동의
<c:choose>
	<c:when test='${agree == "on"}'>
		합니다.
	</c:when>
	<c:otherwise>
		안 합니다.
	</c:otherwise>
</c:choose>