<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디/비밀번호 찾기</title>
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

<style>
	div  {
		box-sizing: border-box;
		
	}
	#container{
    	margin-top : 20px;
    	margin-left : 300px;
    	width : 1000px;
    	height : 600px;
    
    }
    #contents-2{
    	width : 100%;
    	height : 85%;
    
    }
    #contents-2>div:nth-child(1) {
    	width : 100%;
    	height : 20%;
    }
    
    #contents-2>div:nth-child(2) {
 
    	width : 50%;
    	height : 75%;
    	float: left;
	}
	#contents-2>div:nth-child(3) {
    	width : 50%;
    	height : 75%;
    	float: left;
	}

	#idFind span{
		width: 100px;
		display : inline-block;
		font-size : 15px;
	}
	#idFindBtn{
		margin-left: 150px;
		width : 200px;
		height : 50px;
		background-color : #fa5c3f;
	}
	#pwFindBtn{
		margin-left: 150px;
		width : 200px;
		height : 50px;
		background-color : #fa5c3f;
	}
	
	#pwFind span{
		width: 100px;
		display : inline-block;
		font-size : 15px;
	}
	
	
	#idSearch{
		height : 200px;
		margin-top: 50px;
	}
	
	#pwSearch{
		height : 200px;
		margin-top: 50px;
	}
  

</style>


<body>

<script>
$(document).ready(function(){
	$('#idFindBtn').click(function(){
		var name = $('#mNameFindId').val();
		var email = $('#mEmailFindId-1').val()+"@"+$('#mEmailFindId-2').val();
			
		if(name!='' && email!='')
		{
			$.ajax({
				url : "/member/memberIdFind.kh",
				data : {mName:name, mEmail:email},
				type : "post",					
				success : function(result){
						if(result=='true')
						{
							alert('아이디가 이메일로 발송되었습니다.');	
						}else{
							alert('정보가 일치하지 않습니다. 다시 확인해주세요');
						}
				},
				error : function(){
					console.log("서버 전송 실패");
				}
			});
		}else{
			alert('이름 혹은 이메일을 이력해주세요');
		}
			
	});
	
	$('#pwFindBtn').click(function(){
		var id = $('#mIdFindPw').val();
		var name = $('#mNameFindPw').val();
		var email = $('#mEmailFindPw-1').val()+"@"+$('#mEmailFindPw-2').val();
		
		if(id!='' && name!='' && email!='')
		{
			$.ajax({
				url : "/member/memberPwFind.kh",
				data : {mId:id, mName:name, mEmail:email},
				type : "post",					
				success : function(result){
						if(result=='true')
						{
							alert('비밀번호가 이메일로 발송되었습니다.');	
						}else{
							alert('정보가 일치하지 않습니다. 다시 확인해주세요');
						}
				},
				error : function(){
					console.log("서버 전송 실패");
				}
			});
		}else{
			alert('아이디 혹은 이름,이메일을 이력해주세요');
		}
	
	});

});
</script>

<div id="container" >
    <div id="contents-1" align="center">
            	<a href="/index.jsp"><img height=80px width=300px src="/resources/png/01_KH정보교육원_가로컬러.png"/></a><br>
    </div>
    <br><br>
    <div id="contents-2">
    		<div>
    			<span style="font-size:20px;"><b>회원가입시 등록한 회원정보를 입력해주세요.</b></span><br>
			<span>본인 확인을 위해 회원가입시 등록한 정보를 입력하시면 아이디 혹은 비밀번호를 <b style="font-size:20px;"><u>등록된 이메일</u></b>로 발송해드립니다.</span><br>
			<hr style="border:2px solid black;">		
    		</div>
			<div>
			
			<div id="idSearch">
				<b style="font-size:20px;">아이디 찾기</b><br>
				<span>이름과 이메일을 작성해주세요</span><br>
				<br>
				<div id="idFind">
				<span>이름</span><input type="text" id="mNameFindId"/><br>
				<span>이메일</span><input type="text" id="mEmailFindId-1"/>@<input type="text" id="mEmailFindId-2"/><br><br>
				<br><br>
			</div>
			</div>
				<button id="idFindBtn" class="btn btn-warning">아이디 찾기</button>
				
			</div>
			
			<div>
			
			<div id="pwSearch">
				<b style="font-size:20px;">비밀번호 찾기</b><br>
				<span>아이디, 이름, 이메일을 꼭 작성해주세요</span><br>
				<br>
				<div id="pwFind">
				<span>아이디</span><input type="text" id="mIdFindPw"/><br>
				<span>이름</span><input type="text" id="mNameFindPw"/><br>
				<span>이메일</span><input type="text" id="mEmailFindPw-1"/>@<input type="text" id="mEmailFindPw-2"/><br><br>
				</div>
			</div>
			<button id="pwFindBtn" class="btn btn-warning">비밀번호 찾기</button>
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