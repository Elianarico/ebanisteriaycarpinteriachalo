<%
String targetModulo = request.getAttribute("targetModulo") == null ? "FBlanco.jsp":(String)request.getAttribute("targetModulo");
%>
 
 
 


<table>
    <tr>
        <td >
        <jsp:include page="FMenu.jsp" flush="true"></jsp:include>
        </td>
    </tr>   
    <tr>
        <td >
           
         <jsp:include page="<%=targetModulo%>" flush="true"></jsp:include>
         
        </td>
    </tr>
</table>
 