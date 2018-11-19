<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
 <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
<style>
	#header_layer1
	{
		float:left;
		width:10%;
		height:100%;
	}
	#header_layer2
	{
		float:left;
		width:65%;
		height:100%;
	}
	#header_layer3
	{
		float:left;
		width:10%;
		height:100%;
	}
	
	#header_layer1 a img{
		margin : 10px;
		height:70%;
		width:70%;
		transition-duration:1s; /* transition-duration */
	}
	
	
	#header_layer1 a:hover img{
		margin : 0px;
		height:100%;
		width:100%;
		transition-duration:1s; /* transition-duration */
	}
	
	
	#header_layer2 a img{
		margin : 5px;
		height:80px;
		width:200px;
		transition-duration:1s; /* transition-duration */
	}
		
	
	#header_layer3 a img{
		margin : 10px;
		height:85%;
		width:70%;
		transition-duration:1s; /* transition-duration */
	}
	
	#header_layer3 a:hover img{
		margin : 0px;
		height:100%;
		width:100%;
		transition-duration:1s; /* transition-duration */
	}
	#header_layer_time{	
		float:left;
		width:15%;
		height:100%;
		
	}
</style>
<script>
var weekName = ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"];
$(document).ready(function(){
	realtimeClock();
});
function realtimeClock()
{
	var apm = "am";
	var date = new Date();
	var hour = date.getHours();
	if( hour < 10) {
		hour = "0" + hour;
		apm = "am";
	}
	else {
		if(hour >= 12) {
			hour = (hour > 12) ? hour-12 : hour;
			hour = ( hour < 10) ? "0" + hour : hour;
			apm = "pm";
		}
		else {
			hour = hour;
			apm = "am";
		}
	}
	var min = (date.getMinutes() < 10) ? "0" + date.getMinutes() : date.getMinutes();
	var sec = (date.getSeconds() < 10) ? "0" + date.getSeconds() : date.getSeconds();
	$(".timebox").html( hour + ":" + min + ":" + sec + " " + "<span>" + apm + "</span>" );
	$(".time").html( hour + ":" + min + ":" + sec + " " + "<span>" + apm + "</span>" );
	var mon = 1 + date.getMonth();
	mon = (mon < 10) ? "0" + mon : mon;
	var day = date.getDate();
	day = (day < 10) ? "0" + day : day;
	
	$(".daybox").html( date.getFullYear() + "년 " + mon + "월 " + day + "일 " + weekName[date.getDay()] );
	$(".date").html( date.getFullYear() + "년 " + mon + "월 " + day + "일 " + weekName[date.getDay()] );
	
	setTimeout("realtimeClock()", 1000);
}
</script>

<style>
	.timebox{
		font-family: "Tahoma";
		font-size:25px;
		margin-top : 20px;
		font-weight:bold;
		letter-spacing:0px;
		line-height : 40px;
		text-align: center;
	}
	.daybox{
	margin-top: 5px;
	color : #999999;
	letter-spacing:0px;
	text-align: center;
	text-shadow:0px 1px 1px black; /* 텍스트그림자*/
	}
	#logout{
		text-decoration: none;
		color: white;
		background-color : black;
		text-shadow:0px 1px 1px black; /* 텍스트그림자*/
	}
	#logout:hover{
		color:black;
		background-color : skyblue;
	}
</style>
<body>
		<div id="header_layer1">
			<a href="/index.jsp"><img alt="kh마크" src="/resources/jpg/kh_mark.jpg"></img></a>
		</div>
		<div id="header_layer_time">
			<p style=""class="timebox"><span></span></p>
			<p class="daybox"><span></span></p>
		</div>
		<div id="header_layer2">
		
			
			<a style="padding-left:200px;"href="/index.jsp" >
			<img height="100%" width="200px" alt="kh마크" src="/resources/jpg/kh_info.jpg"></img>
			</a>
			
			<div style="float:right; font-size:15px" >
			<c:choose>
				<c:when test="${sessionScope.member !=null}">
					<B>[<a style="color:blue;"href="/member/myInfo.kh">${sessionScope.member.mNickName}</a>]</B>님 환영합니다  <a id="logout" href="/member/logout.kh">로그아웃</a>
				</c:when>
			</c:choose>
			</div>	
			
		</div>
		<div id="header_layer3">
		<a href="http://www.fntimes.com/html/view.php?ud=188100">
			<img height="100%" width="100%" alt="kh마크" src="/resources/jpg/2017_kh_mark.png">	
			</img>
			</a>
		</div>
</body>
</html>