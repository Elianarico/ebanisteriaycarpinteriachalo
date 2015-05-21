<%-- 
    Document   : cajones
    Created on : 28/07/2014, 09:05:51 PM
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
              <a class="thumb" href="imagenes/cajones/1.jpg"><img src="imagenes/cajones/2.jpg" alt="two" /></a>
              <div class="caption">
            </li>


            <li>
              <a class="thumb" href="imagenes/cajones/6.jpg"><img src="imagenes/cajones/8.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/cajones/7.jpg""><img src="imagenes/cajones/9.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/cajones/15.jpg"><img src="imagenes/cajones/10.jpg"alt="two" /></a>
              <div class="caption">
            </li>

            <li>
           <a class="thumb" href="imagenes/cajones/f.jpg"><img src="imagenes/cajones/11.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/cajones/a.jpg"><img src="imagenes/cajones/13.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
                <a class="thumb" href="imagenes/cajones/e.jpg"><img src="imagenes/cajones/14.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/cajones/v.jpg"><img src="imagenes/cajones/16.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
             <a class="thumb" href="imagenes/cajones/l.jpg"><img src="imagenes/cajones/17.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/g.jpg"><img src="imagenes/cajones/19.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/4.jpg"><img src="imagenes/cajones/22.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/17.png"><img src="imagenes/cajones/63.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/16.png"><img src="imagenes/cajones/64.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/15.png"><img src="imagenes/cajones/65.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/14.png"><img src="imagenes/cajones/66.jpg" alt="two" /></a>
              <div class="caption">
            </li>

        <li>
             <a class="thumb" href="imagenes/cajones/13.png"><img src="imagenes/cajones/67.jpg" alt="two" /></a>
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

