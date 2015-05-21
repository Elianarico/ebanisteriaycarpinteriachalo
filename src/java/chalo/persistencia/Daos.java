/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import chalo.entidades.Usuario;

import chalo.entidades.Gestion;
import chalo.entidades.Mueble;
import chalo.entidades.Materia;
import chalo.entidades.Tarea;

/**
 *
 * @author Usuario
 */


public class Daos {
    //copiamos este metodo
public List<Usuario>ListadoUsuarios (Connection con) {
    
 List<Usuario> resultado = new  ArrayList<Usuario>(); 
 try{
 PreparedStatement p=  con.prepareStatement(SQLHelpers.getUsuarios());
ResultSet r=p.executeQuery();
 while(r.next()){
  Usuario u= new Usuario();
    u.setIdentidad(r.getString(1));
    u.setDocumento(r.getString(2));
    u.setNombre(r.getString(3));
    u.setApellidos(r.getString(4));
    u.setEmail(r.getString(5));
    u.setCelular(r.getString(6));
    u.setDireccion(r.getString(7));
    u.setClave(r.getString(8));
    u.setTelefono(r.getString(9));
    u.setEstado(r.getString(10));
    u.setPerfil(r.getString(11));
    u.setGenero(r.getString(12));
    
    resultado.add(u);
    
 
 
}//fin mientras

 }//fin Try
 catch(Exception e1){}
 finally{
try{con.close();}//fin control cerrar conexion     
 catch(Exception clo){}
 
 }//fin finally
 
 
 return resultado;  
   }//fin métodos 
    
public Usuario getUsuario(Connection con,String ide) {
        
    
Usuario u =new Usuario();
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpers.getUsuarios(ide));
ResultSet r=p.executeQuery();
 while(r.next()){
    
    u.setIdentidad(r.getString(1));
    u.setDocumento(r.getString(2));
    u.setNombre(r.getString(3));
    u.setApellidos(r.getString(4));
    u.setEmail(r.getString(5));
    u.setCelular(r.getString(6));
    u.setDireccion(r.getString(7));
    u.setClave(r.getString(8));
    u.setTelefono(r.getString(9));
    u.setEstado(r.getString(10));
    u.setPerfil(r.getString(11));
    u.setGenero(r.getString(12));
}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
     try{con.close();}
     catch(Exception clo){}
 
    
     return u;
    }//fin finally

public Usuario getUsuarioEmail(Connection con,String email) {
        
    
Usuario u =new Usuario();
u.setIdentidad("0");
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpers.getEmailUsuarios(email));
ResultSet r=p.executeQuery();
 while(r.next()){
    
    u.setIdentidad(r.getString(1));
    u.setDocumento(r.getString(2));
    u.setNombre(r.getString(3));
    u.setApellidos(r.getString(4));
    u.setEmail(r.getString(5));
    u.setCelular(r.getString(6));
    u.setDireccion(r.getString(7));
    u.setClave(r.getString(8));
    u.setTelefono(r.getString(9));
    u.setEstado(r.getString(10));
    u.setPerfil(r.getString(11));
    u.setGenero(r.getString(12));
}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
     try{con.close();}
     catch(Exception clo){}
 
    
     return u;
    }//fin finally

