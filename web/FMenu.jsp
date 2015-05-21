

<%@page import="chalo.entidades.Usuario"%>
<%
Usuario entUsuario =(Usuario) session.getAttribute("user");
String identidad =  entUsuario.getIdentidad();
String documento = entUsuario.getDocumento();
String nombre =entUsuario.getNombre();
String apellidos = entUsuario.getApellidos();
String email =   entUsuario.getEmail();
String celular = entUsuario.getCelular();
String direccion = entUsuario.getDireccion();
String clave = entUsuario.getClave();
String telefono =  entUsuario.getTelefono();
String estado = entUsuario.getEstado();
String perfil = entUsuario.getPerfil();
String genero = entUsuario.getGenero();
%>
   
	   <ul id="menu">

	  
         <% if(!"0".equals(identidad)){%>      
         <li><%=nombre%> |  <%=perfil%></li>
        <% if(!"Inactivo".equals(estado)){%> 
           
        <% if("Administrador".equals(perfil)){%>      
        <li><a href="./UsuarioServlet" title="Usuarios">Registro de Usuarios </a>
        </li>
        <li><a href="./MateriaServlet" title="materia">Materia Prima</a> </li>
        <li><a href="./GestionServlet?action=nuevo&txtusuariocreador=<%=identidad%>" title="gestion">Gestión de Tareas</a></li>
        
         <li><a href="./TareaServlet" title="materia">Registro de Tareas</a> </li>
        
        <%}%>
        
          <% if("Empleado".equals(perfil)){%>      
       <li><a href="./GestionServlet?action=nuevo&txtusuariocreador=<%=identidad%>" title="gestion">Gestión de Tareas</a></li>
     <li><a href="./TareaServlet" title="materia">Registro de Tareas</a> </li> 
     
        <%}%>
        
        
       <li> <a href="./UsuarioServlet?action=salir" title="Cerrar sesion">Cerrar Sesion</a> </li>
        <%}else{%>
        <tr><td>!Usted no está Activo¡</td></tr>
        <%}%>
        <%}else{%>
        <tr><td>Error al Ingresar al sistema..</td></tr>
         <%}%>
    </ul>    
    
</div>


