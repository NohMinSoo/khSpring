<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>회원가입</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<body style="background-color: #D5D5D5;">

<style>

	#container{
    	margin-top : 20px;
    	margin-left : 300px;
    	width : 1000px;
    	height : 1300px;
    	
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
    	width : 100%;
    	height : 70px;
    }
     #contents-2 div input{
     	margin : 10px;
     	line-height: 40px;
     }
     .inputSpan{
     	font-size : 20px;
     	font-weight: bolder;
     }
     
     #join{
		background-color : #003399;
		display: block;
		width : 100%;
		height : 80px;
	}
     
</style>
<script>
$(document).ready(function(){
	$('#contents-2 div input').focus(function(){
		$(this).parent().css('border','2px solid #003399');
	});
	$('#contents-2 div input').blur(function(){
		$(this).parent().css('border','2px solid #D5D5D5');
	});
	
});
</script>
<div id="container"  align="center">
    <div id="contents-1">
            	<a href="/index.jsp"><img height=80px width=300px src="/resources/png/01_KH정보교육원_가로컬러.png"/></a><br>
    </div>
	<br><br>
    <div id="contents-2" >
			<span style="font-size:20px;"><b>KH정보교육원</b>을 찾아주셔서 감사합니다.</span><br>
			<span>회사는 <b><u>회원가입, 상담, 서비스 신청 등을 위해 아래와 같은 개인정보를 수집</u></b>하고 있습니다.</span><br>
			<hr style="border:2px solid black;">
			
			
			<form id="joinForm">
			<span class="inputSpan">아이디</span><br>
			<div><input type="text" size="90" placeholder="가입할 ID를 작성하세요" autofocus/></div>
			<span></span><br><br>
			
			<span class="inputSpan">비밀번호</span><br>
			<div><input type="text" size="90" placeholder="사용할 비밀번호를 입력하세요" /></div>
			<span></span><br><br>
			
			<span class="inputSpan">비밀번호 재확인</span><br>
			<div><input type="text" size="90" placeholder="사용할 비밀번호를 재입력하세요" /></div>
			<span></span><br><br>
			
			<span class="inputSpan">닉네임</span><br>
			<div><input type="text" size="90" placeholder="사용할 닉네임을 입력하세요" /></div>
			<span></span><br><br>
			
			<span class="inputSpan">이메일</span><br>
			<div><input type="email" size="90" placeholder="등록할 이메일을 입력하세요 (@를 포함한 이메일 주소를 입력해주세요)" /></div>
			<span></span><br><br>
			
			<span class="inputSpan">주소</span><br>
			<div><input type="text" size="90" placeholder="주소를 등록하세요" /></div>
			<span></span><br><br>
			<center><button id="join" type="button" class="btn btn-primary" onclick="return check();">가입하기</button></center>
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