<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%-- Head --%>
	<%@ include file="head.jsp" %>
	<link rel="stylesheet" href="css/partials/galeria.css">
</head>
<body>
	<% session.setAttribute("local", "galeria.jsp");%>
	
    <%-- Header --%>
  	<%@ include file="header.jsp" %>
<div class="row">
	<span><p><fmt:message key="index.galeria" /></p></span>
  <div class="col-md-12">

    <div id="mdb-lightbox-ui"></div>

    <div class="mdb-lightbox">

      <figure class="col-md-4">
        <a href="images/galeria/Clock.jpg" data-size="1300x1067">
          <img alt="picture" src="images/galeria/Clock.jpg" class="img-fluid">
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Delorean1.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Delorean1.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Delorean3.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Delorean3.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/DeloreanTimeTravel.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/DeloreanTimeTravel.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Doc1.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Doc1.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Doc3.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Doc3.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Einstein.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Einstein.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/GeorgeeBiff.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/GeorgeeBiff.jpg" class="img-fluid" />
        </a>
      </figure>

      <figure class="col-md-4">
        <a href="images/galeria/Lorraine.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Lorraine.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/Lorraine2.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Lorraine2.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/Marty1.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Marty1.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/Marty3.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Marty3.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/Marty4.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/Marty4.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/MartyandDoc.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/MartyandDoc.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/MartyandDoc1.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/MartyandDoc1.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/MartyandDoc2.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/MartyandDoc2.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/MartyBiffGeorge.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/MartyBiffGeorge.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/terrorist.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/terrorist.jpg" class="img-fluid" />
        </a>
      </figure>
      <figure class="col-md-4">
        <a href="images/galeria/MartyJennifer.jpg" data-size="1600x1067">
          <img alt="picture" src="images/galeria/MartyJennifer.jpg" class="img-fluid" />
        </a>
      </figure>

    </div>

  </div>
</div>

    <%@ include file="footer.jsp" %>
</body>
</html>