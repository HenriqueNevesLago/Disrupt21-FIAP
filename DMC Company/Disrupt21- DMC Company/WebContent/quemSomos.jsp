<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
	<%@ include file="head.jsp" %>
    <link rel="stylesheet" href="css/partials/quemSomos.css">
  </head>
  <body>
    <% session.setAttribute("local", "quemSomos.jsp");%>
    
    <%-- Header --%>
  	<%@ include file="header.jsp" %>
    <main>
      <section id="sobreNos">
        <img alt="Imagem fiap" src="images/fiap.png">
        <section>
          <p><fmt:message key="sobre.nos" /></p>
        </section>
      </section>
      <section id="sobreProjeto">
        <section>
          <p><fmt:message key="sobre.projeto"/></p>
        </section>
        <img src="images/logo.png" alt="Logo do projeto">
      </section>
    </main>
	<%@ include file="footer.jsp" %>
  </body>
</html>
