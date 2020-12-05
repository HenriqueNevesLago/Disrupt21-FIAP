<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
  	<%@ include file="head.jsp" %>
    <link rel="stylesheet" href="css/partials/personagem.css">
    <script type="text/javascript" src="scripts/fotos.js"></script>
  </head>
  <body>
    <% session.setAttribute("local", "index.jsp");%>
    
    <%-- Header --%>
  	<%@ include file="header.jsp" %>

    <main>
      <section id="personagem">
        <section id="fotoeNome">
           <c:if test="${ano == 1955 && versao == 1}">
               <img src="images/1955v1/v1-55-${personagemRetornado.getIdPersonagem()}.jpg" alt="Foto do personagem">
           </c:if>
           <c:if test="${ano == 1955 && versao == 2}">
               <img src="images/1955v2/v2-55-${personagemRetornado.getIdPersonagem()}.png" alt="Foto do personagem">
           </c:if>
           <c:if test="${ano == 1985 && versao == 1}">
               <img src="images/1985v1/v1-85-${personagemRetornado.getIdPersonagem()}.jpg" alt="Foto do personagem">
           </c:if>
           <c:if test="${ano == 1985 && versao == 2}">
               <img src="images/1985v2/v2-85-${personagemRetornado.getIdPersonagem()}.jpg" alt="Foto do personagem">
           </c:if>
           
          <h2>${personagemRetornado.getNome()}</h2>
        </section>
        <section id="descricao">
          <p>${personagemRetornado.getDescricao()}
           <br><br>Acontecimentos: ${retornoAcontecimento.size()}</p>

        </section>
      </section>
      <section id="imgsPersonagem">
        <h2><fmt:message key="main.cenas"/></h2>
        <% int cont = 0; %>
        <c:forEach var="acontecimento" items="${retornoAcontecimento}"> 
        		<% cont +=1; %>
        		<span><p>Acontecimento <%= cont %></p></span>
 				<span><p>${acontecimento.getDescricao()}</p></span>
			</c:forEach> 
      </section>
    </main>

   <%@ include file="footer.jsp" %>
  </body>
</html>
