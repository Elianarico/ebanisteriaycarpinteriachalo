<%-- 
    Document   : contacto
    Created on : 28/07/2014, 09:02:17 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="css/Estilo.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>   
    <script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
    <script type="text/javascript">
        $(window).load(function() {
            $('#slider').nivoSlider();
        });
    </script> 
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
    <div id="main">
        <div id="menubar">
            <div id="Bienvenidos"> </div>	
             <jsp:include page="MenuGeneral.jsp" flush="true"/>
           

            <div id="site_content">	
                
                <div id="banner_image">
                    <div id="slider" >
                        <img src="imagenes/Cafe5.png" />
                        
                        <img src="imagenes/er.jpg" />
                        <img src="imagenes/f.jpg" />
                        <img src="imagenes/fea.jpg" />
                        <img src="imagenes/fas.jpg" />
                        
                        
                        </div>
                    </div>
                
            </div>		

	  <div class="sidebar_container">       
		<div class="sidebar">
          <div class="sidebar_item">
            <h2>Nuestro sitio web</h2>
            <p>Bienvenido a nuestro sitio web. Por favor eche un vistazo a nuestra p&#225;gina y cualquier comentario o sugerencia ser&#225; muy apreciado.</p>
          </div>
        </div> 		
	<div class="sidebar">
          <div class="sidebar_item">
            <h2>Cont&#225;ctenos</h2>
            
            <p>Puede comunicarse con nosotros en el n&#250;mero telef&#243;nico 477-31-71 o nos puede encontrar en la direcci&#243;n Cra 75B #97-20</p>         
		  </div> 
        </div>
	  <div class="sidebar">	
          <div class="sidebar_item">
            
                    
		  </div>
      
     </div>
      </div> 
      <div id="content">
        <div class="content_item">
		  <div class="form_settings">
            <h1>Sugerencias</h1>
                       <p>Se&#241;or usuario si usted tiene alg&#250;n reclamo, queja o sugerencia puede cont&#225;ctarnos en nuestro correo electr&#243;nico ebanisteriaycarpinteriachalo@gmail.com o deje su comentario, recuerde que estamos a sus servicios con la mayor disponibilidad. La informaci&#243;n requerida por ustedes es de vital importancia para mejorar la calidad de nuestra empresa</p>
			<p>&nbsp;</p>
			<p><span>Nombre(s)</span><input class="nombre" type="text" name="nombre" value="" /></p>
                        <p><span>Apellidos</span><input class="apellido" type="text" name="apellido" value="" /></p>
			<p><span>Correo electr&#243;nico</span><input class="contact" value="ebanisteriachalo@gmail.com"type="text" name="correo" value="" /></p>
			<p><span>Mensaje</span><textarea class="mensaje" textarea" rows="8" cols="50" name="mensaje"></textarea></p>
       
            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="enviar" value="Enviar" /></p>
     

 
  </div>
  
	
  
</body>
</html>
