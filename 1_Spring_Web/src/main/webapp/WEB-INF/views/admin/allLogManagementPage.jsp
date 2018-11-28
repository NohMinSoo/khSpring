<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>로그</title>
</head>
<body>

<style>
	div{
		box-sizing:border-box;
	}
	#contents{
		width : 90%;
		height: 1000px;
	}
	#left{
		width : 12%;
		height : 100%;
		float : left;
	}
	#bar{
		width : 162px;
		height : 1000px;
		float : left;
		position: fixed;
	}
	#right{
		width : 88%;
		height : 100%;
		float : left;
	}
</style>

<div id="contents">
	<div id="left">
		<div id="bar"><jsp:include page="./adminLeftSideBar.jsp"></jsp:include></div>
	</div>
	<div id="right">
	</div>
</div>
</body>
</html>