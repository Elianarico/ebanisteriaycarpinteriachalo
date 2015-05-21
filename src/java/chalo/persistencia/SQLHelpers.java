/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.persistencia;

/**
 *
 * @author USER
 */
public class SQLHelpers {
public static String getUsuarios(){
 
    return"SELECT identidad, documento, nombre, apellidos, email, celular,  direccion, clave, telefono, estado, perfil, genero from tblusuario";
}//fin del metodo
// Buscar dato
    public static String getUsuarios(String identidad){
 
    return"SELECT identidad, documento, nombre, apellidos, email, celular,  direccion, clave, telefono, estado, perfil, genero"
            + " from tblusuario where identidad='"+identidad+"'";
}//fin del metodo buscar
// Nos vamos para Daos
    //Insertar un dato
   
     public static String getEmailUsuarios(String email){
 
    return"SELECT identidad, documento, nombre, apellidos, email, celular,  direccion, clave, telefono, estado, perfil, genero"
            + " from tblusuario where email='"+email+"'";
}//fin del metodo email
    
    public static String getInsertarUsuario () {
 return"INSERT INTO tblusuario(identidad, documento, nombre, apellidos, email, celular,  direccion, clave, telefono, estado, perfil, genero)"
    + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            }//fin insertar
    public static String getAltualizarUsuario (){
    return "UPDATE tblusuario set identidad=?, documento=?,apellidos=?,email=?,celular=?,direccion=?,clave=?,telefono=?,estado=?, perfil=?, genero=?  where nombre=?";
    }//fin actualizar
    
    public static String getValidarIngreso(String identidad, String clave)    {
return "SELECT identidad,documento,nombre,apellidos "
        + ",email,celular,direccion,clave,telefono,estado,perfil,genero from tblusuario"
        + "  where identidad ='"+identidad+"' and clave ='"+clave+"'";  
}
   
    
     public static String getBorrarUsuario (String ide){
    return "delete from tblusuario where usuario='"+ide+"'";
    }//fin borrar
    //vamos para Daos
    
//public static String getSedes(String campo, String valor) {
//return "SELECT datos ";
//+ " FROM tblsede where "+campo+" = '"+valor+"' ";
//}
     
//public static String getInsertarSede() {
//return "INSERT INTO tblsede( datos )"
//+ "values (?,?,?)";
//}     
     
//public static String getActualizarSede() {
//return "UPDATE tblsede set nombre?, estado=? where consc=?";
//}        
     
}//fin de la clase
 
// fin método buscar un dato
// Nos vamos para ---- > Daos
    //nos vamos para daos

    
