/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import java.sql.Connection;
import java.util.List;
import chalo.entidades.Mueble;
import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;

/**
 *
 * @author Usuario
 */
public class MuebleN {
   Daos dao;
    public MuebleN(){
    dao= new Daos();
    
    
    }// fin constructor
 public List<Mueble>ListadoMueble(){
 Connection c1= new Conexion().getCon();
    return dao.ListadoMueble(c1);
    //una vez programado pasamos al servlet
    
 }  //fin lista de datos
  public Mueble getMueble(String ide){
 Connection c1= new Conexion().getCon();
    return dao.getMueble(c1, ide);
    //una vez programado pasamos al servlet al buscar
    
 }   
   
  
public void getInsertarMueble(Mueble user) throws Exception{
//throws es una clase que permite programar nuestras propias excepciones
    
Conexion con = new Conexion();
String mensajeError="";
String codigo= user.getCodigo();
String tipomueble = user.getTipomueble();
String costopro = user.getCostopro();
String costoven = user.getCostoven();
String estado= user.getEstado();
String descripcion= user.getDescripcion ();


if("".equals(codigo) || null==codigo) {
mensajeError+="<br>Ingrese Código";
}

if("".equals(tipomueble) || null==tipomueble) {
mensajeError+="<br>Ingrese el Tipo de Documento";
}

if("".equals(costopro) || null==costopro) {
mensajeError+="<br>Ingrese Costo de Producción";
}

if("".equals(costoven) || null==costoven) {
mensajeError+="<br>Ingrese Costo Venta" ;
}




if("".equals(estado) || null==estado) {
mensajeError+="<br>Ingrese su Estado";
}



if("".equals(descripcion) || null==descripcion) {
mensajeError+="<br>Ingrese Descripción";
}

if(!"".equals(mensajeError)){
//! se está negando
    
throw new Exception(mensajeError);  
}//fin si no hay ningún error
//ejecutamos la acción

mensajeError=dao.getInsertarMueble(con.getCon(), codigo, tipomueble, costopro, costoven,estado,
        descripcion);

//validamos y enviamos una excepción al guardar el dato

if(!"".equals(mensajeError)){   
throw new Exception(mensajeError);  
}

} //fin método,no retorna nada. Regresamos al usario servlet
  
  
  
  
  
}//fin clase

