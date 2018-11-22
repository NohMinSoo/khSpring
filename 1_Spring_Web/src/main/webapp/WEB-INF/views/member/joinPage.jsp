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
    	height : 1550px;
    	
    }
    #contents-2{
  
    	padding-left: 150px;
    	padding-right: 150px;
    	text-align: left; width : 100%;
    	height : 85%;
  
    	
    }
   
    #contents-2 div{
    	width : 100%;
    	height : 70px;
    }
     #contents-2 div input{
     	margin : 10px;
     	line-height: 40px;
     }
     #contents-2 div span{
     	margin : 10px;
     	color : red;
     	font-weight: bolder;
      }
     #contents-2 div input[type="text"]
     {
     	font-size : 25px;
     }
      #contents-2 div input[type="password"]
     {
     	font-size : 25px;
     }
     
     #contents-2 div input[type="email"]
     {
     	font-size : 25px;
     }
     
     .inputLabel{
     	font-size : 20px;
     	font-weight: bolder;
     }
     
     .not-kor
     {
     	ime-mode:disabled;
     }
     
     #joinBtn{
	
		background-color : #003399;
		width :100%;
		height : 80px;
		
	}
	#contents-2 label>span{
		font-size : 15px;
		color: #003399;
	}
	#addrSearch{
		width : 100px;
		height : 50px;
	}
	.addr-2-hide{
		display:none;
	}
	
	
     
</style>
<script>

var checkFlags=[0,0,0,0,0,0,0];

