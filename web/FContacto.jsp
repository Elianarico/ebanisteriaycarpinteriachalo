<%
String men =(String) request.getAttribute("mensaje")!=null?(String) request.getAttribute("mensaje"):null;
%>


    <!-- form -->
    <form id="fondoformulario" name ="xForm" method="POST" action="./SugerenciasServlet"/>
    <center><img src="imagenes/e.png"></center>
    <table >
    <tr>
    <td>Email</td>
    <td> <input type="text"  name="txtemail"   id ="estilo" size="30"></td>     
    <td><button type="submit" class="btn1" name="action" value="envio" > Envio</button></td>
    </tr>
    <%if (men != null) {%>
    <div id="dialog" title="Ingreso a Notas">
        <%=men%>
    </div>     
    <%}%>
    </table>
</form>