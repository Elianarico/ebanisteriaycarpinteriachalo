<%-- 
    Document   : proveedor
    Created on : 2/10/2014, 08:55:05 AM
    Author     : Usuario
--%>

<%@page import="chalo.entidades.Tarea"%>
<%@page import="chalo.entidades.Gestion"%>


<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    //consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,
  //hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador 
    //,  estado ,  total_horas
    
        String consecutivo = request.getParameter("txtconsecutivo");
        String idempleado = request.getParameter("txtidempleado");
        String codmueble = request.getParameter("txtcodmueble");
        String idtarea = request.getParameter("cbotarea");
        String cantidad = request.getParameter("txtcantidad");
        String fecha_sistema = request.getParameter("txtfecha_sistema");
        String hora_Inicial = request.getParameter("txthora_Inicial");
        String hora_final = request.getParameter("txthora_final");
        String cant_terminadas = request.getParameter("txtcant_terminadas");
        String cant_pendientes = request.getParameter("txtcant_pendientes");
        String usuariocreador = request.getParameter("txtusuariocreador");
        String estado = request.getParameter("cboestado");
        String total_horas = request.getParameter("txttotal_horas");
       
        
    String men = (String) request.getAttribute("mensaje");
    String dat = (String) request.getAttribute("datos");
 List<Gestion> LP = (List<Gestion>) request.getAttribute("Listado")!=null? (List<Gestion>) request.getAttribute("Listado"):null;
    List<Tarea> LT = (List<Tarea>) request.getAttribute("ListadoTareas")!=null? (List<Tarea>) request.getAttribute("ListadoTareas"):null;
 
 
 
 Gestion ges=(Gestion) request.getAttribute("datogestion")!=null?
          (Gestion) request.getAttribute("datogestion"):null;
 //los datos estan cargadoes en un usu(objeto) detipo Usuario
 //cargamos los datos en las variables
 if(ges!=null){
     consecutivo=ges.getConsecutivo();
     idempleado=ges.getIdempleado();
     codmueble=ges.getCodmueble();
     idtarea=ges.getIdtarea();
     cantidad=ges.getCantidad();
     fecha_sistema=ges.getFecha_sistema();
     hora_Inicial=ges.getHora_Inicial();
     hora_final=ges.getHora_final();
     cant_terminadas=ges.getCant_terminadas();
     cant_pendientes=ges.getCant_pendientes();
     usuariocreador=ges.getUsuariocreador();
     estado=ges.getEstado();
     total_horas=ges.getTotal_horas();
 
     
}//fin si 
         
String ed =(String) request.getAttribute("actualizar")!=null?      
        (String) request.getAttribute("actualizar"):""; 
 
%>   


<html>
<head>

 <script type="text/javascript" src="js/validar.js">
           
            
        </script>
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
    $( "#fechasis" ).datepicker();
  });
  
   $(function() {
    $( "#fechafin" ).datepicker();
  });
  </script>
    
    
    
</head>
<div id="gestion">


<body>


   
 </head>

 <form name="xform"  method="POST" action="./GestionServlet">
<h1><center>Gestión de Tareas</h1></center>    
<h1><center>Ebanistería y Carpintería "Chalo"</h1></center>


<table>
<tr>

</tr>
<tr>
       
                     
<td>Consecutivo</td>
<td>
<input type="text" name="txtconsecutivo"  class="texto" value="<%=consecutivo!=null?consecutivo:""%>" placeholder="Ingrese consecutivo" onkeypress="return numeros(event); "
id="" size="15" maxlength="15">   

<td>Id Empleado</td>
<td><input type="text" name="txtidempleado" class="texto" value="<%=idempleado!=null?idempleado:""%>" placeholder="Ingrese Id empleado" onkeypress="return numeros(event); "
id="" size="15" maxlength="15">
</td>
    
 </tr>
<tr>
        
    
<td>Código Mueble</td>
<td><input type="text"  name="txtcodmueble" class="texto" value="<%=codmueble!=null?codmueble:""%>" placeholder="Ingrese código"
id="" size="15" maxlength="15"></td>
                     

