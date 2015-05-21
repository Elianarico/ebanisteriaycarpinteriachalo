<%
String targetModulo = request.getAttribute("targetModulo") == null ? "FBlanco.jsp":(String)request.getAttribute("targetModulo");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  
 
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <link rel="stylesheet" type="text/css" href="css/estiloo.css" />
 
  <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
  </script> 

 
</head>

<body>
<div id="main">
    

<div id="menubar">
<div id="Bienvenidos">
        <jsp:include page="FMenu.jsp" flush="true"></jsp:include>   
    </div>	
    <div id="site_content">	
        <div class="sidebar">
            <div id="content">
                <div class="content_item">
                <div class="form_settings">
                <jsp:include page="<%=targetModulo%>" flush="true"></jsp:include>
            </div>
            </div>
            </div>
            </div>
 </div>
</body>

