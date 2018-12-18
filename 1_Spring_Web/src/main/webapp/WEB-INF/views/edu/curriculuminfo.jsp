<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/resources/png/03_KH정보교육원_원형컬러.png">
<title>KH정보교육원</title>
</head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<% pageContext.setAttribute("lineChar", "\n"); %>
<style>
#content-1{
	float:left;
	padding-left:5px;
	width:20%;
	
}
#content-2{
	float:left;
	width:80%;
	
}
.edu_subject{
	margin:10px;
	height:45px;
}
.edu_subject>span {
	
    font-size: 25px;
    font-weight: 900;
    color: #263441;
    font-family: 'NanumBarunGothic', 'Nanum Gothic', '돋움', Dotum, sans-serif;
    letter-spacing: -2px;
}
.edu_info {
	margin:10px;
    border-top: 1px solid #e5e5e5;
    line-height: 1.5;
}
.edu_info .top {
    padding: 30px 20px;
    background: #f8f8f8;
    border-bottom: 1px solid #e5e5e5;
}

.edu_info .info_table table th {
    width: 85px;
    height: 30px;
    border-bottom: 4px solid #fff;
    border-top: 1px solid #fff;
    background: #f8f8f8;
    color: #283444;
    text-align:center;
    font-weight: 500;
    font-size: 12px;
    line-height: 1.5;
}
.edu_info .info_table table td {
    padding-left: 10px;
    color: #707070;
    font-size: 12px;
    line-height: 1.5;
} 
.edu_info .info_table {
     overflow: hidden;
}
    tr {
    display: table-row;
    vertical-align: inherit;
    border-color: inherit;
}
    .edu_info .info_table .left {
    width: 378px;
    float: left;
}
.button4,.button5 {
	width:80px;
	height:45px;
  	background-color: white;
  	margin-left:5px;
 	color: black;
  	border: 2px solid #555555;
  	float:right;
  	font-size: 15px;
  	font-weight: 900;
}
.button3 {
	border: 2px solid #f44336;
	width:80px;
	height:45px;
  	background-color: white;
  	margin-left:5px;
 	color: black;  	
  	float:right;
  	font-size: 15px;
  	font-weight: 900;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

.button4:hover, .button5:hover {
	background-color: #555555;
	color: white;
}
.button5{
	display: none;
}
.modify{
	display: none;
}
.modify *{
	width:100%;
}
#jobFieldMo {
	width:350px;
	height:120px;
}
#supportTargetMo{
	width:350px;
	height:67px;
}
textarea {
  width: 100%;
  height: 100px;
  padding: 5px 5px;
  box-sizing: border-box;
  border: 1px solid #ccc;
  border-radius: 4px;
  background-color: wihte;
  font-size: 16px;
  resize: none;
  text-overflow: auto;
}
input{
	padding-left:5px;
	border: 1px solid #ccc;
}
#ncsSubMo{
	height:48px;
}

