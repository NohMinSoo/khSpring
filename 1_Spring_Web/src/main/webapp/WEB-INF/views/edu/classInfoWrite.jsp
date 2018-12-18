<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<link href="/resources/css/edu_side.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
    .w3-input{
        resize: none;
    }
    .button4 {
    float:right;
	width:80px;
	height:40px;
  	background-color: white;
 	color: black;
  	border: 2px solid #555555;  	
  	font-size: 15px;
  	font-weight: 900; 
  	margin-left:20px; 	
	}

	.button4:hover {
		background-color: #555555;
		color: white;
	}
	.checkbox-design{
    display: inline-block;
    padding-left:15px;
    padding-right: 15px;
	height: 30px;	
	cursor: pointer;
    border: 1px solid #f1f1f1;
    line-height: 30px;
    }
    input[id^=ncs]:checked +.checkbox-design{
        background-color: #666666;
        color:white;
        border: 1px solid #bcbcbc;
    }
    input[id^=ncs]{
    	display:none;
    }
    
</style>
<body>
<div id="wrapper">
		<div id="header">
			<jsp:include page="/resources/common/main_header.jsp"></jsp:include>
		</div>
		<div id="navigator">
			<jsp:include page="/resources/common/main_navigator.jsp"></jsp:include>
		</div>
		
		<div id="contents">
			
			<form action="/edu/clssInfoWrite.kh" method="post" class="w3-container w3-card-4 w3-light-grey">
			    <h2>
			    	Bordered Input
			    	<button class="button4" type="button" onclick="list();">목록으로</button>
			    	<button class="button4" type="button" onclick="cancle();">취소</button>
					<button class="button4" type="button" onclick="insertClassInfo();">등록</button>					  
			    </h2>
			    
			    <p>
			        <label>과정종류</label>
			        <select  id="classType" name="classType" class="w3-input w3-border">
			        	<option>security</option>
			            <option>programming</option>
			        </select>        
			    </p>
			    <p>
			        <label>과정명</label>
			        <input id="className" name="className" class="w3-input w3-border" type="text">
			    </p>
			    <p>
			        <label>과정개요</label>
			        <textarea id="classDetail" name="classDetail" class="w3-input w3-border" rows="7"></textarea>
			    </p>
			    <p>
			        <label>훈련시간</label>
			        <input id="term" name="term" class="w3-input w3-border"  type="text" placeholder="훈련시간 숫자만 입력">
			    </p>
			    <p>
			        <label>훈련정원</label>
			        <input id="classMemberNum" name="classMemberNum" class="w3-input w3-border" type="text" placeholder="훈련정원 숫자만 입력">
			    </p>
			    <p>			       
			        <label>NCS 훈련직종 (해당되는 항목을 선택해주세요)</label><br>
			        <input type="checkbox" id="ncs-1" name="ncsSub" value="응용SW엔지니어링(20010202)"><label for="ncs-1" class="checkbox-design"><span>응용SW엔지니어링(20010202)</span></label>        
			        <input type="checkbox" id="ncs-2" name="ncsSub" value="DB엔지니어링(20010204)"><label for="ncs-2" class="checkbox-design"><span>DB엔지니어링(20010204)</span></label>       
			        <input type="checkbox" id="ncs-3" name="ncsSub" value="보안엔지니어링(20010206)"><label for="ncs-3" class="checkbox-design"><span>보안엔지니어링(20010206)</span></label>        
			        <input type="checkbox" id="ncs-4" name="ncsSub" value="정보보호관리/운영(20010601)"><label for="ncs-4" class="checkbox-design"><span>정보보호관리/운영(20010601)</span></label>			        
			    </p>
			    <p>
			        <label>훈련비</label>
			        <input name="payment" class="w3-input w3-border" name="first" type="text" value="국비지원 전액무료">
			    </p>
			    <p>
			        <label>훈련시간</label>
			        <input name="classTime" class="w3-input w3-border" name="first" type="text" value="09:30 ~ 18:20">
			    </p>
			    <p>
			        <label>진출분야</label>
<textarea id="jobField" name="jobField" class="w3-input w3-border" rows="5">
정보보안 엔지니어/컨설턴트
모의해킹/침해대응 전문가
정보보안 프로그램 개발자
정보보안 감리 감사/관제
포렌식 전문가
화이트해커</textarea>
			    </p>
			    <p>
			        <label>지원대상</label>
			        <textarea name="supportTarget"class="w3-input w3-border" rows="3">
고용보험에 가입되어 있지 않은 취업 준비생 또는 실업자
대학교 최종학년 재학생 중 대학원에 진학하지 않는 학생
IT 분야로 취업을 원하는 자</textarea>
			    </p>
			    <input type="submit" id="wirteClassInfo" style="display:none;">			   
			</form>		
		</div>
		<script type="text/javascript">
			function insertClassInfo(){
				if(confirm("등록하시겠습니까?")){
					if($('#className').val()==""){
						alert("과정명을 입력해주세요");
						$('#className').focus();
						return false;
					}
					if($('#classDetail').val()==""){
						alert("과정개요를 입력해주세요");
						$('#classDetail').focus();
						return false;
					}
					if($('#term').val()==""){
						alert("훈련시간을 입력해주세요");
						$('#term').focus();
						return false;
					}else if(isNaN($('#term').val())){
						alert("훈련시간은 숫자만 입력해주세요.");
						$('#term').focus();
						return false;
					}else {
						$('#term').val("총 "+$('#term').val()+"시간");
					}					
					if($('#classMemberNum').val()==""){
						alert("훈련정원을 입력해주세요");
						$('#classMemberNum').focus();
						return false;
					} else if(isNaN($('#classMemberNum').val())){
						alert("훈련정원은 숫자만 입력해주세요.");
						$('#classMemberNum').focus();
						return false;
					}					
					if($('input:checkBox[id^="ncs"]:checked').length == 0){
						alert("NCS 훈련직종을 선택해주세요");
						$('#ncs-1').focus();
						return false;
					}
					$('#wirteClassInfo').click();
				}else{
					alert("등록안함");
				}				
			}
			function list(){
				if(confirm("목록으로 돌아가시겠습니까?")){
					location.href="/edu/curriculumList.kh?reqPage=1";
				}
			}
			function cancle(){
				location.reload();
			}
			$(function(){
				$("#classType").change(function(){
					if(this.value == 'security'){						
						$('#jobField').html("정보보안 엔지니어/컨설턴트\r모의해킹/침해대응 전문가\r정보보안 프로그램 개발자\r정보보안 감리 감사/관제\r포렌식 전문가\r화이트해커");
					}else{						
						$('#jobField').html("JAVA 기반 웹 프로그래밍 개발자\rJAVA웹 컴퍼넌트 개발자\rGUI 응용프로그램 개발자\rEJB 컴포넌트 개발자\rERP/CRM 기업용 솔루션 개발자\r모바일 어플리케이션 개발자");
					}
				})
			})
		</script>		
		<div id="footer_bar">
			<jsp:include page="/resources/common/main_footer_bar.jsp"></jsp:include>
		</div>
		<br>
		<div id="footer">
			<jsp:include page="/resources/common/main_footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>