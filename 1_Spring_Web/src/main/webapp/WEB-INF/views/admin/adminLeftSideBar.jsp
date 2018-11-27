<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#top-mark{
		width : 100%;
		height : 10%;
		text-align: center;
	}
	#middle-content{
		width : 100%;
		height : 90%;
		text-align: center;
	}
	.bar-common{
		background-color : black;
	}
	#top-mark img{
		margin-top : 1%;
		width :70%;
		height : 100%;
	}
	#mode_list>li>a{
		font-size : 25px;
		color : white;
		text-decoration: none;
		line-height: 80px;
	}
	#middle-content a:hover{
		color : yellow;
	}
	#mode_list{
		padding : 0;
		margin : 0;
	}
	
</style>
</head>
<body>
<div id="top-mark" class="bar-common"><a href="/index.jsp"><img src="/resources/png/03_KH정보교육원_원형흰색.png"></img></a></div>
<div id="middle-content" class="bar-common">
	<br><br>
	<ul id="mode_list">
	<li><a href="">교육과정</a></li>
	<li><a href="">교육원소개</a></li>
	<li><a href="">취업지원센터</a></li>
	<li><a href="">채용정보</a></li>
	<li><a href="">프로젝트</a></li>
	<li><a href="">커뮤니티</a></li>
	<li><a href="">수강후기</a></li>
	<li><a href="">오시는길</a></li>
	<li><a href="/admin/allMemberList.kh">전체회원</a></li>
	<li><a href="/admin/allLogManagementPage.kh">로그관리</a></li>
	</ul>
	
</div>
</body>
</html>










