<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	 	<%-- Head --%>
	 	<link rel="stylesheet" href="css/partials/ia.css">
		<%@ include file="head.jsp" %>
	</head>
	<body>
		<% session.setAttribute("local", "machineLearning.jsp"); %>
	
		<%-- Header --%>
	  	<%@ include file="header.jsp" %>
		<main class="main">
			<div id="div1">
				<h2>Machine Learning</h2>
				<p class="parag1"><fmt:message key="ai.p1" /></p>
				<p class="parag2"><fmt:message key="ai.p2" /></p>
			</div>
			
			<div id="div2">
				<a href="https://github.com/NailAgilers/Disrupt21/raw/main/Entrega%20sprint%202/Modelo%20de%20Classifica%C3%A7%C3%A3o.zip"><img src="images/downloadIcon.png" alt="">  Machine Learning</a>
			</div>
		</main>
		<%@ include file="footer.jsp" %>
	</body>
</html>