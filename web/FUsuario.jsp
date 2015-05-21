
<%-- 
    Document   : FUsuarioo
    Created on : 15/05/2014, 11:38:10 AM
    Author     : Usuario
--%>

<%@page import="chalo.entidades.Usuario"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    
    String nombre = request.getParameter("txtnombre");
    String documento = request.getParameter("cbodocumento");
    String apellidos = request.getParameter("txtapellidos");
    String identidad = request.getParameter("txtnumero");
    String email = request.getParameter("txtemail");
    String celular = request.getParameter("txtcelular");
    String direccion = request.getParameter("txtdireccion");
    String clave = request.getParameter("txtclave");
    String telefono = request.getParameter("txttelefono");
    String estado = request.getParameter("cboestado");
    String perfil = request.getParameter("cboperfil");
    String genero = request.getParameter("cbogenero");
    
String men =(String) request.getAttribute("mensajes");
String dat =(String) request.getAttribute("datos");
List<Usuario>LU=(List<Usuario>) request.getAttribute("listado")!=null?
        (List<Usuario>) request.getAttribute("listado"):null;
Usuario usu=(Usuario) request.getAttribute("datousuario") !=null?
        (Usuario) request.getAttribute("datousuario"):null;
//los datos estan cargado en usu(objeto) de tipo Usuario
//cargamos los datos en las variables
                if(usu!=null){
                    
                nombre= usu.getNombre();
                documento= usu.getDocumento();
                apellidos= usu.getApellidos();
                identidad= usu.getIdentidad();
    
                email= usu.getEmail();
                celular= usu.getCelular();
                direccion= usu.getDireccion();
                clave= usu.getClave();
                telefono= usu.getTelefono();
                clave= usu.getClave();
                estado= usu.getEstado();
                perfil= usu.getPerfil();
                genero= usu.getGenero();
                
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

 <form name="xform"  method="POST" action="./UsuarioServlet">
      <h1><center>Registro de Usuarios</h1></center>  
                
       

         
                
<h1><center>Ebanistería y Carpintería "Chalo"</h1></center>






<table>
<tr>
    </tr>
<tr>
       
                     
<td>Tipo de Documento</td>
<td>
<select name="cbodocumento" class="texto">
<option value="">Seleccione</option>
<option value="CC" <%if("CC".equals(documento)){%>selected<%}%>>CC</option>
<option value="TI" <%if("TI".equals(documento)){%>selected<%}%>>TI</option>
</select>    

<td>N&#250;mero Identidad</td>
<td><input type="text" name="txtnumero" <%=ed%> class="texto" value="<%=identidad!=null?identidad:""%>" placeholder="Ingrese n&#250;mero de identidad" onkeypress="return numeros(event); "
id="" size="25" maxlength="25">
</td>
    
 </tr>
<tr>
        
    
<td>Nombre(s)</td>
<td><input type="text"  name="txtnombre" class="texto" value="<%=nombre!=null?nombre:""%>" placeholder="Ingrese nombre"
id="" size="25" maxlength="25"></td>
                     

<td>Apellidos</td>
<td><input type="text" name="txtapellidos" class="texto" value="<%=apellidos!=null?apellidos:""%>" placeholder="Ingrese apellidos"
id="" size="25" maxlength="25">
</td>


   </tr>
<tr>
                    
<td>Perfil</td>
<td>
<select name="cboperfil" class="texto">
<option value="">Seleccione</option>
<option value="Administrador" <%if("Administrador".equals(perfil)){%>selected<%}%>>Administrador</option>
<option value="Empleado" <%if("Empleado".equals(perfil)){%>selected<%}%>>Empleado</option>
</select>

<td>G&#233;nero</td>
<td>
<select name="cbogenero" class="texto">
<option value="">Seleccione</option>
<option value="Masculino" <%if("Masculino".equals(genero)){%>selected<%}%>>Masculino</option>
<option value="Femenino" <%if("Femenino".equals(genero)){%>selected<%}%>>Femenino</option>
</select>

</tr>
<tr>
<td>Email</td>
<td><input type="text" value="<%=email!=null?email:"@"%>" name="txtemail"id="" size="25" maxlength="25" >
</td>


   <td>Estado</td>
   <td><select  name="cboestado" class="texto">
   <option value="">Seleccione</option>
     <option value="Activo"<%if("Activo".equals(estado)){%>selected<% }%>>Activo</option>
     <option value="Inactivo"<%if("Inactivo".equals(estado)){%>selected<% }%>>Inactivo</option>


</tr>
<tr>
<td>Celular</td>
<td><input type="text" name="txtcelular"value="<%=celular!=null?celular:""%>" placeholder="Ingrese n&#250;mero celular" onkeypress="return numeros(event); "
id="" size="25" maxlength="10">
</td>


<td>Direcci&#243;n Residencia</td>
<td><input type="text" name="txtdireccion" class="texto" value="<%=direccion!=null?direccion:""%>" placeholder="Ingrese direcci&#243;n residencia"
id="" size="25" maxlength="20">
</td>

</tr>
<tr>
<td>Contrase&#241;a</td>
<td><input type="password" name="txtclave" class="texto" value="<%=clave!=null?clave:""%>"  placeholder="Ingrese contrase&#241;a"
id="" size="25" maxlength="15">

<td>Tel&#233;fono</td>
<td><input type="text" name="txttelefono" class="texto" value="<%=telefono!=null?telefono:""%>"  placeholder="Ingrese n&#250;mero de tel&#233;fono" onkeypress="return numeros(event); "
id="" size="25" maxlength="7">
</td>
  

</table>      
               
                
           
           
                
                <jsp:include page="FBotones.jsp" flush="true"/>
                <p><%=men!=null? men:""%></p>
              <%if(LU!= null ){%>
              
                <table width="100%" height="200" border="1" cellspacing="3" cellpading=5"">

                  <tr>
                       <td>Nombre</td>       
                       <td>Apellidos</td>
                       <td>Documento</td>
                       <td>Identidad</td>    
                       <td>Celular</td>      
                       <td>Teléfono</td>
                   
                      
                  </tr>
                  <!--Recorrer para cargar datos-->
                  <%for(Usuario us:LU){%>
                  <tr>
                      
                      <td><%=us.getNombre()%></td>
                      <td><%=us.getApellidos()%></td>
                      <td><%=us.getDocumento()%></td>
                      <td><%=us.getIdentidad()%></td>
                      
                      
                      <td><%=us.getCelular()%></td>
                      <td><%=us.getTelefono()%></td>
                       
                      <td><a href="./UsuarioServlet?action=buscar&txtnumero=<%=us.getIdentidad()%>"><img src="imagenes/au.png" border="0" ></a></td>
                  
                             
                      
                      
                  </tr>
                  <%}%>
                  
              </table>
              <%}%>


            </form>
      
      
    