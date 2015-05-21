/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import chalo.entidades.Gestion;
import chalo.entidades.Tarea;
import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;
import java.sql.Connection;
import java.util.List;



/**
 *
 * @author Usuario
 */
public class GestionN {
    Daos dao;
 Connection c= new Conexion().getCon();   

    
    
     public GestionN (){
     dao= new Daos();
     } //fin constructor
     
     public List<Gestion>Listadogestion(){

return dao.Listadogestion(c);
//una vez prrogramado nos vamos para proveedores servlet
    
}//Fin lista de datos
     
   public String getConsecutivoGestion(){

return dao.getConsecutivoGestion(c);
//una vez prrogramado nos vamos para proveedores servlet
    
}//Fin lista de datos   
     
     
   public List<Tarea>Listadotareas(){
Connection c= new Conexion().getCon();
return dao.ListadoTareas(c);
//una vez prrogramado nos vamos para proveedores servlet
    
}//Fin lista de datos
//Buscar un dato
    
     /**
     *
     * @param proveedores
     * @return
     */
    public Gestion getGestion(String gestion){
Connection c= new Conexion().getCon();
return dao.getGestion(c, gestion);
//una vez prrogramado nos vamos para proveedores servlet al buscar 
    
}
    public void getInsertarGestion(Gestion ges)throws Exception{
//throws es una clase  que permite programar nuestras propias excepciones
        
           //consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,
  //hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador 
    //,  estado ,  total_horas
        
Conexion con = new Conexion();
String mensajeError="";
String consecutivo= ges.getConsecutivo();
String idempleado = ges.getIdempleado();
String codmueble = ges.getCodmueble();
String idtarea = ges.getIdtarea();
String cantidad = ges.getCantidad();
String fecha_sistema = ges.getFecha_sistema();
String hora_Inicial= ges.getHora_Inicial();
String hora_final = ges.getHora_final();
String cant_terminadas = ges.getCant_terminadas();
String cant_pendientes = ges.getCant_pendientes();
String usuariocreador = ges.getUsuariocreador();
String estado = ges.getEstado();
String total_horas = ges.getTotal_horas();


if("".equals(consecutivo) || null==consecutivo){
mensajeError+="<br>Ingrese consecutivo";
}
if("".equals(idempleado) || null==idempleado){
mensajeError+="<br>Ingrese Id empleado";
}
if("".equals(codmueble) || null==codmueble){
mensajeError+="<br>Ingrese código mueble";
}
if("".equals(idtarea) || null==idtarea){
mensajeError+="<br>Ingrese Id tarea";
}
if("".equals(cantidad) || null==cantidad){
mensajeError+="<br>Ingrese cantidad";
}
if("".equals(fecha_sistema) || null==fecha_sistema){
mensajeError+="<br>Ingrese fecha sistema";
}

if("".equals(hora_Inicial) || null==hora_Inicial){
mensajeError+="<br>Ingrese hora Inicial";
}
if("".equals(hora_final) || null==hora_final){
mensajeError+="<br>Ingrese hora final";
}
if("".equals(cant_terminadas) || null==cant_terminadas){
mensajeError+="<br>Ingrese cantidades terminadas";
}
if("".equals(cant_pendientes) || null==cant_pendientes){
mensajeError+="<br>Ingrese cantidades pendientes";
}
if("".equals(usuariocreador) || null==usuariocreador){
mensajeError+="<br>Ingrese usuario creador";
}
if("".equals(estado) || null==estado){
mensajeError+="<br>Ingrese estado";
}
if("".equals(total_horas) || null==total_horas){
mensajeError+="<br>Ingrese total horas";
}

//Lanzamos una excepcion cuando falte algun  
//dato obligatorio 
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}//fin si no hay ningun error 
//ejecutamos la accion 
mensajeError= dao.getInsertarGestion(con.getCon(), consecutivo, idempleado, codmueble, idtarea,cantidad, fecha_sistema, hora_Inicial, hora_final, cant_terminadas, cant_pendientes,usuariocreador, estado, total_horas );
//validamos y eviamos una excepcion al guardar el dato.
if(!"".equals(mensajeError)){
 throw new Exception(mensajeError);
}
}//fin metodo----> regresamos al UsuarioServlet
}// fin clase 







