<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>회원가입</title>
</head>
<body>

<style>
	#container{
    	margin-top : 20px;
    	margin-left : 300px;
    	width : 1200px;
    	height : 900px;
    	
    }
    #contents-2{
  
    	padding-left: 150px;
    	padding-right: 150px;
    	text-align: left; width : 100%;
    	height : 10%;
    	
    }
    #contents-3{
    	padding-left: 150px;
    	padding-right: 150px;
    	text-align: left; width : 100%;
    	height : 75%;
    }
    #contents-2 div{
    	border : 2px solid blue;
    	width : 100%;
    	height : 50px;
    }
</style>
<div id="container"  align="center">
    <div id="contents-1">
            	<a href="/index.jsp"><img height=80px width=300px src="/resources/png/01_KH정보교육원_가로컬러.png"/></a><br>
    </div>
	<br><br>
    <div id="contents-2" >
			<span style="font-size:20px;"><b>KH정보교육원</b>을 찾아주셔서 감사합니다.</span><br>
			<span>회사는 <b><u>회원가입, 상담, 서비스 신청 등을 위해 아래와 같은 개인정보를 수집</u></b>하고 있습니다.</span><br>
			<hr style="border:2px solid black;">
			
			<form>
			<span>아이디</span><br>
			<div><input type="text" size="100" placeholder="가입할 ID를 작성하세요"/></div>
			</form>
	</div>
	<div id="contents-3" >    

	</div>
		
</div>



<div id="footer_bar">
			<jsp:include page="/resources/common/main_footer_bar.jsp"></jsp:include>
		</div>
		<br>
		<div id="footer">
			<jsp:include page="/resources/common/main_footer.jsp"></jsp:include>
		</div>
</body>
</html>