$(document).ready(function(){
	$('#contents-2 div input').focus(function(){
		$(this).parent().css('border','2px solid #003399');
	});
	$('#contents-2 div input').blur(function(){
		$(this).parent().css('border','2px solid #D5D5D5');
	});
	

	// 데이터 입력 여부 체크 메소드
	$('#contents-2 div input').blur(function(){
		var data = $(this).val();
		if(data==''){
			$(this).css('border','4px solid red');
			$(this).next().next().css('color','red');
			switch($(this).attr('id'))
			{
			case 'mId' : $(this).next().next().text('아이디를 입력해주세요');checkFlags[0]=0; break;
			case 'mPw' : $(this).next().next().text('비밀번호를 입력해주세요'); break;
			case 'mPw_re' : $(this).next().next().text('재확인 비밀번호를 입력해주세요');checkFlags[1]=0; break;
			case 'mName' : $(this).next().next().text('이름을 입력해주세요');checkFlags[2]=0; break;
			case 'mNick' : $(this).next().next().text('닉네임을 입력해주세요');checkFlags[3]=0; break;
			case 'mPhone' : $(this).next().next().text('휴대폰 번호를 입력해주세요');checkFlags[4]=0; break;
			case 'mEmail' : $(this).next().next().text('이메일을 입력해주세요');checkFlags[5]=0; break;
			case 'mAddress-1' : $('#mAddress-2').next().next().text('주소를 입력해주세요');checkFlags[6]=0; break;
			}
			if($(this).attr('id') != 'mPw_re')
			$(this).focus().select();
		}else{
			switch($(this).attr('id'))
			{
			//아이디 중복 체크
			case 'mId' : idCheck(this,data); break;
			
			//비밀번호 적절성 체크
			case 'mPw' : pwCheck(this,data); break;
			
			//비밀번호 재확인 중복 체크
			case 'mPw_re' : pwReCheck(this,data); break;
			
			//이름 작성 체크
			case 'mName' : nameCheck(this,data);break;
			
			//닉네임 중복 체크
			case 'mNick' : nickCheck(this,data);break;
			
			//휴대폰 번호 체크
			case 'mPhone' : phoneCheck(this,data);break;
			
			//이메일 체크
			case 'mEmail' : emailCheck(this,data);break;
		
			//주소 체크
			case 'mAddress-2' : addressCheck(this,data);break;
			}
		}
	});
	
	
	//아이디 중복 체크 메소드
	function idCheck(id,data){
		 
		if(data.length>=4)
		{
		$.ajax({
			url : "/member/idCheck.kh",
			data : {id : data},
			type : "post",					
			success : function(result){
				if(result=='true')
				{
					$(id).css('border','4px solid #003399');
					$(id).next().next().text('사용 가능합니다.');
					$(id).next().next().css('color','#003399');
					checkFlags[0]=1;
				}else{
					$(id).css('border','4px solid red');
					$(id).next().next().text('이미 사용중인 아이디 입니다.');
					$(id).next().next().css('color','red');
					$(id).focus().select();
				}			
			},
			error : function(){
				console.log("서버 전송 실패");
			}
		});
		}else{
			$(id).css('border','4px solid red');
			$(id).next().next().text('아이디는 최소 4글자 이상 입력해주세요');
			$(id).next().next().css('color','red');
			$(id).focus().select();
		}
	}
	
	//비밀번호 적절성 체크 메소드
	function pwCheck(id,data){
		var expr = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		
		if(expr.test(data))
		{
			$(id).css('border','4px solid #003399');
			$(id).next().next().text('사용한 비밀번호 입니다.');
			$(id).next().next().css('color','#003399');
			
		}
		else
		{
			$(id).css('border','4px solid red');
			$(id).next().next().text('1개 이상의 영소문자, 영대문자, 특수문자, 숫자를 포함해주세요(8글자 이상)');
			$(id).next().next().css('color','red');
			$(id).focus().select();
		}
		
	}
	
	//비밀번호 재확인 체크 메소드
	function pwReCheck(id,data){
		var pw = $('#mPw').val();
		var pw_re = data; 
		if(pw === pw_re)
		{
			$(id).css('border','4px solid #003399');
			$(id).next().next().text('비밀번호 재확인 완료');
			$(id).next().next().css('color','#003399');
			checkFlags[1]=1;
			
		}else{
			$(id).css('border','4px solid red');
			$(id).next().next().text('동일한 비밀번호를 입력해주세요');
			$(id).next().next().css('color','red');
			
		}
		
	}
	
	//이름 작성 체크 메소드
	function nameCheck(id,data){
		var regExp = /[가-힣]{2,}/;
		if(regExp.test(data))
		{
			$(id).css('border','4px solid #003399');
			$(id).next().next().text('이름 입력 확인');
			$(id).next().next().css('color','#003399');
			checkFlags[2]=1;
		}else{
			$(id).css('border','4px solid red');
			$(id).next().next().text('이름을 정상적으로 작성해주세요');
			$(id).next().next().css('color','red');
			$(id).focus().select();
		}
		
	}

	//닉네임 중복 체크 메소드
	function nickCheck(id,data){
		$.ajax({
			url : "/member/nickCheck.kh",
			data : {nick : data},
			type : "post",					
			success : function(result){
				if(result=='true')
				{
					$(id).css('border','4px solid #003399');
					$(id).next().next().text('사용 가능합니다.');
					$(id).next().next().css('color','#003399');
					checkFlags[3]=1;
				}else{
					$(id).css('border','4px solid #red');
					$(id).next().next().text('이미 사용중인 닉네임 입니다.');
					$(id).next().next().css('color','red');
					$(id).focus().select();
				}	
			},
			error : function(){
				console.log("서버 전송 실패");
			}
		});
	}	
	
	
	//휴대폰 번호 체크 메소드
	function phoneCheck(id,data){
		var data = data.replace(/[-]/g,'');
		var regExp =  /^01([0|1|6|7|8|9]?)([0-9]{3,4})([0-9]{4})$/;
		if(data.length>=10 && regExp.test(data))
		{
			$(id).css('border','4px solid #003399');
			$(id).next().next().text('휴대폰 번호 정상 입력 완료');
			$(id).next().next().css('color','#003399');
			checkFlags[4]=1;
		}else{
			$(id).css('border','4px solid red');
			$(id).next().next().text('휴대폰 번호를 정상적으로 입력해주세요');
			$(id).next().next().css('color','red');
			$(id).focus().select();
		}
		
	}
	
	//이메일 체크 메소드
	function emailCheck(id,data){
		var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		var pw_re = data; 
		if(regExp.test(data))
		{
			$(id).css('border','4px solid #003399');
			$(id).next().next().text('이메일 정상 입력 완료');
			$(id).next().next().css('color','#003399');
			checkFlags[5]=1;
		}else{
			$(id).css('border','4px solid red');
			$(id).next().next().text('이메일을 정상적으로 입력해주세요');
			$(id).next().next().css('color','red');
			$(id).focus().select();
		}
	}
	
	//주소 체크 메소드
	function addressCheck(id,data){
		
		if(data.length>0)
		{
			$('#mAddress-2').css('border','4px solid #003399');
			$('#mAddress-2').next().next().text('주소 정상 입력 완료');
			$('#mAddress-2').next().next().css('color','#003399');
			checkFlags[6]=1;
		}
		
	}
	
	
	//한글입력 안되게 처리
	$( 'input[class=not-kor]' ).on("blur keyup", function() {
		$(this).val( $(this).val().replace( /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g, '' ) );
	});
	
	
	/*
	  $("input[class=not-kor]").keydown(function(event){ 
		  
		  
	   if (!(event.keyCode >=37 && event.keyCode<=40)) {

	    var inputVal = $(this).val();

	    var expr = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		   if(expr.test(inputVal)){
			$(this).text('');
		    $(this).next().next().css('color','red');
			$(this).next().next().text('한글은 사용할 수 없습니다.');
		   }else{
			$(this).next().next().text('');
		   }
	    	
		    $(this).val(inputVal.replace(/[^a-z0-9]/gi,''));
	   }

		  
	  });
	*/


});

