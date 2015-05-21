<%-- 
    Document   : cocinas
    Created on : 28/07/2014, 09:04:17 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>



  <link href="css/Estilo.css" rel="stylesheet" type="text/css" />
  <link href="css/css.css" rel="stylesheet" type="text/css" />


 
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
    
              <a class="thumb" href="imagenes/8.png"></a>
          
                <img src="imagenes/cocinas/qwe.jpg" alt="two" />
                     <footer>
                  <a href="cocinas.jsp"><h2>Cocinas</h2></a>
     
                  </footer>
             
                <div class="caption">
                 
            </li>
    


            

            <li>
              <img src="imagenes/cajones/qw.jpg"  alt="two" />
                <footer>
                  <a href="cajones.jsp"><h2>Cajones</h2></a>
     
                  </footer>
              <div class="caption">
            </li>

            <li>
          <img src="imagenes/B/k.jpg"  alt="two" />
               <footer>
                  <a href="baños.jsp"><h2>Baños</h2></a>
     
                  </footer>
              <div class="caption">
            </li>

            <li>
               <img src="imagenes/comedores/aw.jpg"  alt="two" />
               <footer>
                  <a href="comedores.jsp"><h2>Comedores</h2></a>
     
                  </footer>
              <div class="caption">
            </li>

            <li>
            <img src="imagenes/muebles/er.jpg" alt="two" />
            <footer>
                  <a href="muebles.jsp"><h2>Muebles</h2></a>
     
                  </footer>
              <div class="caption">
            </li>

            

        </div>

  <div id=""style="position:absolute; width:570px; right:20px; heigth:2px; z-index:20">
    <footer>
      
      <li><a target="_blank" href="https://www.youtube.com/watch?v=kRdNqRBSVIQ&index=1&list=UUF0SRft4VwkSR4sYDBE9vxg"><h2>Aqu&#237; puede observar nuestro trabajo.</h2></a></li>

    </footer>
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