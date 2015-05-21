/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import chalo.entidades.Tarea;
import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;
import java.sql.Connection;
import java.util.List;

public class TareaN {
 Daos dao2;

     public TareaN (){
     dao2= new Daos();
     } //fin constructor
public List<Tarea>ListadoTareas(){
Connection c= new Conexion().getCon();
return dao2.ListadoTareas(c);
//una vez prrogramado nos vamos para usucario servlet
    

}//Fin lista de datos

//Buscar un dato

public Tarea getTarea(String tar){
Connection c= new Conexion().getCon();
return dao2.getTarea(c, tar);
//una vez prrogramado nos vamos para usucario servlet al buscar 
    
//String codigo, String medida, String fechai, String fechav,
            //String estado, String descripcion
}
public void getInsertarTarea(Tarea tar)throws Exception{
//throws es una clase  que permite programar nuestras propias excepciones
Conexion con = new Conexion();
String mensajeError="";
String codigo = tar.getCodigo();
String descripcion = tar.getDescripcion();
String costo_hora = tar.getCosto_hora();




if("".equals(codigo) || null==codigo){
mensajeError+="<br>Ingrese el codigo";
}
if("".equals(descripcion) || null==descripcion){
mensajeError+="<br>Ingrese tipo de tarea";
}
if("".equals(costo_hora) || null==costo_hora){
mensajeError+="<br>Ingrese costo hora";
}

    //estado="Activo"; ----> esto se hace si el campo no es obligatorio pero se tiene que dar algun valor 

//Lanzamos una excepcion cuando falte algun 
//dato obligatorio 
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}//fin si no hay ningun error 
//ejecutamos la accion 

//

mensajeError= dao2.getInsertarTarea(con.getCon(), codigo, descripcion, costo_hora);
//validamos y eviamos una excepcion al guardar el dato.
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}
}//fin metodo----> regresamos al UsuarioServlet

public void getActualizarTarea (Tarea tar) throws Exception{
//throws es una clase que permite programar nuestras propias excepciones
    
Conexion con= new Conexion();
String mensajeError="";
String codigo = tar.getCodigo();
String descripcion = tar.getDescripcion();
String costo_hora = tar.getCosto_hora();


if("".equals(codigo) || null==codigo){
mensajeError+="<br>Ingrese el codigo";
}
if("".equals(descripcion) || null==descripcion){
mensajeError+="<br>Ingrese tipo de tarea";
}
if("".equals(costo_hora) || null==costo_hora){
mensajeError+="<br>Ingrese costo hora";
}

if(!"".equals(mensajeError)){
//! se está negando
    
throw new Exception(mensajeError);  
}//fin si no hay ningún error
//ejecutamos la acción



//verificamos si elusuario existe


mensajeError=dao2.getActualizarTarea(con.getCon(), codigo, descripcion, costo_hora);

//validamos y enviamos una excepción al guardar el dato

if(!"".equals(mensajeError)){   
throw new Exception(mensajeError);  
}

}// fin clase 

}