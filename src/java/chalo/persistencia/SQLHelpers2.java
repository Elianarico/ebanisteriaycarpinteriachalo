/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.persistencia;

/**
 *
 * @author USER
 */
public class SQLHelpers2 {
    
public static String getMueble(){
 
    return"SELECT codigo, tipomueble, costopro, costoven, estado, descripcion,  from tblmueble";
}//fin del metodo
// Buscar dato
    public static String getMueble(String codigo){
 
    return"SELECT codigo, tipomueble,costopro, costoven, estado, descripcion"
            + " from tblmueble where codigo='"+codigo+"'";
}//fin del metodo buscar
// Nos vamos para Daos
    //Insertar un dato
    public static String getInsertaMueble() {
    return"INSERT INTO tblmueble(codigo, tipomueble, costopro, costoven, estado, descripcion)"
    + "values (?,?,?,?,?,?)";
            
            }//fin insertar
    public static String getAltualizarMueble (){
    return "UPDATE tblmueble set codigo=?,tipomueble=?,costopro=?,costoven=?,estado=?,descripcion=? where codigo=?";
    }//fin actualizar

    //vamos para Daos
}//fin de la clase
 
// fin método buscar un dato
// Nos vamos para ---- > Daos
    //nos vamos para daos

    