</style>
<link href="/resources/css/edu_side.css" rel="stylesheet" type="text/css">
<body>
	
	<div id="wrapper">
		<div id="header">
			<jsp:include page="/resources/common/main_header.jsp"></jsp:include>
		</div>
		<div id="navigator">
			<jsp:include page="/resources/common/main_navigator.jsp"></jsp:include>
		</div>
		<div id="contents">
		<div id="content-1">
			<jsp:include page="/resources/common/edu_side.jsp"></jsp:include>
		</div>
		
		<div id="content-2">
			<form action="/edu/modify.kh" method="post">
				<input type="hidden" value="${pd.classInfo.classNo }" name="classNoMo">
				
				
				<div class="edu_subject">
					<span>${pd.classInfo.className }</span>
					<button class="button4" type="button" onclick="list();">목록으로</button>
					<button class="button4" type="button" onclick="modify();">수정하기</button>
					<button class="button3" type="button" onclick="deleteClass();">삭제하기</button>
					<button class="button5" type="button" onclick="cancle();">취소</button>
					<button class="button5" type="button" onclick="complete();">수정완료</button>					
				</div>
			<center>
			
				<div class="edu_info">
					<div class="top">
						<p class="title" style="text-align:left;">과정개요</p>
						<hr>
						<div class="bar"></div>
						<p class="view" id="classDetail" style="text-align:left;">${pd.classInfo.classDetail }</p>
						<p class="modify" style="text-align:left;"><textarea class="textarea" id="classDetailMo" name="classDetailMo"></textarea>
					</div>
	
					<div class="info_table">
						<table class="left" cellpadding="0" cellspacing="0">							
							<tr>
								<th>훈련기간</th>
								<td class="view">${pd.classInfo.term }</td>
								<td class="modify"><input type="text" name="termMo" value="${pd.classInfo.term }"></td>
							</tr>
							<tr>
								<th>훈련정원</th>
								<td class="view">${pd.classInfo.classMemberNum }명 내외</td>
								<td class="modify"><input type="text" name="classMemberNumMo" value="${pd.classInfo.classMemberNum }"></td>
							</tr>
							<tr>
								<th style="height: 45px;">NCS 훈련직종</th>
								<td class="view" id="ncsSub">${pd.classInfo.ncsSub }</td>
								<td class="modify"><textarea id="ncsSubMo" name="ncsSubMo"></textarea></td>
							</tr>
							<tr>
								<th>훈련비</th>
								<td>국비지원 전액무료</td>
							</tr>
							<tr>
								<th>훈련시간</th>
								<td class="view">${pd.classInfo.classTime }</td>
								<td class="modify"><input type="text" name="classTimeMo" value="${pd.classInfo.classTime }"></td>
							</tr>
						</table>
						<table class="rigth" cellpadding="0" cellspacing="0">
							<tr>
								<th>진출분야</th>
								<td class="view" id="jobField">${pd.classInfo.jobField }</td>
								<td class="modify"><textarea  id="jobFieldMo" name="jobFieldMo"></textarea> </td>
							</tr>
							<tr>
								<th style="height: 68px">지원대상</th>
								<td class="view" id="supportTarget">${pd.classInfo.supportTarget }</td>
								<td class="modify"><textarea  id="supportTargetMo" name="supportTargetMo"></textarea> </td>
							</tr>
						</table>
					</div>
				</div>
					<input id="modify-btn" type="submit" style="display:none">
			</form>
			<img src="/resources/jpg/edu_classInfo.jpg" style="width:98%;">
			</center>
		</div>
		
		
		</div>
		
		<div id="footer_bar">
			<jsp:include page="/resources/common/main_footer_bar.jsp"></jsp:include>
		</div>
		<br>
		<div id="footer">
			<jsp:include page="/resources/common/main_footer.jsp"></jsp:include>
		</div>
	</div>
	<script>
		
		function list(){
			location.href="/edu/curriculumList.kh?reqPage=1";
		}
		function modify(){
			$('#jobFieldMo').val($('#jobField').html().replace(/<br>/g,""));
			$('#ncsSubMo').val($('#ncsSub').html().replace(/<br>/g,""));
			$('#classDetailMo').val($('#classDetail').html().replace(/<br>/g,""));
			$('#supportTargetMo').val($('#supportTarget').html().replace(/<br>/g,""));
			$('.view').hide();
			$('.modify').show();
			$('.button3').hide();
			$('.button4').hide();
			$('.button5').show();			
		}
		function cancle(){
			location.reload();
		}
		function complete(){
			$('#modify-btn').click();
		}
		function deleteClass(){
			if(confirm("정말 삭제하시겠습니까?")){
				location.href="/edu/deleteClass.kh?classNo="+'${pd.classInfo.classNo }';	
			}			
		}
		$('.panel').show();
		$('.accordion').attr('disabled',true);
	</script>
</body>
</html>