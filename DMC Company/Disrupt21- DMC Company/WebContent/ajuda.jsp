<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%-- Head --%>
	<%@ include file="head.jsp" %>
  <link rel="stylesheet" href="css/partials/ajuda.css">
</head>
<body>
	<% session.setAttribute("local", "ajuda.jsp");%>
	
	<%-- Header --%>
  	<%@ include file="header.jsp" %>
  	
  <main class="main">
    <div class="duvidasFrequentes">
      <p><fmt:message key="main.duvidas" /></p>
          <!-- Pergunta 1 -->
    <div class="panel-group">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4 class="panel-title">
            <a data-toggle="collapse" href="#collapse1"><fmt:message key="ajuda.p1" /></a>
          </h4>
        </div>
        <div id="collapse1" class="panel-collapse collapse in">
          <div class="panel-body"><fmt:message key="ajuda.r1"/></div>
        </div>
      </div>
    </div>
    <!-- Pergunta 2 -->
    <div class="panel-group">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4 class="panel-title">
            <a data-toggle="collapse" href="#collapse2"><fmt:message key="ajuda.p2"/></a>
          </h4>
        </div>
        <div id="collapse2" class="panel-collapse collapse">
          <div class="panel-body"><fmt:message key="ajuda.r2"/></div>
        </div>
      </div>
    </div>
    <!-- Pergunta 3 -->
    <div class="panel-group">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4 class="panel-title">
            <a data-toggle="collapse" href="#collapse3"><fmt:message key="ajuda.p3"/></a>
          </h4>
        </div>
        <div id="collapse3" class="panel-collapse collapse">
          <div class="panel-body"><fmt:message key="ajuda.r3"/></div>
        </div>
      </div>
    </div>
        <!-- Pergunta 4 -->
        <div class="panel-group">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" href="#collapse4"><fmt:message key="ajuda.p4"/></a>
              </h4>
            </div>
            <div id="collapse4" class="panel-collapse collapse">
              <div class="panel-body"><fmt:message key="ajuda.r4"/></div>
            </div>
          </div>
        </div>
        <!-- Pergunta 5 -->
        <div class="panel-group">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" href="#collapse5"><fmt:message key="ajuda.p5"/></a>
              </h4>
            </div>
            <div id="collapse5" class="panel-collapse collapse">
              <div class="panel-body"><fmt:message key="ajuda.r5"/></div>
            </div>
          </div>
        </div>
  </div>
    <div class="formulario">
      
      <form action="controllerPrincipal?acao=inserir" method="POST" name="dadosContato" id="idFormContato">
        <p><fmt:message key="main.contato" /></p>
        <input type="text" name="nome" id="idNome" placeholder='<fmt:message key="form.nome" />'>
        <input type="email" name="email" id="idEmail" placeholder='<fmt:message key="form.email" />'>
          <input type="text" name="cpf" id="idCpf" placeholder='<fmt:message key="form.cpf" />'>
        <textarea name="descricao" id="idDuvida" placeholder='<fmt:message key="form.duvida" />'></textarea>
        <% if(request.getAttribute("msg") != null){ %>
			<span class="spanValidacao"><%= request.getAttribute("msg") %></span>
		<% } %>
        <span class="spanValidacao"></span>
        <input type="button" name="btn" id="idBtn" value='<fmt:message key="form.enviar" />'>
      </form>
    </div>
  </main>
  <%-- Footer --%>
  <%@ include file="footer.jsp" %>
<script src="scripts/validacaoForm.js"></script>
</body>

</html>