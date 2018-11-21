<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ tagliburi ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>${requestScope.memberMyInfo.mNickName} 님의 정보</title>

</head>
<link href="/resources/css/main_css.css" rel="stylesheet" type="text/css">


<style>
	#wrapper{
		text-align: center;
	}
	
	#contents{
		width : 1200px;
		height : 900px;
		display: inline-block;
	}
	#contents a{
		text-decoration: none;
		color : blue;
	}
	#contents>p{
		text-align: left;
		margin: 0 auto;
		font-size: 14px;
	}
	#contents>div{
		width : 100%;
		height : 850px;
	}
	
	#my-data{
		padding-left : 50px;
		text-align: left;
	}

	#my-data>table tr>td:first-child {
		width:200px;
		height : 50px;
		font-weight: bolder;
	}
	#my-data>table tr>td:nth-child(2) {
		font-size: 19px;
		padding: 10px;
		height : 70px;
		width : 800px;
	}
	#my-data>table tr:nth-child(2n)>td{
		padding : 0;
		height : 10px;
	}
	#my-data>table tr>td:nth-child(3){
	height : 10px;
	}
	
	#my-data>table tr>td>span {
		font-size: 12px;
		color : gray;
	}
	
</style>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script>
	var nickCheckFlag = 0;
	function modify(id)
	{
		var modifyData = id.value;  // 수정된 값 
		var elementId = id.id;		// 수정할 input 태그의 ID 
		console.log(modifyData);
		console.log(elementId);
		if(elementId=="nick")
		{
			if(nickCheckFlag==0)
			{
				nickCheck(id,modifyData);
			}else{
				
				modifyCall(modifyData,elementId);	
			}
			
		}
		else
		{
			 modifyCall(modifyData,elementId);
		}
		
	}
	function nickCheck(id,nick)
	{
		$.ajax({
			url : "/member/nickCheck.kh",
			data : {nick:nick},
			type : "post",					
			success : function(result){
				console.log(result);
				if(result === 'true') // 사용 가능 (없을때)
				{
					id.style.border="3px solid green";
					$(id).next().text("수정");
					$(id).next().css('background-color','green');
					$(id).next().next().next().text("사용 가능한 닉네임 입니다. 수정버튼을 클릭하세요");
					$(id).next().next().next().css('color','green');
					nickCheckFlag = 1;
				}
				else // 사용 불가 (있을때)
				{
					id.style.border="3px solid red";
					$(id).next().next().next().text("이미 사용하는 닉네임 입니다.");
					$(id).next().next().next().css('color','red');
					console.log("수정 불가");
				}
			},
			error : function(){
				alert("수정 실패! 지속적인 문제 발생시 관리자에게 문의해주세요");
			}
			
		});
	}
	
	function modifyCall(modifyData,elementId)
	{
		$.ajax({
			url : "/member/mModify.kh",
			data : {id:elementId,data:modifyData},
			type : "post",					
			success : function(result){
				if(result == 'success')
					{
						alert("정보 변경 완료");
						location.reload();
					}
			},
			error : function(){
				alert("수정 실패! 지속적인 문제 발생시 관리자에게 문의해주세요");
			}
			
		});
	}
	
	
</script>


<body>
	
	
	<jsp:include page="/resources/common/sub_my_header.jsp"></jsp:include>
	<div id="wrapper">
		<div id="contents">
				<center>
					<p style="font-size:25px;"><b>내정보 수정</b></p>					
				</center>
			<p><span style="color:blue;"><b><a href="/member/myInfo.kh">${sessionScope.member.mNickName}</a></b></span>님의 개인 정보입니다.</p>
			<p>회원정보는 개인정보처리방침에 따라 안전하게 보호되며,</p>
			<p>회원님의 <u><b>명백한 동의 없이 공개 또는 제 3자에게 제공되지 않습니다.</b></u></p>
			<br><br>
			<div id="my-data">
			<table >
					<tr><td rowspan="2">아이디</td><td><br>${sessionScope.member.mId}<br><span>(사용자 ID는 변경하실 수  없습니다.)</span></td></tr>
					<tr><td></td></tr>
					<tr><td rowspan="2">이름</td><td><br>${sessionScope.member.mName}<br><span>(실명 정보(이름, 생년월일, 성별, 개인 고유 식별 정보)가 변경된 경우 본인 확인을 통해 정보를 수정하실 수 있습니다.)</span></td></tr>
					<tr><td></td></tr>
					<tr><td rowspan="2">닉네임<br></td><td><br><input type="text" value="${sessionScope.member.mNickName}" id="nick"/> <button onclick="modify(nick);">중복확인</button><br><span>(닉네임은 본인의 얼굴입니다. 부적절한 닉네임 사용시 이용 불가 될 수 있습니다.)</span></td></tr>
					<tr><td></td></tr>
					<tr><td rowspan="2">이메일<br></td><td><br><input type="email" value="${sessionScope.member.mEmail}" id="email"/> <button onclick="modify(email);">수정</button><br><span>(kh 서비스 변경/개편/종료, 프로모션 등 kh의 대부분 안내에 사용할 이메일 주소입니다.)</span></td></tr>
					<tr><td></td></tr>
					<tr><td rowspan="2">휴대폰<br></td><td><br><input maxlength="11" type="text" value="${sessionScope.member.mPhone}" id="phone" /> <button onclick="modify(phone);">수정</button><br><span>(아이디, 비밀번호 찾기 등 본인확인이 필요한 경우  kh로부터 알림을 받을 때 사용할 휴대전화입니다.)</span></td></tr>
					<tr><td></td></tr>
					<tr><td rowspan="2">주소<br></td><td><br><input type="text" size="70px" id="address" value="${sessionScope.member.mAddress}" class="d_form large" placeholder="주소"> <button onclick="addressSearch()">주소찾기</button> <button onclick="modify(address);">수정</button><br><span>(고객님의 주소입니다 - 지번 주소만 지원합니다.)</span></td></tr>
											
					<tr><td></td></tr>
			</table>
			</div>
		</div>
		<br>
		
		<div id="footer">
			<jsp:include page="/resources/common/sub_footer.jsp"></jsp:include>
		</div>
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
                
                document.getElementById('address').value = data.jibunAddress;

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









