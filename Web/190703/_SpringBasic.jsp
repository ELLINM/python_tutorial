<!--index-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Parameter 전송</title>
</head>
<body>

	<a href="send5">model practice</a>
	<br>

	<c:if test="${data != null && vo != null}">
	
	data : ${data}<br>
	vo.a : ${vo.a}<br>
	vo.b : ${vo.b}<br>
	
	requestScope.date : ${requestScope.data}<br>
	requestScope.vo.a : ${requestScope.vo.a}<br>
	requestScope.vo.b : ${requestScope.vo.b}<br>

	</c:if>

	<img src = "resources/panda.jpg" />
	<img src = "/web/resources/panda.jpg" />
	<img src = "<c:url value ='resources/panda.jpg' />" />
	<ul>
		<li>
			<h2>
				<a href="send1?a=테스트&b=8989">Send To aTag</a>
			</h2>
		</li>
		<li>
			<h2>Send for Form Tag(get)</h2>
			<form action="send2" method="get">
				<input type="text" name="a"><br> 
				<input type="text" name="b"><br> 
				<input type="submit" value="send">
			</form>
		</li>
		<li>
			<h2>Send for Form Tag(post)</h2>
			<form action="send3" method="post">
				<input type="text" name="a"><br> 
				<input type="text" name="b"><br> 
				<input type="submit" value="send">
			</form>
		</li>
		<li>
			<h2>
				<a href="send4?a=테스트&b=1989">Send for a Tag(VO)</a>
			</h2>
		</li>
	</ul>
</body>
</html>
