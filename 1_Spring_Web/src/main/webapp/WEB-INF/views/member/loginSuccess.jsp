<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>로그인 성공</title>
</head>

<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:choose>
				<c:when test="${sessionScope.member !=null}">
						<script>	
							alert("로그인 성공");
							location.href="/index.jsp";
						</script>
				</c:when>
				<c:otherwise>
					
						<script>	
							alert("정지되거나 혹은 탈퇴된 계정 입니다.");
							location.href="/index.jsp";
						</script>
				
				</c:otherwise>
			</c:choose>
	
</body>
</html>