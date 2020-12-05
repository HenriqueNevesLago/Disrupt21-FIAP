<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <link rel="stylesheet" href="css/partials/downloads.css">
  <%@ include file="head.jsp" %>
</head>
<body>
	<% session.setAttribute("local", "downloads.jsp");%>
	
	<%-- Header --%>
    <%@ include file="header.jsp" %>
    <main class="main">
        <div>
            <a href="https://github.com/NailAgilers/Disrupt21/raw/main/Entrega%20sprint%201/Agile/Trabalho%20DISRUPT21%20Agile.pdf"><img src="images/downloadIcon.png" alt=""><fmt:message key="index.uml" /></a>
            <a href="https://github.com/NailAgilers/Disrupt21/raw/main/Banco%20de%20dados/Scripts/Scripts_DDL_e_DML.rar"><img src="images/downloadIcon.png" alt=""><fmt:message key="index.war" /></a>
            <a href="https://github.com/NailAgilers/Disrupt21/raw/main/Entrega%20sprint%202/Modelo%20de%20Classifica%C3%A7%C3%A3o.zip"><img src="images/downloadIcon.png" alt="">Machine Learning</a>
        </div>
    </main>
	<%@ include file="footer.jsp" %>
</body>
</html>