public String getInsertarUsuario(
        Connection con,
       String identidad,
        String documento,
        String nombre,
        String apellidos,
        String email,
        String celular,
        String direccion,
        String clave,
        String telefono,
        String estado,
        String perfil,
        String genero
        ){
String respuesta="";
try{
PreparedStatement p= con.prepareStatement(SQLHelpers.getInsertarUsuario());
//(?,?,?,?,?)
p.setString(1, identidad);
p.setString(2, documento);
p.setString(3, nombre);
p.setString(4, apellidos);
p.setString(5, email);
p.setString(6, celular);
p.setString(7, direccion);
p.setString(8, clave);
p.setString(9, telefono);
p.setString(10, estado);
p.setString(11, perfil);
p.setString(12, genero);
//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Usuario agregado";
}else{
respuesta="Error..!Usuario no agregado";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;

}//Fin metodo regresamos a la capa de negocio
//usuarioN

public String getActualizarUsuario(
        Connection con,
        String identidad,
        String documento,
        String nombre,
        String apellidos,
        String email,
        String celular,
        String direccion,
        String clave,
        String telefono,
        String estado,
        String perfil,
        String genero
        ){
String respuesta="";
try{
//"UPDATE tblusuario set identidad=1, documento=2,apellidos=3,email=4,celular=5,
    //direccion=6,clave=7,telefono=8,estado=9, perfil=10, genero=11  where nombre=12"

PreparedStatement p= con.prepareStatement(SQLHelpers.getAltualizarUsuario());
//(?,?,?,?,?,?,?,?,?,?,?,?)
p.setString(1, identidad);
p.setString(2, documento);
p.setString(12, nombre);
p.setString(3, apellidos);
p.setString(4, email);
p.setString(5, celular);
p.setString(6, direccion);
p.setString(7, clave);
p.setString(8, telefono);
p.setString(9,estado);
p.setString(10,perfil);
p.setString(11,genero);
//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){//SE AFECTÓ AL MENOS UN REGISTRO
respuesta="Usuario actualizado";
}else{
respuesta="Error..Usuario no actualizado";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la base de datos
return respuesta;

}



public Usuario getValidarIngreso(Connection con,String identidad,String clave ){
Usuario u = new Usuario();
u.setIdentidad("0");
try{
//usuario,nombre,clave "
//        + ",perfil,estado    
PreparedStatement p= 
  con.prepareStatement(SQLHelpers.getValidarIngreso(identidad,clave));
ResultSet r=p.executeQuery();
while(r.next()){
    u.setIdentidad(r.getString(1));
    u.setDocumento(r.getString(2));
    u.setNombre(r.getString(3));
    u.setApellidos(r.getString(4));
    u.setEmail(r.getString(5));
    u.setCelular(r.getString(6));
    u.setDireccion(r.getString(7));
    u.setClave(r.getString(8));
    u.setTelefono(r.getString(9));
    u.setEstado(r.getString(10));
    u.setPerfil(r.getString(11));
    u.setGenero(r.getString(12));

}// fin mientras 
}// fin try
catch(Exception e1){}
finally{
try{con.close();}// fin control cerrar conexion    
catch(Exception clo){}

}// fin finally

 return u;   
}// fin métodos

public boolean getVerSiExisteUsuario(Connection con,String ide) {
        
    
boolean u = false;
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpers.getUsuarios(ide));
ResultSet r=p.executeQuery();
 while(r.next()){
 u=true;   
    
}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
 try{con.close();}
 catch(Exception clo){}
 
    
return u;
}//fin existe usuario


public boolean getVerSiExisteEmail(Connection con,String email) {
        
    
boolean u = false;
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpers.getEmailUsuarios(email));
ResultSet r=p.executeQuery();
 while(r.next()){
 u=true;   
    
}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
 try{con.close();}
 catch(Exception clo){}
 
    
return u;
}//fin si existe email



//GESTIÓN TAREAS

//Fin metodo regresamos a la capa de negocio
//usuarioN

//public List<Sede>ListadoSedes (Connection con, String campo, String valor ) {
    
// List<Sede> resultado = new  ArrayList<Sede>(); 
 //try{
 //PreparedStatement p=  con.prepareStatement(SQLHelpers.getSedes(campo, valor));
//ResultSet r=p.executeQuery();
// while(r.next()){
  //Sede u= new Sede();
   //u.setIdentidad(r.getString(1));
   //u.setDocumento(r.getString(2));
   //u.setNombre(r.getString(3));
   //u.setApellidos(r.getString(4));
   //u.setEmail(r.getString(5));
   //u.setCelular(r.getString(6));
   //u.setDireccion(r.getString(7));
   //u.setClave(r.getString(8));
   //u.setTelefono(r.getString(9));
   //u.setEstado(r.getString(10));
   //u.setPerfil(r.getString(11));
   // u.setGenero(r.getString(12));
    
    //resultado.add(u);
    
 
 
//}//fin mientras

// }//fin Try
 //catch(Exception e1){}
 ///finally{
///try{con.close();}//fin control cerrar conexion     
 //catch(Exception clo){}
 
 //}//fin finally
 
 
 //return resultado;  
   //}//fin métodos 

//public String getInsertarSede(
        //Connection con,
       //String identidad,
        //String documento,
        //String nombre,
        //String apellidos,
        //String email,
        //String celular,
        //String direccion,
        //String clave,
        //String telefono,
        //String estado,
        //String perfil,
        //String genero
        //){
