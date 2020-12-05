<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%-- Head --%>
	<%@ include file="head.jsp" %>
    <link rel="stylesheet" href="css/partials/index.css">
    <link rel="stylesheet" href="css/partials/fotos.css">
</head>
<body>
	<% session.setAttribute("local", "index.jsp");%>
   	
   	<%-- Header --%>
	<%@ include file="header.jsp" %>
	
    <main>
      <div class="principal">
        <div class="titulo">
            <h2><fmt:message key="index.titulo" /></h2>
        </div>
        <div class="estrada">
            <img id="idTimeline" src="images/timeline.png" alt="Estrada">
            <div id="anosFilme">
            	<div class="btn-group divGroup">
	  				<button id="id1955" type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">1955</button>
		  			<div class="dropdown-menu ano">
		    			<div class="dropdown-divider">
		    				<a class="dropdown-item" href="controllerPrincipal?acao=ano1955"><fmt:message key="index.antes" /></a>
		    			</div>
		    			<div class="dropdown-divider">
		    				<a class="dropdown-item" href="controllerPrincipal?acao=ano1955v2"><fmt:message key="index.depois" /></a>
		    			</div>
		  			</div>
		  		</div>
	  			<div class="btn-group divGroup">
	  				<button id="id1985" type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">1985</button>
		  			<div class="dropdown-menu ano">
		    			<div class="dropdown-divider">
		    				<a class="dropdown-item" href="controllerPrincipal?acao=ano1985"><fmt:message key="index.antes" /></a>
		    			</div>
		    			<div class="dropdown-divider">
		    				<a class="dropdown-item" href="controllerPrincipal?acao=ano1985v2"><fmt:message key="index.depois" /></a>
		    			</div>
		  			</div>
	  			</div>
        	</div>
      	</div>
        <ul id="album-fotos">
			<c:forEach var="personagem" items="${listaPersonagemRetornado}">   
 				<c:if test="${ano == 1955 && versao == 1}">
 					<li id="foto"><a href="controllerPrincipal?acao=personagem&nome=${personagem.getNome()}"><img alt="Imagens Personagens" src="images/1955v1/v1-55-${personagem.getIdPersonagem()}.jpg"><span>${personagem.getNome()}</span></a></li>
 				</c:if>
 				<c:if test="${ano == 1955 && versao == 2}">
 					<li id="foto"><a href="controllerPrincipal?acao=personagem&nome=${personagem.getNome()}"><img alt="Imagens Personagens" src="images/1955v2/v2-55-${personagem.getIdPersonagem()}.png"><span>${personagem.getNome()}</span></a></li>
 				</c:if>
 				<c:if test="${ano == 1985 && versao == 1}">
 					<li id="foto"><a href="controllerPrincipal?acao=personagem&nome=${personagem.getNome()}"><img alt="Imagens Personagens" src="images/1985v1/v1-85-${personagem.getIdPersonagem()}.jpg"><span>${personagem.getNome()}</span></a></li>
 				</c:if>
 				<c:if test="${ano == 1985 && versao == 2}">
 					<li id="foto"><a href="controllerPrincipal?acao=personagem&nome=${personagem.getNome()}"><img alt="Imagens Personagens" src="images/1985v2/v2-85-${personagem.getIdPersonagem()}.jpg"><span>${personagem.getNome()}</span></a></li>
 				</c:if>
			</c:forEach> 
        </ul>    
        <div class="relacionamento">
        	<c:if test="${ano == 1955 && versao == 1}">
        		<h2>Gráfico de Relacionamento</h2>
        		<img alt="Imagens Relacionamentos" src="images/relacionamento/1955-versao1.png">
 			</c:if>
 			<c:if test="${ano == 1955 && versao == 2}">
 				<h2>Gráfico de Relacionamento</h2>
					<img alt="Imagens Relacionamentos" src="images/relacionamento/1955-versao2.png"> 	
					<img alt="Imagens Relacionamentos" src="images/relacionamento/1955-versao2v2.png"> 		
			</c:if>
 			<c:if test="${ano == 1985 && versao == 1}">
 				<h2>Gráfico de Relacionamento</h2>
				<img alt="Imagens Relacionamentos" src="images/relacionamento/1985-versao1.png"> 				
 			</c:if>
 			<c:if test="${ano == 1985 && versao == 2}">
 				<h2>Gráfico de Relacionamento</h2>
				<img alt="Imagens Relacionamentos" src="images/relacionamento/1985-versao2.png">  				
			</c:if>
        </div>
   </main>
    <%-- Footer --%>
	<%@ include file="footer.jsp" %>
</body>

</html>