<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<% 
  String target= request.getAttribute("target")!=null?(String)request.getAttribute("target"):"./FLoginBox.jsp";


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ebanistería y Carpintería "Chalo"</title>
        <link rel="shortcut icon" href="favicon.ico" >
        <link rel="stylesheet" type="text/css" href="css/Estilo.css"/>
     
 </head>
   <jsp:include page="<%=target%>" flush="true"></jsp:include>

</html>