//String respuesta="";
//try{
//PreparedStatement p= con.prepareStatement(SQLHelpers.getInsertarSede());
//(?,?,?,?,?,?,?,?,?,?,?,?)
//p.setString(1, identidad);
//p.setString(2, documento);
//p.setString(3, nombre);
//p.setString(4, apellidos);
//p.setString(5, email);
//p.setString(6, celular);
//p.setString(7, direccion);
//p.setString(8, clave);
//p.setString(9, telefono);
//p.setString(10, estado);
//p.setString(11, perfil);
//p.setString(12, genero);
//Luego ejecutamos la acciom
///p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
//if(p.getUpdateCount()>0){//SE AFECTÓ AL MENOS UN REGISTRO
//respuesta="Sede agregado";
//}else{
//respuesta="Error..Sede no agregado";
//}//fin si 
//}catch(Exception e1){
//respuesta+=":"+ e1.getMessage() + "Causa :"+e.getCause();
//}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la base de datos
//return respuesta;

//}//Fin metodo regresamos a la capa de negocio

//public String getActualizarSede(
        //Connection con,
       //String identidad,
        //String documento,
        //String nombre,
        //String apellidos,
        //String email,
        //String celular,
        //String direccion,
        //String clave,
        //String telefono,
        //String estado,
        //String perfil,
        //String genero// se quitajn el usuario y la fecha de creación
        //){
//String respuesta="";
//try{
//PreparedStatement p= con.prepareStatement(SQLHelpers.getActualizarSede());
//(?,?,?,?,?,?,?,?,?,?,?,?)
//p.setString(1, identidad);
//p.setString(2, documento);
//p.setString(3, nombre);
//p.setString(4, apellidos);
//p.setString(5, email);
//p.setString(6, celular);
//p.setString(7, direccion);
//p.setString(8, clave);
//p.setString(9, telefono);
//p.setString(10, estado);
//p.setString(11, perfil);
//p.setString(12, genero);se mira el actualizar sede del daos y se pone de acuerdo al orden de éste
//Luego ejecutamos la acciom
///p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
//if(p.getUpdateCount()>0){//SE AFECTÓ AL MENOS UN REGISTRO
//respuesta="Sede modificada";
//}else{
//respuesta="Error..Sede no modificada";
//}//fin si 
//}catch(Exception e1){
//respuesta+=":"+ e1.getMessage() + "Causa :"+e.getCause();
//}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la base de datos
//return respuesta;

//}//Fin metodo regresamos a la capa de negocio

//public Sede getSedes (Connection con, String campo, String valor ) {
    
// Sede u = new Sede(); 
 //try{
 //PreparedStatement p=  con.prepareStatement(SQLHelpers.getSedes(campo, valor));
//ResultSet r=p.executeQuery();
// while(r.next()){
  //Sede u= new Sede();
   //u.setIdentidad(r.getString(1));
   //u.setDocumento(r.getString(2));
   //u.setNombre(r.getString(3));
   //u.setApellidos(r.getString(4));
   //u.setEmail(r.getString(5));
   //u.setCelular(r.getString(6));
   //u.setDireccion(r.getString(7));
   //u.setClave(r.getString(8));
   //u.setTelefono(r.getString(9));
   //u.setEstado(r.getString(10));
   //u.setPerfil(r.getString(11));
   // u.setGenero(r.getString(12));
    
  
    
 
 
//}//fin mientras

// }//fin Try
 //catch(Exception e1){}
 ///finally{
///try{con.close();}//fin control cerrar conexion     
 //catch(Exception clo){}
 
 //}//fin finally
 
 
 //return u;  
   //}//fin métodos 


public List<Gestion>Listadogestion(Connection con) {

 List<Gestion> resultado = new  ArrayList<Gestion>(); 
 try{
 PreparedStatement p=  con.prepareStatement(SQLHelpersGestion.getGestion());
ResultSet r=p.executeQuery();
 while(r.next()){
     
     //consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,
  //hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador 
    //,  estado ,  total_horas
     
 Gestion u= new Gestion();
 u.setConsecutivo(r.getString(1));
 u.setIdempleado(r.getString(2));
 u.setCodmueble(r.getString(3));
 u.setIdtarea(r.getString(4));
 u.setCantidad(r.getString(5));
 u.setFecha_sistema(r.getString(6));
 u.setHora_Inicial(r.getString(7));
 u.setHora_final(r.getString(8));
 u.setCant_terminadas(r.getString(9));
 u.setCant_pendientes(r.getString(10));
 u.setUsuariocreador(r.getString(11));
 u.setEstado(r.getString(12));
 u.setTotal_horas(r.getString(13));
 u.setNombre_empleado(r.getString(14));
  u.setNombre_mueble(r.getString(15));
  u.setNombre_tarea(r.getString(16));

 
 resultado.add(u);
 
 
}//fin mientras

 }//fin Try
 catch(Exception e1){
 e1.printStackTrace();
 
 }
 finally{
try{con.close();}//fin control cerrar conexion     
 catch(Exception clo){}
 
 }//fin finally
 
 
 return resultado;  
}//fin métodos 

