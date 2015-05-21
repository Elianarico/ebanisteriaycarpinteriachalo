<%-- 
    Document   : FUsuarioo
    Created on : 15/05/2014, 11:38:10 AM
    Author     : Usuario
--%>

<%@page import="chalo.entidades.Mueble"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    
    String codigo = request.getParameter("txtcodigo");
    String tipomueble = request.getParameter("cbotipmueble");
    String costopro = request.getParameter("txtcostopro");
    String costoven = request.getParameter("txtcostoven");
    String estado = request.getParameter("cboestado");
    String descripcion = request.getParameter("txtdescripcion");
  
    
String men =(String) request.getAttribute("mensajes");
String dat =(String) request.getAttribute("datos");
List<Mueble>LU=(List<Mueble>) request.getAttribute("listado")!=null?
        (List<Mueble>) request.getAttribute("listado"):null;
Mueble usu=(Mueble) request.getAttribute("datomueble") !=null?
        (Mueble) request.getAttribute("datomueble"):null;
//los datos estan cargado en usu(objeto) de tipo Usuario
//cargamos los datos en las variables
                if(usu!=null){
                    
               codigo= usu.getCodigo();
                tipomueble= usu.getTipomueble();
               costopro= usu.getCostopro();
               costoven= usu.getCostoven();
                estado= usu.getEstado();
                descripcion= usu.getDescripcion();
              
}//fin si
                
String co =(String) request.getAttribute("actualizar")!=null?      
        (String) request.getAttribute("actualizar"):"";
%>



<html>
<head>
<div id=""style="position:absolute; width:655px; heigth:400px; z-index:1; left:300px; top:68">	
 <script type="text/javascript" src="js/validar.js">
           
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ebanisteria Chalo</title>
    <link rel="stylesheet" type="text/css" href="css/estil.css"></link>
    <script type="text/javascript" src="js/validar.js"> </script>
</head>
<div id="mueble">


<body>


   
 </head>

<form name="xform" id=" " method="POST" action="./MuebleServlet">

<h1><center>MUEBLES</h1></center>


<table>
<tr>

</tr>
<tr>
<td>Código</td>
<td><input type="text" name="txtcodigo"  class="texto" placeholder="Ingrese Código"
id="" size="25" maxlength="25">
</td>

<td>Tipo de Mueble</td>
<td>
<select name="cbomueble" id="">
<option value="">Seleccione</option>
<option value="Baños"> <%if("Baños".equals(tipomueble)){%>selected<%}%>>Baños</option>
<option value="Cocinas"><%if("Cocinas".equals(tipomueble)){%>selected<%}%>>Cocinas</option>
<option value="Comedores"> <%if("Comedores".equals(tipomueble)){%>selected<%}%>>Comedores</option>
<option value="Muebles"><%if("Muebles".equals(tipomueble)){%>selected<%}%>>Muebles</option>
</select>

</td>
<tr>
<td>Costo Producción</td>
<td><input type="text" name="txtcosto" placeholder="Ingrese Costo de Producción"
id="" size="25" maxlength="25">
</td>


<td>Costo de Venta</td>
<td><input type="text" name="txtcosto"  placeholder="Ingrese Costo de Venta"
id="" size="25" maxlength="25">
</td>

<tr>
<td>Estado:</td>
<td> 
<select name="cboestado" id="">
<option value="">Seleccione</option>
<option value="AC"><%if("Activo".equals(estado)){%>selected<% }%>>Activo</option>
<option value="IN"><%if("Inactivo".equals(estado)){%>selected<% }%>>Inactivo</option>
</select>

<tr>
<td colspan="4">Descripción Mueble</td>
</tr>


<tr><td colspan="6"><textarea cols="55" rows="7" name="comentarios" placeholder="Ingrese descripción de mueble a comprar">
</textarea>
</td>
</tr>


</table>
<table></table>
     <jsp:include page="FBotones.jsp" flush="true"/>


<div id=""style="position:absolute; width:655px; heigth:200px; z-index:1; left:500px; top:68"></div>
 <p><%=men%></p>
              <%if(LU!= null ){%>
              <table>
                  <tr>
                       <td>Codigo</td>       
                       <td>Tipo Mueble</td>
                       <td>Costo Produccion</td>   
                       <td>Costo Venta</td> 
                       <td>Estado</td>      
                       <td>Descripcion</td>
                   
                      
                  </tr>
                  <!--Recorrer para cargar datos-->
                  <%for(Mueble us:LU){%>
                  <tr>
                      
                      <td><%=us.getCodigo()%></td>
                      <td><%=us.getTipomueble()%></td>
                      <td><%=us.getCostopro()%></td>
                      <td><%=us.getCostoven()%></td>
                      
                      
                      <td><%=us.getEstado()%></td>
                      <td><%=us.getDescripcion()%></td>
                       
                      <td><a href="./MuebleServlet?action=buscar&txtnumero=<%=us.getCodigo()%>"><img src="imagenes/a.png" border="0" ></a></td>
                  
                             
                      
                      
                  </tr>
                  <%}%>
                  
              </table>
              <%}%>


            </form>
</div>
</html>
</body>
