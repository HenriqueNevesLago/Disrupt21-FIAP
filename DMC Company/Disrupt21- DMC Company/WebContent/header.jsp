<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<header class="header">
    <a href="controllerPrincipal?acao2=index"><img class="imgLogo" src="images/logo.png" alt="Logo"></a>
    <nav>
      <ul>
        <div class="btn-group">
  			<button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    			<fmt:message key="menu.idioma" />
  			</button>
	  		<div class="dropdown-menu">
	    	<a class="dropdown-item" href="controllerPrincipal?lingua=pt-br&local=${local}"><fmt:message key="idioma.pt" /></a>
	    	<div class="dropdown-divider">
	    	<a class="dropdown-item" href="controllerPrincipal?lingua=en&local=${local}"><fmt:message key="idioma.en" /></a>
	    	</div>
	    	<div class="dropdown-divider">
	    	<a class="dropdown-item" href="controllerPrincipal?lingua=es&local=${local}"><fmt:message key="idioma.es" /></a>
	    	</div>
	  		</div>
		</div>
        <li><a href="controllerPrincipal?acao2=quemSomos"><fmt:message key="menu.sobre" /></a></li>
        <li><a href="controllerPrincipal?acao2=download">DOWNLOADS</a></li>
        <li><a href="controllerPrincipal?acao2=galeria"><fmt:message key="menu.galeria" /></a></li>
        <li><a href="controllerPrincipal?acao2=machine">IA</a></li>
        <li><a href="controllerPrincipal?acao2=ajuda"><fmt:message key="menu.ajuda" /></a></li>
      </ul>
    </nav>
</header>


<%--<div id="divBandeiras">
          <li>
            <a href="controllerPrincipal?lingua=pt-br">
              <img alt="bandeira brasileira" src="images/br2.png">
            </a>
          </li>
          <li>
            <a href="controllerPrincipal?lingua=en">
              <img alt="bandeira estadunidense" src="images/us1.jpg">
            </a>
          </li>
          <li>
            <a href="controllerPrincipal?lingua=es">
              <img alt="bandeira espanhola" src="images/es.jpg">
            </a>
          </li>
        </div> --%>