public Gestion getGestion(Connection con,String idp) {
        
    
Gestion u =new Gestion();
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpersGestion.getGestion(idp));
ResultSet r=p.executeQuery();
 while(r.next()){
 u.setConsecutivo(r.getString(1));
 u.setIdempleado(r.getString(2));
 u.setCodmueble(r.getString(3));
 u.setIdtarea(r.getString(4));
 u.setCantidad(r.getString(5));
 u.setFecha_sistema(r.getString(6));
 u.setHora_Inicial(r.getString(7));
 u.setHora_final(r.getString(8));
 u.setCant_terminadas(r.getString(9));
 u.setCant_pendientes(r.getString(10));
 u.setUsuariocreador(r.getString(11));
 u.setEstado(r.getString(12));
 u.setTotal_horas(r.getString(13));
 //u.NOMBRE, m.DESCRIPCION, t.DESCRIPCION
 u.setNombre_empleado(r.getString(14));
  u.setNombre_mueble(r.getString(15));
  u.setNombre_tarea(r.getString(16));


}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
     try{con.close();}
     catch(Exception clo){}
 
    
     return u;
    }//fin finally

  //consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,
  //hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador 
    //,  estado ,  total_horas

public String getInsertarGestion(
        Connection con,
        String consecutivo,
        String idempleado,
        String codmueble,
        String idtarea,
        String cantidad,
        String fecha_sistema,
        String hora_Inicial,
        String hora_final,
        String cant_terminadas,
        String cant_pendientes,
        String usuariocreador,
        String estado,
        String total_horas)
{
String respuesta="";
try{
PreparedStatement p= con.prepareStatement(SQLHelpersGestion.getInsertarGestion());
//(?,?,?,?,?,?,?,?,?)
p.setString(1, consecutivo);
p.setString(2, idempleado);
p.setString(3, codmueble);
p.setString(4, idtarea);
p.setString(5, cantidad);
p.setString(6, fecha_sistema);
p.setString(7, hora_Inicial);
p.setString(8, hora_final);
p.setString(9, cant_terminadas);
p.setString(10, cant_pendientes);
p.setString(11, usuariocreador);
p.setString(12, estado);
p.setString(13, total_horas);


//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Tarea agregado";
}else{
respuesta="Error..!Tarea no agregado";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;
}//Fin metodo regresamos a la capa de negocio}

public String getActualizarGestion(
        Connection con,
        String consecutivo,
        String idempleado,
        String codmueble,
        String idtarea,
        String cantidad,
        String fecha_sistema,
        String hora_Inicial,
        String hora_final,
        String cant_terminadas,
        String cant_pendientes,
        String usuariocreador,
        String estado,
        String total_horas)
{
String respuesta="";
try{
PreparedStatement p= con.prepareStatement(SQLHelpersGestion.getActualizarGestion());
//(?,?,?,?,?,?,?,?,?)
p.setString(1, consecutivo);
p.setString(2, idempleado);
p.setString(3, codmueble);
p.setString(4, idtarea);
p.setString(5, cantidad);
p.setString(6, fecha_sistema);
p.setString(7, hora_Inicial);
p.setString(8, hora_final);
p.setString(9, cant_terminadas);
p.setString(10, cant_pendientes);
p.setString(11, usuariocreador);
p.setString(12, estado);
p.setString(13, total_horas);



//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Tarea Actualizada";
}else{
respuesta="Error..!Tarea no Actualizada";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;
}//Fin metodo regresamos a la capa de negocio}

//String codigo, String medida, String fechai, String fechav,
            //String estado, String descripcion


public List<Materia>Listadomateria (Connection con) {
    
 List<Materia> resultado = new  ArrayList<Materia>(); 
 try{
 PreparedStatement p=  con.prepareStatement(SQLHelpersMateria.getMateria());
ResultSet r=p.executeQuery();
 while(r.next()){
  Materia s= new Materia();
 s.setCodigo(r.getString(1));
 s.setMedida(r.getString(2));
 s.setFechai(r.getString(3));
 s.setFechav(r.getString(4));
 s.setEstado(r.getString(5));
 s.setDescripcion(r.getString(6));

 resultado.add(s);
 
 
}//fin mientras

 }//fin Try
 catch(Exception e2){
 e2.printStackTrace();
 }
 finally{
try{con.close();}//fin control cerrar conexion     
 catch(Exception clo2){}
 
 }//fin finally
 
 
 return resultado;  
}//fin métodos 

public Materia getMateria(Connection con,String idv) {
        
    
Materia s =new Materia();
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpersMateria.getMateria(idv));
ResultSet r=p.executeQuery();
 while(r.next()){
 s.setCodigo(r.getString(1));
 s.setMedida(r.getString(2));
 s.setFechai(r.getString(3));
 s.setFechav(r.getString(4));
 s.setEstado(r.getString(5));
 s.setDescripcion(r.getString(6));

}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
     try{con.close();}
     catch(Exception clo){}
 
    
     return s;
    }//fin finally

public String getInsertarMateria(
        Connection con,
        String codigo,
        String medida,
        String fechai,
        String fechav,
        String estado,
        String descripcion
       
        
   ){
String respuesta="";
try{
PreparedStatement p= con.prepareStatement(SQLHelpersMateria.getInsertarMateria());
//(?,?,?,?,?)
p.setString(1, codigo);
p.setString(2, medida);
p.setString(3, fechai);
p.setString(4, fechav);
p.setString(5, estado);
p.setString(6, descripcion);


//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Materia agregada";
}else{
respuesta="Error..!Materia no agregada";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e2){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;
}//Fin metodo regresamos a la capa de negocio
//productosN


public String getActualizarMateria(
        Connection con,
       String codigo,
        String medida,
        String fechai,
        String fechav,
        String estado,
        String descripcion
        ){
String respuesta="";
try{
//"UPDATE tblusuario set identidad=1, documento=2,apellidos=3,email=4,celular=5,
    //direccion=6,clave=7,telefono=8,estado=9, perfil=10, genero=11  where nombre=12"

PreparedStatement p= con.prepareStatement(SQLHelpersMateria.getActualizarMateria());
//(?,?,?,?,?,?,?,?,?,?,?,?)
p.setString(1, codigo);
p.setString(2, medida);
p.setString(3, fechai);
p.setString(4, fechav);
p.setString(5, estado);
p.setString(6, descripcion);
//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){//SE AFECTÓ AL MENOS UN REGISTRO
respuesta="Materia actualizada";
}else{
respuesta="Error..Materia no actualizada";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la base de datos
return respuesta;

}



//MUEBLES
public List<Mueble>ListadoMueble (Connection con1) {
    
 List<Mueble> resultado = new  ArrayList<Mueble>(); 
 try{
 PreparedStatement p=  con1.prepareStatement(SQLHelpers2.getMueble());
ResultSet r=p.executeQuery();
 while(r.next()){
  Mueble m= new Mueble();
    m.setCodigo(r.getString(1));
    m.setTipomueble(r.getString(2));
    m.setCostopro(r.getString(3));
    m.setCostoven(r.getString(4));
    m.setEstado(r.getString(5));
    m.setDescripcion(r.getString(6));
   
    
    resultado.add(m);
    
 
 
}//fin mientras

 }//fin Try
 catch(Exception e2){}
 finally{
try{con1.close();}//fin control cerrar conexion     
 catch(Exception clo2){}
 
 }//fin finally
 
 
 return resultado;  
   }//fin métodos 

public Mueble getMueble(Connection con,String ide) {
        
    
Mueble m =new Mueble();
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpers2.getMueble(ide));
ResultSet r=p.executeQuery();
 while(r.next()){
    
    m.setCodigo(r.getString(1));
    m.setTipomueble(r.getString(2));
    m.setCostopro(r.getString(3));
    m.setCostoven(r.getString(4));
    m.setEstado(r.getString(5));
    m.setDescripcion(r.getString(6));
}//fin mientras
}//fin Try
 catch(Exception e2){}
 finally{}
     try{con.close();}
     catch(Exception clo2){}
 
    
     return m;
    }//fin finally

public String getInsertarMueble(
        Connection con1,
        String codigo,
        String tipomueble,
        String costopro,
        String costoven,
        String estado,
        String descripcion
        ){
String respuesta="";
try{
PreparedStatement p= con1.prepareStatement(SQLHelpers2.getInsertaMueble());
//(?,?,?,?,?)
p.setString(1, codigo);
p.setString(2, tipomueble);
p.setString(3, costopro);
p.setString(4, costoven);
p.setString(5, estado);
p.setString(6, descripcion);

//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Mueble agregado";
}else{
respuesta="Error..!Mueble no agregado";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con1.close();}catch(Exception e2){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;

}//


//Tareas
public List<Tarea>ListadoTareas(Connection con) {
    
 List<Tarea> resultado = new  ArrayList<Tarea>(); 
 try{
 PreparedStatement p=  con.prepareStatement(SQLHelpersTarea.getTarea());
ResultSet r=p.executeQuery();
 while(r.next()){
  Tarea s= new Tarea();
 s.setCodigo(r.getString(1));
 s.setDescripcion(r.getString(2));
 s.setCosto_hora(r.getString(3));


 resultado.add(s);
 
 
}//fin mientras

 }//fin Try
 catch(Exception e2){
 e2.printStackTrace();
 }
 finally{
try{con.close();}//fin control cerrar conexion     
 catch(Exception clo2){}
 
 }//fin finally
 
 
 return resultado;  
}//fin métodos 

public Tarea getTarea(Connection con,String tar) {
        
    
Tarea s =new Tarea();
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpersTarea.getTarea(tar));
ResultSet r=p.executeQuery();
 while(r.next()){
 s.setCodigo(r.getString(1));
 s.setDescripcion(r.getString(2));
 s.setCosto_hora(r.getString(3));

}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
     try{con.close();}
     catch(Exception clo){}
 
    
     return s;
    }//fin finally

public String getInsertarTarea(
        Connection con,
        String codigo,
        String descripcion,
        String costo_hora
       
       
        
   ){
String respuesta="";
try{
PreparedStatement p= con.prepareStatement(SQLHelpersTarea.getInsertarTarea());
//(?,?,?,?,?)
p.setString(1, codigo);
p.setString(2, descripcion);
p.setString(3, costo_hora);



//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){
respuesta="Tarea agregada";
}else{
respuesta="Error..!Tarea no agregada";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e2){}}//fin finally
//con. close(); permite cerrar la conexion a la 
return respuesta;
}

