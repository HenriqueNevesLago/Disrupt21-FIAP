 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <footer id="myFooter">
    <div class="container">
      <div class="row">
        <div class="col-sm-3">
          <h2 class="logo"><a href="index.html"> <img class="imgLogo" src="images/logo.png" alt="Logo"> </a></h2>
        </div>
        <div class="col-sm-2">
          <h5> <fmt:message key="foot.inicio" /> </h5>
          <ul>
            <li><a href="index.jsp"><fmt:message key="foot.home" /></a></li>
            <li><a href="quemSomos.jsp"><fmt:message key="foot.sobre" /></a></li>
            <li><a href="downloads.jsp">Downloads</a></li>
          </ul>
        </div>
        <div class="col-sm-2">
          <h5><fmt:message key="foot.nos" /></h5>
          <ul>
            <li><a href="quemSomos.jsp"><fmt:message key="foot.info" /></a></li>
            <li><a href="ajuda.jsp"><fmt:message key="foot.contato" /></a></li>
          </ul>
        </div>
        <div class="col-sm-2">
          <h5><fmt:message key="foot.suporte" /></h5>
          <ul>
            <li><a href="">11 991523577</a></li>
            <li><a href="ajuda.jsp">Chat</a></li>
          </ul>
        </div>
        <div class="col-sm-3">
          <div class="social-networks">
            <a href="https://twitter.com/UniversalTVBR" class="twitter"><i class="fa fa-twitter"></i></a>
            <a href="https://www.facebook.com/UniversalPicturesBR" class="facebook"><i class="fa fa-facebook"></i></a>
            <a href="https://www.instagram.com/universalpicsbr/?hl=pt-br" class="instagram"><i
                class="fa fa-instagram"></i></a>
          </div>
          <a href="https://www.instagram.com/universalpicsbr/?hl=pt-br">
            <button type="button" class="btn btn-default"><fmt:message key="foot.contato" /></button>
          </a>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <p>© 2020 Copyright - DMC COMPANY</p>
    </div>
  </footer>