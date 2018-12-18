<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<style>
.accordion {
  background-color: #eee;
  color: #444;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
  transition: 0.4s;
}

.active, .accordion:hover {
  background-color: #ccc; 
}

.panel {
  padding: 0 0px;
  display: none;
  background-color: white;
  overflow: hidden;
}
.panel ul   {
	margin:0;
	padding-left:20px;
	
}
.panel li{
	margin-bottom: 7px;
}

</style>
<body>
<button class="accordion">Security</button><br>
<div class="panel">
  	<ul>
  	<c:forEach begin="0" end="${pd.classInfoNameList.size() }"	items="${pd.classInfoNameList }" var="classInfo">
		<c:if test="${classInfo.classType == 'security' }">		
			
			<li><a href="/edu/curriculuminfo.kh?classNo=${classInfo.classNo }" <c:if test="${classInfo.classNo == classNo }">style="font-weight:900;font-size:1.1em;"</c:if>><c:out value="${classInfo.className }"/></a></li>								
		</c:if>							
	</c:forEach>
		</ul>
</div>

<button class="accordion">Programming</button><br>
<div class="panel">
	<ul>
  <c:forEach begin="0" end="${pd.classInfoNameList.size() }"	items="${pd.classInfoNameList }" var="classInfo">
		<c:if test="${classInfo.classType == 'programming' }">			
			<li><a href="/edu/curriculuminfo.kh?classNo=${classInfo.classNo }" <c:if test="${classInfo.classNo == classNo }">style="font-weight:900;font-size:1.1em;"</c:if>><c:out value="${classInfo.className }"/></a></li>									
		</c:if>							
	</c:forEach>
	</ul>
</div>

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
 	
	acc[i].addEventListener("click", function() {
		this.classList.toggle("active");
		var panel = this.nextElementSibling.nextElementSibling;
		if (panel.style.display === "block") {
			panel.style.display = "none";				
		} else {
			for(var j=0;j<acc.length;j++){
				//acc[j].nextElementSibling.nextElementSibling.style.dilplay = "none";
				document.getElementsByClassName("panel")[j].style.display="none";
			}
			panel.style.display = "block";
			
		}
	});
}
</script>

</body>
</html>