public String getActualizarTarea(
        Connection con,
        String codigo,
        String descripcion,
        String costo_hora
        ){
String respuesta="";
try{
//"UPDATE tblusuario set identidad=1, documento=2,apellidos=3,email=4,celular=5,
    //direccion=6,clave=7,telefono=8,estado=9, perfil=10, genero=11  where nombre=12"

PreparedStatement p= con.prepareStatement(SQLHelpersTarea.getActualizarTarea());
//(?,?,?,?,?,?,?,?,?,?,?,?)
p.setString(1, codigo);
p.setString(2, descripcion);
p.setString(3, costo_hora);
//Luego ejecutamos la acciom
p.execute();//Este metdodo no retorna filas
// a diferencia del metodo executeQuery()
if(p.getUpdateCount()>0){//SE AFECTÓ AL MENOS UN REGISTRO
respuesta="Tarea actualizada";
}else{
respuesta="Error..Tarea no actualizada";
}//fin si 
}catch(Exception e){
respuesta+=":"+ e.getMessage() + "Causa :"+e.getCause();
}finally{try{con.close();}catch(Exception e1){}}//fin finally
//con. close(); permite cerrar la conexion a la base de datos
return respuesta;

}



public String getConsecutivoGestion(Connection con) {
        
    
String u = "0000000001";
 try{
 PreparedStatement p= con.prepareStatement(SQLHelpersGestion.getConsecutivoGestion());
ResultSet r=p.executeQuery();
 while(r.next()){
u=r.getString(1);   
    
}//fin mientras
}//fin Try
 catch(Exception e1){}
 finally{}
 try{con.close();}
 catch(Exception clo){}
 
    
return u;
}//fin existe usuario

}// fin métodos 



