<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ tagliburi ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>${requestScope.memberMyInfo.mNickName} 님의 정보</title>

</head>
<link href="/resources/css/main_css.css" rel="stylesheet" type="text/css">
<body>
	<div id="wrapper">
		
		<div id="navigator">
			<jsp:include page="/resources/common/main_navigator.jsp"></jsp:include>
		</div>
		<div id="contents">
				<center>
					dd
				</center>
		</div>
		<br>
		<div id="footer">
			<jsp:include page="/resources/common/sub_footer.jsp"></jsp:include>
		</div>
	</div>

</body>
</html>