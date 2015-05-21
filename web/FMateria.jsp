<%-- 
    Document   : materia
    Created on : 28/07/2014, 09:09:28 PM
    Author     : Usuario
--%>


<%@page import="chalo.entidades.Materia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
        String codigo = request.getParameter("txtcodigo");
        String medida = request.getParameter("cbomedida");
        String fechai = request.getParameter("txtingreso");
        String fechav = request.getParameter("txtingresov");
        String estado = request.getParameter("cboestado");
        String descripcion = request.getParameter("txtcomentarios");
       
        
    String men1 = (String) request.getAttribute("mensaje");
    String dat1 = (String) request.getAttribute("datos");
  List<Materia> LP = (List<Materia>) request.getAttribute("Listado")!=null? 
            (List<Materia>) request.getAttribute("Listado"):null;
 Materia mat=(Materia) request.getAttribute("datomateria")!=null?
          (Materia) request.getAttribute("datomateria"):null;
 //los datos estan cargadoes en un usu(objeto) detipo Usuario
 //cargamos los datos en las variables
 if(mat!=null){
     codigo=mat.getCodigo();
     medida=mat.getMedida();
     fechai=mat.getFechai();
     fechav=mat.getFechav();
     estado=mat.getEstado();
     descripcion=mat.getDescripcion();
    
     
}//fin si 
         
 
String ed =(String) request.getAttribute("actualizar")!=null?      
        (String) request.getAttribute("actualizar"):""; 
 
%>  

 <script type="text/javascript" src="js/validar.js"></script>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ebanisteria Chalo</title>
    <link rel="stylesheet" type="text/css" href="css/estil.css"></link>
    <script type="text/javascript" src="js/validar.js"> </script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
  <script src="js/jquery-1.10.2.js"></script>
  <script src="js/jquery-ui.js"></script>
  <link rel="stylesheet" href="css/style.css">
  <script>
  $(function() {
    $( "#fechai" ).datepicker();
  });
  
   $(function() {
    $( "#fechav" ).datepicker();
  });
  </script>
    
    
    
    
    
</head>
<div id="materia">
     
 
<form name="xform" id=" " method="POST" action="./MateriaServlet">
<h1><center>Materia Prima</h1></center>

<h1><center>Ebanistería y Carpintería "Chalo"</h1></center>
<table>
<tr>

</tr>
<tr>
<td>C&#243;digo</td>
<td><input type="text" name="txtcodigo" <%=ed%> class="texto" value="<%=codigo!=null?codigo:""%>" placeholder="Ingrese c&#243;digo" onkeypress="return numeros(event); "
id="" size="12" maxlength="10">
</td>



<td>Uni. Medida</td>
<td>
    
<select name="cbomedida" class="texto">
<option value="">Seleccione</option>
<option value="Kg" <%if("Kg".equals(medida)){%>selected<% }%> >Kg</option>
<option value="Gl" <%if("Gl".equals(medida)){%>selected<% }%> >Gl</option>
<option value="Lt" <%if("Lt".equals(medida)){%>selected<% }%> >Lt</option>
<option value="Ml" <%if("Ml".equals(medida)){%>selected<% }%> >Ml</option>
<option value="Cms" <%if("Cms".equals(medida)){%>selected<% }%> >Cms</option>
<option value="M3" <%if("M3".equals(medida)){%>selected<% }%> >M3</option>
</select>

</tr>
<tr>
<td>Fecha Ingreso</td>
<td><input type="text" name="txtingreso" id ="fechai" value="<%=fechai!=null?fechai:""%>"  placeholder="Ingrese fecha"
id="" size="12" maxlength="10">
</td>


<td>Fecha Vto.</td>
<td><input type="text" name="txtingresov"  id ="fechav"  value="<%=fechav!=null?fechav:""%>"  placeholder="Ingrese fecha" id="" size="12" maxlength="10">
</td>
</tr>

   <td>Estado</td>
   <td><select  name="cboestado" class="texto">
   <option value="">Seleccione</option>
     <option value="Activo"<%if("Activo".equals(estado)){%>selected<% }%>>Activo</option>
     <option value="Inactivo"<%if("Inactivo".equals(estado)){%>selected<% }%>>Inactivo</option>


</tr>
<td colspan="2">Descripción materia</td>
</tr>

<tr><td colspan="2"><textarea cols="35" rows="7" name="txtcomentarios" value="<%=descripcion!=null?descripcion:""%>" placeholder="Ingrese descripción de tarea asignada">
</textarea>
</td>
</tr>

</table>

<jsp:include page="FBotones.jsp" flush="true"/>
                <p><%=men1!=null? men1:""%></p>
              <%if(LP!= null ){%>
              <table width="100%" height="200" border="1" cellspacing="3" cellpading=5"">
                  <tr>
                       <td>Código</td>       
                       <td>Unid. Medida</td>
                       <td>Fecha Ingreso</td>
                       <td>Fecha Vto.</td>    
                       <td>Estado</td>      
                       <td>Descripcion</td>
                   
                      
                  </tr>
                  <!--Recorrer para cargar datos-->
                  <%for(Materia us:LP){%>
                  <tr>
                      
                      <td><%=us.getCodigo()%></td>
                      <td><%=us.getMedida()%></td>
                      <td><%=us.getFechai()%></td>
                      <td><%=us.getFechav()%></td>
                      
                      
                      <td><%=us.getEstado()%></td>
                      <td><%=us.getDescripcion()%></td>
                       
                      <td><a href="./MateriaServlet?action=buscar&txtcodigo=<%=us.getCodigo()%>"><img src="imagenes/au.png" border="0" ></a></td>
                  
                             
                      
                      
                  </tr>
                  <%}%>
                  
              </table>
              <%}%>




</form>
