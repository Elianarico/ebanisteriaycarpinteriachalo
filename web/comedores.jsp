<%-- 
    Document   : comedores
    Created on : 28/07/2014, 09:06:05 PM
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
          <li class="current"><a href="index.html">Bienvenidos</a></li>
          <li><a href="empresa.html">La Empresa</a></li>
          <li><a href="productos.html">Productos</a></li>
          <li><a href="inicio.html">Iniciar Sesi&#243;n</a></li>
          <li><a href="contacto.html">Sugerencias</a></li>
          

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
              <a class="thumb" href="imagenes/comedores/50.jpg"><img src="imagenes/comedores/4.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/comedores/1.jpg"><img src="imagenes/comedores/7.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/comedores/42.png"><img src="imagenes/comedores/42.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/comedores/43.png"><img src="imagenes/comedores/43.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/comedores/44.png"><img src="imagenes/comedores/44.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
           <a class="thumb" href="imagenes/comedores/45.png"><img src="imagenes/comedores/45.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/comedores/46.png"><img src="imagenes/comedores/46.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
                <a class="thumb" href="imagenes/comedores/47.png"><img src="imagenes/comedores/47.jpg"  alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/comedores/12.png"><img src="imagenes/comedores/68.jpg"  alt="two" /></a>
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