<%-- 
    Document   : muebles
    Created on : 28/07/2014, 09:06:37 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>



  <link href="css/Estilo.css" rel="stylesheet" type="text/css" />
  <link href="css/productos.css" rel="stylesheet" type="text/css" />


 
</head>

<body>
  <div id="main">

	<div id="menubar">
	  <div id="BIENVENIDOS">

	
	  </div>
      <div id="menu_items">
	    <ul id="menu">
     <li><a href="index.jsp">Bievenidos</a></li>
          <li><a href="empresa.jsp">La Empresa</a></li>
          <li><a target="_blank" href="productos.jsp">Productos</a></li>
           <li> <a href="init.jsp" target="_blank" onClick="window.open(this.href, this.target, 'toolbar=no, directories=yes, menubar=no, status=no, resizable=yes,scrollbars=no');
            return false;">Iniciar Sesi&#243;n</a></li>       

          <li><a href="contacto.jsp">Sugerencias</a></li>
          

        </ul>
      </div>
    </div>
  


    <div id="site_content">

      <div id="gallery" class="content">
        <div class="slideshow-container">
          
          <div id="slideshow" class="slideshow"></div>
        </div>
      </div>
     
        <div id="thumbs" class="navigation">
       
          <ul class="thumbs noscript">
           
            <li>
              <a class="thumb" href="imagenes/muebles/3.jpg"><img src="imagenes/muebles/23.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/muebles/20.png"><img src="imagenes/muebles/56.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/muebles/23.png"><img src="imagenes/muebles/57.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/muebles/22.png"><img src="imagenes/muebles/58.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/muebles/21.png"><img src="imagenes/muebles/59.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/muebles/19.png"><img src="imagenes/muebles/61.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
                <a class="thumb" href="imagenes/muebles/18.png"><img src="imagenes/muebles/62.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
             <a class="thumb" href="imagenes/muebles/1.png"><img src="imagenes/muebles/79.jpg"  alt="two" /></a>
              <div class="caption">
            </li>    

        </div>

 
  
    

 
  <script type="text/javascript" src="js/jquery.min.js"></script>
 
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>

  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
  </script>
  <script type="text/javascript" src="js/jquery.galleriffic.js"></script>
  <script type="text/javascript" src="js/jquery.opacityrollover.js"></script>
  <script type="text/javascript">
    jQuery(document).ready(function($) {

      // we only want these styles applied when javascript is enabled
      $('div.navigation').css({'width' : '450px', 'float' : 'left'});
      $('div.content').css('display', 'block');
      // initially set opacity on thumbs and add additional styling for hover effect on thumbs
      var onMouseOutOpacity = 0.67;
      $('#thumbs ul.thumbs li').opacityrollover({
        mouseOutOpacity:   onMouseOutOpacity,
        mouseOverOpacity:  1.0,
        fadeSpeed:         'fast',
        exemptionSelector: '.selected'
      });
      // initialize advanced galleriffic gallery
      var gallery = $('#thumbs').galleriffic({


        imageContainerSel:         '#slideshow',
        controlsContainerSel:      '#controls',
  



     });
    });
  </script>
</body>
</html>