<td>Id Tarea</td>
 <td><select  name="cbotarea" class="texto">
   <option value="">Seleccione</option>
    <%if(LT!=null){%>
    <%for (Tarea t :LT ){%>
    <option value="<%=t.getCodigo()%>"> <%=t.getDescripcion()  + " Costo: " +  t.getCosto_hora()   %></option>
     <%}%> 
     <%}%> 
    
    
    
</td>


   </tr>
<tr>
                    
<td>Cantidad</td>
<td><input type="text" name="txtcantidad" class="texto" value="<%=cantidad!=null?cantidad:""%>" placeholder="Ingrese cantidad"
id="" size="15" maxlength="15">


<td>Fecha Sistema</td>
<td><input type="text=" name="txtfecha_sistema"  id ="fechasis"value="<%=fecha_sistema!=null?fecha_sistema:""%>" placeholder="Ingrese fecha"
id="" size="15" maxlength="15">

</tr>
<tr>
<td>Hora Inicial</td>
<td><input type="text" value="<%=hora_Inicial!=null?hora_Inicial:""%>" name="txthora_Inicial"id="" size="15" maxlength="15" >
</td>


<td>Hora Final</td>
<td><input type="text" name="txthora_final"value="<%=hora_final!=null?hora_final:""%>" placeholder="Ingrese hora final" onkeypress="return numeros(event); "
id="" size="15" maxlength="15">


</tr>
<tr>
<td>Cantidades Terminadas</td>
<td><input type="text" name="txtcant_terminadas"value="<%=cant_terminadas!=null?cant_terminadas:""%>" placeholder="Ingrese terminadas" onkeypress="return numeros(event); "
id="" size="15" maxlength="15">
</td>


<td>Cantidades Pendientes</td>
<td><input type="text" name="txtcant_pendientes" class="texto" value="<%=cant_pendientes!=null?cant_pendientes:""%>" placeholder="Ingrese pendientes"
id="" size="15" maxlength="15">
</td>

</tr>
<tr>
<td>Usuario Creador</td>
<td><input type="text" name="txtusuariocreador" class="texto" value="<%=usuariocreador!=null?usuariocreador:""%>"  
id="" size="15" maxlength="15">

 <td>Estado</td>
   <td><select  name="cboestado" class="texto">
   <option value="">Seleccione</option>
     <option value="Iniciados"<%if("Iniciados".equals(estado)){%>selected<% }%>>Iniciados</option>
     <option value="Pendientes"<%if("Pendientes".equals(estado)){%>selected<% }%>>Pendientes</option>
     <option value="Terminados"<%if("Terminados".equals(estado)){%>selected<% }%>>Terminados</option>
     
</tr>
<tr>
<td>Total Horas</td>
<td><input type="text" name="txttotal_horas" class="texto" value="<%=total_horas!=null?total_horas:""%>"  placeholder="Ingrese total horas"
id="" size="15" maxlength="15">
  

</table>      
               
                
           
           
                
                <jsp:include page="FBotones.jsp" flush="true"/>
                <p><%=men!=null? men:""%></p>
              <%if(LP!= null ){%>
              
                <table width="100%" height="200" border="1" cellspacing="3" cellpading=5"">

                  <tr>
                       <td>Consecutivo</td>       
                       <td>Id Empleado</td>
                       
                       <td>Tarea</td>
                       <td>Cantidad</td>
                         
                       <td>Terminadas</td>      
                       <td>Pendientes</td>
                       
                   
                      
                  </tr>
                  <!--Recorrer para cargar datos-->
              
                  
                  <%for(Gestion us:LP){%>
                  <tr>
                       <td><%=us.getConsecutivo()%></td>
                       <td><%=us.getIdempleado()%></td>
                      
                       <td><%=us.getNombre_tarea() %></td>  
                       
                       
                        <td><%=us.getCantidad()%></td>    
                         <td><%=us.getCant_terminadas()%></td>
                         <td><%=us.getCant_pendientes()%></td>
                         
                         
                         
                        
                        
                     
                       
                     
                         
                             
                      
                         <td><a href="./GestionServlet?action=buscar&txtconsecutivo=<%=us.getConsecutivo()%>"><img src="imagenes/au.png" border="0" ></a></td>  
                  </tr>
                  <%}%>
                  
              </table>
              <%}%>


            </form>
      
      
    