function resultCheck(){
	var count = 0;
	
	for(var i=0;i<checkFlags.length;i++)
	{
		if(checkFlags[i]==1)
		{
			count++;	
		}
	}
	if(count==7)
	{
		return true;
	}else{
		alert("필수 항목은 모두 입력해주세요");
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
			<hr style="border:2px solid black;">
			
			
			<form id="joinForm" action="/member/khJoinMember.kh" method="post">
			<label for="mId" class="inputLabel">아이디 <span>(필수)</span></label><br>
			<div><input type="text" style="ime-mode:disable;" maxlength="10" class="not-kor" size="47" name="mId" id="mId" placeholder="가입할 ID를 작성하세요" autofocus/>
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mPw" class="inputLabel">비밀번호 <span>(필수)</span></label><br>
			<div><input type="password" maxlength="20" size="47" name="mPw" id="mPw"  placeholder="사용할 비밀번호를 입력하세요" />
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mPw_re" class="inputLabel">비밀번호 재확인 <span>(필수)</span></label><br>
			<div><input type="password" maxlength="20" size="47" id="mPw_re"  placeholder="사용할 비밀번호를 재입력하세요" />
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mName" class="inputLabel">이름 <span>(필수)</span></label><br>
			<div><input type="text" maxlength="8" size="47" name="mName" id="mName" placeholder="본인의 이름을 입력하세요" />
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mNick" class="inputLabel">닉네임 <span>(필수)</span></label><br>
			<div><input type="text" maxlength="8" size="47" name="mNick" id="mNick" placeholder="사용할 닉네임을 입력하세요" />
			<br><span></span>
			</div>
			<br><br>
			
			
			<label for="mPhone" class="inputLabel">휴대폰 <span>(필수)</span></label><br>
			<div><input type="text" maxlength="13" size="47" name="mPhone" id="mPhone" placeholder="휴대폰 번호를 입력해주세요" />  
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mEmail" class="inputLabel">이메일 <span>(필수)</span></label><br>
			<div><input type="email" maxlength="20" size="47" name="mEmail" id="mEmail" placeholder="등록할 이메일을 입력하세요 " />
			<br><span></span>
			</div>
			<br><br>
			
			<label for="mAddress" class="inputLabel">주소 <span>(필수)</span></label><br>
			<div><input type="text" onclick="addressSearch();" name="mAddress-1" maxlength="50" size="47" id="mAddress-1" placeholder="클릭하면 주소를 검색할 수 있습니다." />
			<input type="hidden" maxlength="50" size="47" name="mAddress-2" id="mAddress-2" placeholder="나머지 주소를 작성하세요" />
			<br><span></span>
			</div>
			<br><br><br class="addr-2-hide"><br class="addr-2-hide"><br class="addr-2-hide"><br class="addr-2-hide">
			<input id="joinBtn" type="submit"   class = "btn btn-primary" value="가입하기" onclick="return resultCheck();"/>
			</form>
			
	</div>

		
</div>



<div id="footer_bar">
			<jsp:include page="/resources/common/main_footer_bar.jsp"></jsp:include>
		</div>
		<br>
		<div id="footer">
			<jsp:include page="/resources/common/main_footer.jsp"></jsp:include>
		</div>
		
		
		
		<!-- 다음 주소 API -->


<span id="guide" style="color:#999"></span>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function addressSearch() {
    	
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                
                document.getElementById('mAddress-1').value = data.jibunAddress;
                
                if(document.getElementById('mAddress-1').value.length>0)
                {
                	$('#mAddress-1').css('border','4px solid #003399');		
        			$('#mAddress-2').attr('type','text');
        			$('.addr-2-hide').css('display','block');
        			
                }
                

                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';

                } else {
                    document.getElementById('guide').innerHTML = '';
                }
            }
        }).open();
    }
</script>
</body>
</html>