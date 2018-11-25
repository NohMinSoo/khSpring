<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<style>
	#header-navi{
		height:60px;
		width:100%;
		background-color: black;
		position: fixed;
	}
	
	#header-navi a:nth-child(1){
		line-height: 60px;
		text-decoration : none;
		float : left;
	}
	#header-navi>span{
		line-height: 60px;
	}
	
	#header-navi a:nth-child(1) img{
		padding-left:265px; 
		width:60px;
	}
	
	#header-navi a:nth-child(2){
		color:white;
		padding-left:10px; font-size:20px;
	}
	
	#header-navi a:hover{
		color:yellow;
	}
	#pw-change{
		color : white;
		font-size : 20px;
		font-weight: bolder;
	}
	#pw-change{
		float:right; 
		line-height: 60px;
		margin-right:500px;
		cursor: pointer;
	}
	#pw-change:hover{
		color : blue;
	}
	#pw-change-box{
		display: none;
		border:1px solid black;
		width : 500px;
		height : 600px;
		margin-right:300px;
		background-color : white;
		float:right; 
		padding-left : 30px;
		padding-right : 30px;
	}
	#pw-change-box span:nth-child(1){
		font-size : 25px;
		font-weight: bolder;
		line-height: 50px;
	}
	#pw-change-box span:nth-child(3){
		color : blue;
		line-height: 30px;
	}
	#pw-change-box span:nth-child(5){
		color : red;
		line-height: 30px;
	}
	#pw-change-box span:nth-child(7){
		color : red;
		line-height: 30px;
	}
	#pw-change-box input{
		font-size : 25px;
		border : 4px solid #D5D5D5;
	}
	#pw-change-box button{
		width: 100%;
		height : 60px;
	}
	
	#pass-btn-confirm{
		background-color : #003399;
		color : white;
	}
	#pass-btn-reset{
		background-color :#F6F6F6;
	}
	#captcha{
		display : none;
		width :100%;
		height : 200px;
		border : 1px solid red;
	}
	
</style>

<script>
$(document).ready(function(){
		var passFlag = 0;
		$('#pw-change').click(function(){
			$("#pw-change-box").slideToggle();
		});
		
		$('#pw-change-box input').focus(function()
		{
			$(this).css('border','4px solid #003399');
		});
		
		$('#pw-change-box input').blur(function(){
			$(this).css('border','4px solid #D5D5D5');
		});
		
		$('#pass-btn-confirm').click(function(){
			var present_pass = $('#present_pass').val();
			var new_pass = $('#new_pass').val();
			var new_pass_re = $('#new_pass_re').val();
			
			if(present_pass=='' || new_pass=='' || new_pass_re=='')
			{
				alert("비밀번호를 입력해주세요");
			}else if(new_pass != new_pass_re)
			{
				alert("새 비밀번호와 확인 비밀번호가 일치 해야 합니다.");
			}else{
				$.ajax({
					url : "/member/memberPwChange.kh",
					data : {prePw:present_pass, newPw:new_pass},
					type : "post",					
					success : function(result){
							if(result=='true')
							{
								alert('비밀번호가 정상적으로 변경되었습니다.');
								$('#pw-change-box input').val('');
								$('#pw-change-box input').next().next().text('');
								$('#pw-change-box input').css('border','4px solid #D5D5D5');
								$("#pw-change-box").slideToggle();
							}else{
								alert('현재 비밀번호가 맞지 않습니다. 재확인 바랍니다.');
							}
					},
					error : function(){
						console.log("서버 전송 실패");
					}
				});
			}
			
			
		});
		
		$('#pass-btn-reset').click(function(){
			$("#pw-change-box").slideToggle();
			$('#pw-change-box input').val('');
			$('#pw-change-box input').next().next().text('');
			$('#pw-change-box input').css('border','4px solid #D5D5D5');
			
		});
		
		
		$('#new_pass').blur(function(){
			var data = $(this).val();
			pwCheck(this,data);
		});
		
		//비밀번호 적절성 체크 메소드
		function pwCheck(id,data){
			var expr = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
			
			if(expr.test(data))
			{
				$(id).css('border','4px solid #003399');
				$(id).next().next().text('사용가능한 비밀번호 입니다.');
				$(id).next().next().css('color','#003399');
				$(id).next().next().css('font-size','12px');
			}
			else
			{
				$(id).css('border','4px solid red');
				$(id).next().next().text('1개 이상의 영소문자, 영대문자, 특수문자, 숫자를 포함해주세요(8글자 이상)');
				$(id).next().next().css('color','red');
				$(id).next().next().css('font-size','12px');
			}
			
		}
		
});
</script>
<body>
	<div id="header-navi">
		<a href="/index.jsp"><img id="img1" src="/resources/png/03_KH정보교육원_원형흑백.png"></img></a>
		<a href="/member/myInfo.kh"><B>내정보</B></a><span style="color:white;"> - 소중한 개인 정보! 보안을 철저히!!</span>
		<span id="pw-change">비밀번호 변경</span>
		<div id="pw-change-box">
			<span>비밀번호 변경</span><br>
			<span>안전한 비밀번호로 내정보를 보호하세요</span><br>
			<span> * 다른 아이디/사이트에서 사용한 적 없는 비밀번호</span><br>
			<span> * 이전에 사용한 적 없는 비밀번호</span>가 안전합니다.<br><br><br>
			<input type="password" name="present_pass" id="present_pass" placeholder="현재 비밀번호" /><br><br>
			<input type="password" name="new_pass" id="new_pass" placeholder="새 비밀번호" /><br><span></span><br>
			<input type="password" name="new_pass_re" id="new_pass_re" placeholder="새 비밀번호 확인" /><br><br>
			<br>
			<div id="captcha">
					<!-- captcha 아직 미구현 -->
			</div>
			<br><br>
			<button id="pass-btn-confirm">확인</button><br><Br>
			<button id="pass-btn-reset">취소</button><br><Br>
		</div>
		
	</div>
	
</body>
</html>



