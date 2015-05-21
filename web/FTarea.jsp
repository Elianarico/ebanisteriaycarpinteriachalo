<%@page import="chalo.entidades.Tarea"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    
    //INSERT INTO tbltarea ( codigo, descripcion, costo_hora )VALUES( '00001',  'Pintura', '2300'  );
    
    String codigo = request.getParameter("txtcodigo");
    String descripcion = request.getParameter("cbodescripcion");
    String costo_hora = request.getParameter("txtcosto_hora");
   
    
String men2 = (String) request.getAttribute("mensaje");
    String dat2 = (String) request.getAttribute("datos");
  List<Tarea> TA = (List<Tarea>) request.getAttribute("Listado")!=null? 
            (List<Tarea>) request.getAttribute("Listado"):null;
 Tarea tar=(Tarea) request.getAttribute("datotarea")!=null?
          (Tarea) request.getAttribute("datotarea"):null;
 //los datos estan cargadoes en un usu(objeto) detipo Usuario
 //cargamos los datos en las variables
 //los datos estan cargadoes en un usu(objeto) detipo Usuario
 //cargamos los datos en las variables
                if(tar!=null){
                    
                codigo= tar.getCodigo();
                descripcion= tar.getDescripcion();
                costo_hora= tar.getCosto_hora();
                
    
                
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
</head>
<div id="usuario">


<body>


   
 </head>

 <form name="xform"  method="POST" action="./TareaServlet">
      <h1><center>Registro de Tareas</h1></center>  
                
       

         
                
<h1><center>Ebanistería y Carpintería "Chalo"</h1></center>






<table>
<tr>
    </tr>
<tr>
       
                     

        
    
<td>Código</td>
<td><input type="text"  name="txtcodigo" <%=ed%> class="texto" value="<%=codigo!=null?codigo:""%>" placeholder="Ingrese código"
id="" size="13" maxlength="13"></td>
                     

<tr>
                    
<td>Tipo Tarea</td>
<td>
<select name="cbodescripcion" class="texto">
<option value="">Seleccione</option>
<option value="Pintado" <%if("Pintado".equals(descripcion)){%>selected<%}%>>Pintado</option>
<option value="Lijado" <%if("Lijado".equals(descripcion)){%>selected<%}%>>Lijado</option>
<option value="Cortado" <%if("Cortado".equals(descripcion)){%>selected<%}%>>Cortado</option>
<option value="Ensamblar" <%if("Ensamblar".equals(descripcion)){%>selected<%}%>>Ensamblar</option>
<option value="Empacar" <%if("Empacar".equals(descripcion)){%>selected<%}%>>Empacar</option>
<option value="Distribuir" <%if("Distribuir".equals(descripcion)){%>selected<%}%>>Distribuir</option>
<option value="Revision" <%if("Revision".equals(descripcion)){%>selected<%}%>>Revision Calidad</option>
<option value="Tapizar" <%if("Tapizar".equals(descripcion)){%>selected<%}%>>Tapizar</option>
<option value="Embarnizar" <%if("Embarnizar".equals(descripcion)){%>selected<%}%>>Embarnizar</option>

</select>

</tr>
<tr>
<td>Costo Hora</td>
<td><input type="text" value="<%=costo_hora!=null?costo_hora:""%>" placeholder ="Ingrese costo"name="txtcosto_hora"id="" size="13" maxlength="10" >
</td>


  

</table>      
               
                
           
           
                
                <jsp:include page="FBotones.jsp" flush="true"/>
                <p><%=men2!=null? men2:""%></p>
              <%if(TA!= null ){%>
              
                <table width="100%" height="200" border="1" cellspacing="3" cellpading=5"">

                  <tr>
                       <td>Código</td>       
                       <td>Tarea</td>
                       <td>Costo Hora</td>
                      
                   
                      
                  </tr>
                  <!--Recorrer para cargar datos-->
                  <%for(Tarea us:TA){%>
                  <tr>
                      
                      <td><%=us.getCodigo()%></td>
                      <td><%=us.getDescripcion()%></td>
                      <td><%=us.getCosto_hora()%></td>
          
                       
                      <td><a href="./TareaServlet?action=buscar&txtcodigo=<%=us.getCodigo()%>"><img src="imagenes/au.png" border="0" ></a></td>
                  
                             
                      
                      
                  </tr>
                  <%}%>
                  
              </table>
              <%}%>


            </form>
      
      
    