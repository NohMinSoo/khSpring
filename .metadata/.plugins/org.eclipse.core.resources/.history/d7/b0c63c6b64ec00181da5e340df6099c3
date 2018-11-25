<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<style>
	
    body {
        background: #f8f8f8;
        padding: 60px 0;
    }
    
    #login-form > div {
        margin: 15px 0;
    }
    
    .container{
    	height : 300px;
    }
    
    input{
    	height : 200px;
    }
    
    #member-join{
    	height : 30px;
    	width : 100%;
    }
    
    #id-pw-find{
     height :30px;
    	width : 100%;
    }
    
    input:focus{
    	border: 3px solid blue;
    }
    
    button:active{
    	height:98%;
    	width:98%;
    }
    #member-join a:active{
   	 	width:140px;
    }
    #id-pw-find a:active{
   	 	width:140px;
    }
    
    #member-join a{
    	background : #283444;
    	font-size : 13px;
    	color : #fff;
    	float:right;
    	display:block;
    	height:100%;
    	line-height: 30px;
    	width : 150px;
    	text-align: center;
    	text-decoration: none;
    	
    }
    #id-pw-find a{
    	background : #283444;
    	font-size : 13px;
    	color : #fff;
    	float:right;
    	display:block;
    	height:100%;
    	line-height: 30px;
    	width : 150px;
		text-align: center;
		text-decoration: none;
    }

</style>

<body>


<div class="container"  align="center">
    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
            	<a href="/index.jsp"><img height=120px src="/resources/jpg/kh_info.jpg"/></a>    
            <div class="panel-body">
                <form action="/member/login.kh" method="post" id="login-form">
                    <div>
                        <input type="text"  class="form-control" name="userId" placeholder="아이디" autofocus>
                    </div>
                    <div>
                        <input type="password"  class="form-control" name="userPw" placeholder="비밀번호">
                    </div>
                    <div>
                        <button type="submit" style="background : #993800;" class="form-control btn btn-primary">로그인</button>
                    </div>
                </form>
                <br>
               	<p align="left" id="member-join">
                <span align="left">KH 정보교육원의 회원이 아니신가요?</span> 
                <a href="">KH회원가입 하기</a>
                </p>
                <p align="left" id="id-pw-find">
                <span align="left">아이디나 비밀번호를 잊어버리셨나요?</span> 
                <a href="">아이디/비밀번호 찾기</a>
                </p>

            </div>
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