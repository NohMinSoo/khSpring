<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KH 정보 교육원 - 교육과정</title>

</head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="/resources/css/curriculum_css.css" rel="stylesheet" type="text/css">

<body>
	<div id="wrapper">
		<div id="header">
			<jsp:include page="/resources/common/main_header.jsp"></jsp:include>
		</div>
		<div id="navigator">
			<jsp:include page="/resources/common/main_navigator.jsp"></jsp:include>
		</div>
		<div id="contents">
			<div id="content_1">
				
			</div>
			<div id="content_2">
				<div id="class_link">
					<a id="gukgi_1" href="/edu/curriculumList.kh?reqPage=1"></a>
					<a id="gukgi_2" href="/edu/curriculumList.kh?reqPage=1"></a>
					<a id="gukgi_3" href="/edu/curriculumList.kh?reqPage=1"></a> 
					<ul class="left">
						<c:forEach begin="0" end="${classInfo.size() }" items="${classInfo }" var="classInfo">
							<c:if test="${classInfo.classType == 'security' }">
								<li><a href="/edu/curriculuminfo.kh?classNo=${classInfo.classNo }">· <c:out value="${classInfo.className }"></c:out> </a></li>
							</c:if>							
						</c:forEach>									
					</ul>
					<ul class="right">
						<c:forEach begin="0" end="${classInfo.size() }" items="${classInfo }" var="classInfo">
							<c:if test="${classInfo.classType == 'programming' }">
								<li><a href="/edu/curriculuminfo.kh?classNo=${classInfo.classNo }">· <c:out value="${classInfo.className }"></c:out> </a></li>
							</c:if>							
						</c:forEach>
					</ul>
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
</body>
</html>






