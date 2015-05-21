/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.persistencia;

/**
 *
 * @author Usuario
 */
public class SQLHelpersGestion {
    public static String getGestion()
{
//return "SELECT consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador,estado,total_horas from tblproduccion";   
 return " select p.consecutivo,p.idempleado, u.IDENTIDAD, p.codmueble,p.idtarea,p.cantidad,p.fecha_sistema,"
                + "          p.hora_Inicial ,p.hora_final , p.cant_terminadas , p.cant_pendientes ,"
                + "          p.usuariocreador ,  p.estado ,  p.total_horas,u.NOMBRE, m.DESCRIPCION, t.DESCRIPCION"
                + "          from TBLPRODUCCION p, TBLUSUARIO u, TBLMUEBLE m , TBLTAREA t "
                + "         where u.IDENTIDAD = p.IDEMPLEADO  AND m.CODIGO = p.CODMUEBLE   AND  t.CODIGO = p.IDTAREA ";

}//fin método  

public static String getGestion(String consecutivo ) 
     {
  //return "SELECT idproveedor,nombrecompleto,empresa,telefono,email,direccion,estado,fechaingreso,pais from tblproveedores";   

//         return "SELECT consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador,estado,total_horas from tblproduccion where consecutivo='"+consecutivo+"'";   
        return " select p.consecutivo,p.idempleado, u.IDENTIDAD, p.codmueble,p.idtarea,p.cantidad,p.fecha_sistema,"
                + "          p.hora_Inicial ,p.hora_final , p.cant_pendientes ,"
                + "          p.usuariocreador ,  p.estado ,  p.total_horas,u.NOMBRE, m.DESCRIPCION, t.DESCRIPCION, t.COSTO_HORA"
                + "          from TBLPRODUCCION p, TBLUSUARIO u, TBLMUEBLE m , TBLTAREA t "
                + "          WHERE u.IDENTIDAD = p.IDEMPLEADO  AND m.CODIGO = p.CODMUEBLE  "
                + "           AND  t.CODIGO = p.IDTAREA  AND p.consecutivo='"+consecutivo+"' ";

    }//fin método buscar un dato
//Nos vamos para---> Daos
// Buscar un dato
//insertar un dato
public static String getInsertarGestion(){
return "INSERT INTO tblproduccion(consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador,estado,total_horas)"
        +"values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
}//fin insertar

//Actualizar un dato
public static String getActualizarGestion(){

    return "UPDATE tblproduccion consecutivo=?, idempleado=?, codmueble=? ,idtarea=? ,cantidad=? ,fecha_sistema=? ,hora_Inicial=? ,hora_final=? , cant_terminadas=? , cant_pendientes=? ,usuariocreador=? ,estado=? ,total_horas=?";
}//fin actualizar 
    //nos vamos para daos
    
// Tareas

public static String getTareas(){
return "Select codigo, descripcion, costo_hora   from tbltarea";
}//fin actualizar 


public static String getConsecutivoGestion() {

   return "SELECT Lpad( max( cast( consecutivo AS varchar(10) ) ) +1, 10, '0' ) FROM tblproduccion";

}










}
 
