<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	#footer_bar1{
		hieght : 100%;
		float : left;
		width : 80%;
		
	}
	#footer_bar2{
		float : left;
		width : 20%;
	}
	#bar {
		margin : 0;
		padding : 0;
		height : 100%;
	}
	#bar li{
		box-sizing : border-box;
		float : left;   /* 각 요소들을 왼쪽부터 배치 */
		list-style-type: none;  /* li 속성에 있는 점 없애기*/
		text-align: center;  /* 글자 가운데로 정렬 */
		width:13%;
		height : 100%;
	}
	#bar li a{
		 text-decoration: none; /* 밑 줄 삭제 */
		 line-height : 50px;
		 color : white;
		 text-shadow: 0px 1px 0px #cccccc;  /* 글자 새도우 효과 (밝은 회색) */	
	}
	#bar li a:hover{
		
		 color : yellow;
		 text-shadow: 0px 1px 0px yellow;  /* 글자 새도우 효과 (밝은 회색) */	
	}
	
	#bar span{
		box-sizing : border-box;
		float : left;   /* 각 요소들을 왼쪽부터 배치 */
		list-style-type: none;  /* li 속성에 있는 점 없애기*/
		text-align: center;  /* 글자 가운데로 정렬 */
		width:2%;
		height : 100%;
		line-height : 50px;
		
	}
	#footer_bar2 a{
		color:white;
		line-height : 50px;
		float:right;
		text-decoration: none; /* 밑 줄 삭제 */
		
	}
	
	#footer_bar2 a:hover{
		color : red;
		
	}
	 
	
</style>

<jsp:include page="/resources/common/main_popup_terms.jsp"></jsp:include>

<div class="navbar navbar-inverse">
<div id="footer_bar1">
	<ul id="bar">
		
			<li><a data-toggle="modal" data-target=".bs-example-modal-lg" style="padding-left: 0;">이용약관</a>  </li> <span style="color:white;">|</span>
			<li><a href="">개인정보취급방침</a>  </li> <span style="color:white;">|</span>
			<li><a href="">인재채용문의</a>  </li> <span style="color:white;">|</span>
			<li><a href="">강사채용</a>  </li> <span style="color:white;">|</span>
			<li><a href="">훈련비 게시</a></li>
	</ul>
</div>
<div id="footer_bar2">
		<a href="javascript:scrollTo(0, 0);">TOP ▲ </a>
</div>
	
</div>		
			
</body>
</html>