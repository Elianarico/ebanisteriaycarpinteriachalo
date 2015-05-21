<%
    String mensajeError = (String) request.getAttribute("mensajeError");
    String identidad = request.getParameter("txtnumero") == null ? "" : request.getParameter("txtnumero");
//String usuario = request.getParameter("identidad");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>


body {
    background:#282828url(../imagenes/background.jpg);
background:  url(imagenes/b.jpg);
</style>

<script type="text/javascript" src="js/validar.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ebanisteria Chalo</title>
<link rel="stylesheet" type="text/css" href="css/estil.css"></link>
<script type="text/javascript" src="js/validar.js"></script>
<script type="text/javascript">
    function popup(url,ancho,alto) {
    var posicion_x; 
    var posicion_y; 
    posicion_x=(screen.width/2)-(ancho/2); 
    posicion_y=(screen.height/2)-(alto/2); 
    window.open(url, "tusitio.com", "width="+ancho+",height="+alto+",menubar=0,toolbar=0,directories=0,scrollbars=no,resizable=no,left="+posicion_x+",top="+posicion_y+"");
    }
    </script>



</head>
<div id="AdminClientes" >


	

<form  name ="xForm" method="POST" action="./Autenticacion" />


<h3><center>Ebanistería y Carpintería "Chalo"</h1></center>

   
   <table>
     <tr>
    <td>Usuario</td>
    <td><input type="text" name="txtnumero" placeholder="Ingrese Identificación" value="<%=identidad%>"
       id="" size="20" maxlength="15">
    </td>

    </tr>
    <tr>
    <td>Contraseña</td>
    <td><input type="password"  name="txtclave" placeholder="Ingrese Contraseña"
       id="" size="20" maxlength="15">
    </td>
    </tr>
    <tr>
    <td colspan="2" align="center"><button type="submit" name="action"  value="ingresar" class="btn1" >Ingresar</button>
    <td>   <a href="javascript:popup('./FEnvioEmail.jsp',400,300)"><img src="imagenes/asf.gif" border="0">¿Olvidó su contraseña?</a></td>
    
    </td>    

    </tr>
    </table>
    <%=mensajeError != null ? mensajeError : ""%>

    </form>

</div>