<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
#content-1{
	float:left;
	padding-left:5px;
	width:20%;
}
#content-2{
	float:left;
	width:80%;
	height:100%;
}
#class_info_list{
	height:90%;
}
table.class_info {
    border-collapse: separate;
    border-spacing: 1px;
    text-align: left;
    line-height: 1.5;
    border-top: 1px solid #ccc;
    margin-top : 20px;
}
table.class_info th{
    width: 200px;
    padding: 10px;
    text-align: center;
    font-weight: bold;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
}
.pageNo:link, .pageNo:visited{
	padding: 1px 1px;
  	margin:3px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 20px;
}
.reqPage{
	color:#428bca;
	font-weight: 900;
	font-size: 28px;
}
#pageNavi{
	margin-bottom: 5px;
}

.button3 {
	width:80px;
	height:40px;
  	background-color: white;
 	color: black;
  	border: 2px solid #555555;  	
  	font-size: 15px;
  	font-weight: 900;
  	margin-left: 60px;
}

.button3:hover {
	background-color: #555555;
	color: white;
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
		<div id="contents" style="height:550px;">
		<div id="content-1">
			<jsp:include page="/resources/common/edu_side.jsp"></jsp:include>
		</div>
		
		<div id="content-2">
			<div id="class_info_list">
			<center>
				<table class="class_info">
					<tr>
						<th>No</th>
						<th style="width:600px;">과정명</th>
						<th>분야</th>
					</tr>
				  	<c:forEach begin="0" end="${pd.classInfoList.size() }" items="${pd.classInfoList }" var="classInfo" varStatus="status">						
						<tr>
							<th><c:out value="${status.count +(reqPage-1)*10}"/></th>
							<th style="width:600px;text-align:left;"><a href="/edu/curriculuminfo.kh?classNo=${classInfo.classNo }"><c:out value="${classInfo.className }"/></a></th>
							<th><c:out value="${classInfo.classType }"/></th>
						</tr>										
					</c:forEach>				        
				</table>				
			</center>	
					
			</div>			
				<div id="pageNavi">
					<button type="button" class="button3" onclick="writeInfo();">글쓰기</button>
					
					<span style="float:right; margin-right: 80px;">${pd.pageNavi }</span>
					
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
	</div>
<script type="text/javascript">
	function writeInfo(){
		location.href="/edu/write.kh";
	}
</script>	
</body>
</html>