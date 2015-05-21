/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import chalo.entidades.Materia;
import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;
import java.sql.Connection;
import java.util.List;

public class MateriaN {
 Daos dao1;

     public MateriaN (){
     dao1= new Daos();
     } //fin constructor
public List<Materia>Listadomateria(){
Connection c= new Conexion().getCon();
return dao1.Listadomateria(c);
//una vez prrogramado nos vamos para usucario servlet
    

}//Fin lista de datos

//Buscar un dato

public Materia getMateria(String mate){
Connection c= new Conexion().getCon();
return dao1.getMateria(c, mate);
//una vez prrogramado nos vamos para usucario servlet al buscar 
    
//String codigo, String medida, String fechai, String fechav,
            //String estado, String descripcion
}
public void getInsertarMateria(Materia mate)throws Exception{
//throws es una clase  que permite programar nuestras propias excepciones
Conexion con = new Conexion();
String mensajeError="";
String codigo = mate.getCodigo();
String medida = mate.getMedida();
String fechai = mate.getFechai();
String fechav = mate.getFechav();
String estado = mate.getEstado();
String descripcion = mate.getDescripcion();



if("".equals(codigo) || null==codigo){
mensajeError+="<br>Ingrese el codigo";
}
if("".equals(medida) || null==medida){
mensajeError+="<br>Ingrese la Unidad de Medida";
}
if("".equals(fechai) || null==fechai){
mensajeError+="<br>Ingrese Fecha Ingreso";
}
if("".equals(fechav) || null==fechav){
mensajeError+="<br>Ingrese Fecha Vto";

}
if("".equals(estado) || null==estado){
mensajeError+="<br>Ingrese el estado";
}
if("".equals(descripcion) || null==descripcion){
mensajeError+="<br>Ingrese descripción";
}
    //estado="Activo"; ----> esto se hace si el campo no es obligatorio pero se tiene que dar algun valor 

//Lanzamos una excepcion cuando falte algun 
//dato obligatorio 
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}//fin si no hay ningun error 
//ejecutamos la accion 

//

mensajeError= dao1.getInsertarMateria(con.getCon(), codigo, medida, fechai, fechav, estado,
         descripcion);
//validamos y eviamos una excepcion al guardar el dato.
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}
}//fin metodo----> regresamos al UsuarioServlet

public void getActualizarMateria (Materia mate) throws Exception{
//throws es una clase que permite programar nuestras propias excepciones
    
Conexion con= new Conexion();
String mensajeError="";
String codigo = mate.getCodigo();
String medida = mate.getMedida();
String fechai = mate.getFechai();
String fechav = mate.getFechav();
String estado = mate.getEstado();
String descripcion = mate.getDescripcion();


if("".equals(codigo) || null==codigo){
mensajeError+="<br>Ingrese el codigo";
}
if("".equals(medida) || null==medida){
mensajeError+="<br>Ingrese la Unidad de Medida";
}
if("".equals(fechai) || null==fechai){
mensajeError+="<br>Ingrese Fecha Ingreso";
}
if("".equals(fechav) || null==fechav){
mensajeError+="<br>Ingrese Fecha Vto";

}
if("".equals(estado) || null==estado){
mensajeError+="<br>Ingrese el estado";
}
if("".equals(descripcion) || null==descripcion){
mensajeError+="<br>Ingrese descripción";
}

if(!"".equals(mensajeError)){
//! se está negando
    
throw new Exception(mensajeError);  
}//fin si no hay ningún error
//ejecutamos la acción



//verificamos si elusuario existe


mensajeError= dao1.getInsertarMateria(con.getCon(), codigo, medida, fechai, fechav, estado,
         descripcion);

//validamos y enviamos una excepción al guardar el dato

if(!"".equals(mensajeError)){   
throw new Exception(mensajeError);  
}

//verificamos si elusuario existe




} //fin método,no retorna nada. Regresamos al usario servlet  
  
  

}// fin clase 
 