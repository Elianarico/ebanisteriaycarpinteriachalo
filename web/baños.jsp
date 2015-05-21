<%-- 
    Document   : baños
    Created on : 28/07/2014, 09:05:44 PM
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

   <jsp:include page="MenuGeneral.jsp" flush="true"/>
  


    <div id="site_content">

      <div id="gallery" class="content">
        <div class="slideshow-container">
          
          <div id="slideshow" class="slideshow"></div>
        </div>
      </div>
     
        <div id="thumbs" class="navigation">
       
          <ul class="thumbs noscript">
           
            <li>
              <a class="thumb" href="imagenes/B/1.jpg"><img src="imagenes/B/12.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/B/2.jpg"><img src="imagenes/B/18.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/B/3.jpg"><img src="imagenes/B/21.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/B/2.jpg"><img src="imagenes/B/24.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/B/4.jpg"><img src="imagenes/B/48.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
           <a class="thumb" href="imagenes/B/5.jpg"><img src="imagenes/B/49.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
               <a class="thumb" href="imagenes/B/6.jpg"><img src="imagenes/B/50.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
                <a class="thumb" href="imagenes/B/7.jpg"><img src="imagenes/B/51.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
              <a class="thumb" href="imagenes/B/8.jpg"><img src="imagenes/B/52.jpg" alt="two" /></a>
              <div class="caption">
            </li>

            <li>
             <a class="thumb" href="imagenes/B/10.jpg"><img src="imagenes/B/54.jpg" alt="two" /></a>
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
