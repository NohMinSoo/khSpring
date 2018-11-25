<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>회원가입</title>
</head>
<body style="background-color: #D5D5D5;">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<style>
	.material-switch > input[type="checkbox"] {
    display: none;   
}

.material-switch > label {
    cursor: pointer;
    height: 0px;
    position: relative; 
    width: 40px;  
}

.material-switch > label::before {
    background: rgb(0, 0, 0);
    box-shadow: inset 0px 0px 10px rgba(0, 0, 0, 0.5);
    border-radius: 8px;
    content: '';
    height: 16px;
    margin-top: -8px;
    position:absolute;
    opacity: 0.3;
    transition: all 0.4s ease-in-out;
    width: 40px;
}
.material-switch > label::after {
    background: rgb(255, 255, 255);
    border-radius: 16px;
    box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
    content: '';
    height: 24px;
    left: -4px;
    margin-top: -8px;
    position: absolute;
    top: -4px;
    transition: all 0.3s ease-in-out;
    width: 24px;
}
.material-switch > input[type="checkbox"]:checked + label::before {
    background: inherit;
    opacity: 0.5;
}
.material-switch > input[type="checkbox"]:checked + label::after {
    background: inherit;
    left: 20px;
}
    
    #login-form > div {
        margin: 15px 0;
    }
    
    #container{
    	margin-top : 20px;
    	margin-left : 300px;
    	width : 1000px;
    	height : 900px;
    	
    }
    #contents-2{
  
    	padding-left: 250px;
    	padding-right: 150px;
    	text-align: left; width : 100%;
    	height : 10%;
    	
    }
    #contents-3{
    	padding-left: 250px;
    	padding-right: 150px;
    	text-align: left; width : 100%;
    	height : 75%;
    }
    #contents-3 div{
    	border : 1px solid gray;
    }
    #contents-3 p{
    	font-weight: bolder;
    }
	#kh-agree{
		width : 100%;
		height : 25%;
		overflow: auto;
	}
	#privacy{
		width : 100%;
		height : 25%;
		overflow: auto;
	}

	#join{
		background-color : #003399;
		display: block;
		width : 200px;
	}
	
</style>


              
<script>
$(document).ready(function(){
	

	$('#allCheckSwitch').change(function(){
		if($('#allCheckSwitch').is(":checked")){
			$('#khAgreeCheckSwitch').prop('checked',true);
			$('#privacyAgreeCheckSwitch').prop('checked',true);
		}
		else{
			$('#khAgreeCheckSwitch').prop('checked',false);
			$('#privacyAgreeCheckSwitch').prop('checked',false);
		}
	});
	
	
	
});
	function check(){
		var khAgree = $('input:checkbox[id=khAgreeCheckSwitch]').is(":checked");
		var privacyAgree = $('input:checkbox[id=privacyAgreeCheckSwitch]').is(":checked");
		
		if(khAgree==true && privacyAgree==true)
		{
			location.href="/member/joinPage.kh";
		}
		else
		{
			alert("모든 이용약관에 동의 하셔야 합니다.")	;
			return false;
		}
	}
</script>
                  
                        
<div id="container"  align="center">
    <div id="contents-1">
            	<a href="/index.jsp"><img height=80px width=300px src="/resources/png/01_KH정보교육원_가로컬러.png"/></a><br>
    </div>
	<br><br>

    <div id="contents-2" >
        
            <span style="font-size:20px;"><b>KH정보교육원</b>을 찾아주셔서 감사합니다.</span><br>
			<span>회사는 <b><u>회원가입, 상담, 서비스 신청 등을 위해 아래와 같은 개인정보를 수집</u></b>하고 있습니다.</span><br>
			<span>회원가입을 원하실 경우 내용 확인 후 <b><u>동의</u></b>해 주시기 바랍니다.</span><br>
			<hr style="border:2px solid black;">
	</div>
	<div id="contents-3" >    
			<br>
           	<span class="material-switch pull-left">
                <input id="allCheckSwitch"  type="checkbox"/>
                <label for="allCheckSwitch"  class="label-primary"></label>
                <span> 전체 이용 약관 동의 </span>
                <br><br>
            </span>
           	<br><br>
           	<span class="material-switch pull-left">
                <input id="khAgreeCheckSwitch" type="checkbox"/>
                <label for="khAgreeCheckSwitch" class="label-primary"></label>
                <span> kh정보교육원 이용약관 동의 </span><span style="color:blue;">(필수)</span>
            </span>
          <br><br>
           	<div id="kh-agree">
           			<jsp:include page="/resources/common/kh_agree.jsp"></jsp:include>
           	</div>
           <br><br>
           	<span class="material-switch pull-left">
                <input id="privacyAgreeCheckSwitch"  type="checkbox"/>
                <label for="privacyAgreeCheckSwitch" class="label-primary"></label>
                <span> 개인정보 보호정책 및 개인정보 수집에 대한 이용 안내 동의</span><span style="color:blue;">(필수)</span>
            </span>
            <br><br>
           	<div id="privacy">
           			<jsp:include page="/resources/common/privacy.jsp"></jsp:include>
           	</div>
           	<br>
           	<center><button id="join" type="button" class="btn btn-primary" onclick="return check();">회원가입</button></center>
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