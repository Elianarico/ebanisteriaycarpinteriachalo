/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import java.sql.Connection;
import java.util.List;
import chalo.entidades.Usuario;
import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;

/**
 *
 * @author Usuario
 */
public class UsuarioN {
   Daos dao;
    public UsuarioN(){
    dao= new Daos();
    
    
    }// fin constructor
 public List<Usuario>ListadoUsuario(){
 Connection c= new Conexion().getCon();
    return dao.ListadoUsuarios(c);
    //una vez programado pasamos al servlet
    
 }  //fin lista de datos
  public Usuario getUsuario(String ide){
 Connection c= new Conexion().getCon();
    return dao.getUsuario(c, ide);
    //una vez programado pasamos al servlet al buscar
    
 }   
  
   public Usuario getUsuarioEmail(String email){
       Connection c= new Conexion().getCon();
    return dao.getUsuarioEmail(c, email);
    //una vez programado pasamos al servlet al buscar
    
 }  
  
  public Usuario getValidarIngreso(String identidad,String clave){
Connection c= new Conexion().getCon();
return dao.getValidarIngreso(c, identidad,clave);
// una vez programado pasamos
//  al UsuarioServlet al buscar
}  
  
public void getInsertarUsuario (Usuario user) throws Exception{
//throws es una clase que permite programar nuestras propias excepciones
    
Conexion con = new Conexion();
String mensajeError="";
String identidad= user.getIdentidad();
String documento = user.getDocumento();
String nombre = user.getNombre();
String apellidos = user.getApellidos();
String email = user.getEmail();
String celular= user.getCelular();
String direccion = user.getDireccion();
String clave= user.getClave();
String telefono= user.getTelefono();
String estado= user.getEstado();
String perfil= user.getPerfil ();
String genero= user.getGenero ();


if("".equals(identidad) || null==identidad) {
mensajeError+="<br>Ingrese el Número de Identidad";
}

if("".equals(documento) || null==documento) {
mensajeError+="<br>Ingrese el Tipo de Documento";
}

if("".equals(nombre) || null==nombre) {
mensajeError+="<br>Ingrese el Nombre";
}

if("".equals(apellidos) || null==apellidos) {
mensajeError+="<br>Ingrese los Apellidos"+apellidos ;
}

if("".equals(email) || null==email) {
mensajeError+="<br>Ingrese su Correo Electrónico";
}

if("".equals(celular) || null==celular) {
mensajeError+="<br>Ingrese su Número de Celular";
}


if("".equals(direccion) || null==direccion) {
mensajeError+="<br>Ingrese su Número de Residencia";
}

if("".equals(clave) || null==clave) {
mensajeError+="<br>Ingrese su Clave";
}

if("".equals(telefono) || null==telefono) {
mensajeError+="<br>Ingrese su Número de Teléfono";
}

if("".equals(estado) || null==estado) {
mensajeError+="<br>Ingrese su Estado";
}

if("".equals(perfil) || null==perfil) {
mensajeError+="<br>Ingrese su Perfil";
}

if("".equals(genero) || null==genero) {
mensajeError+="<br>Ingrese su Genero";
}

if(!"".equals(mensajeError)){
//! se está negando
    
throw new Exception(mensajeError);  
}//fin si no hay ningún error
//ejecutamos la acción
Connection c= new Conexion().getCon();
if (dao.getVerSiExisteUsuario(c,identidad)) {
     mensajeError="Ya existe El usuario :"+ identidad;
    throw new Exception(mensajeError);
}

if(identidad.charAt(0)=='0'){
 mensajeError=" El usuario no puede iniciar con (0):"+ identidad;
   throw new Exception(mensajeError);

}

//lanzar una excepción si el email ya existe

if (dao.getVerSiExisteEmail(c,email)) {
     mensajeError="El correo electrónico <br> ya está asignado a <b> otro usuario :"+ email;
    throw new Exception(mensajeError);
}

mensajeError=dao.getInsertarUsuario(con.getCon(), identidad, documento, nombre, apellidos,email,
        celular,direccion, clave, telefono, estado, perfil, genero);

//validamos y enviamos una excepción al guardar el dato

if(!"".equals(mensajeError)){   
throw new Exception(mensajeError);  
}

} //fin método,no retorna nada. Regresamos al usario servlet
  
public void getActualizarUsuario (Usuario user) throws Exception{
//throws es una clase que permite programar nuestras propias excepciones
    
Conexion con= new Conexion();
String mensajeError="";
String identidad= user.getIdentidad();
String documento = user.getDocumento();
String nombre = user.getNombre();
String apellidos = user.getApellidos();
String email = user.getEmail();
String celular= user.getCelular();
String direccion = user.getDireccion();
String clave= user.getClave();
String telefono= user.getTelefono();
String estado= user.getEstado();
String perfil= user.getPerfil ();
String genero= user.getGenero ();


if("".equals(identidad) || null==identidad) {
mensajeError+="<br>Ingrese el Número de Identidad";
}

if("".equals(documento) || null==documento) {
mensajeError+="<br>Ingrese el Tipo de Documento";
}

if("".equals(nombre) || null==nombre) {
mensajeError+="<br>Ingrese el Nombre";
}

if("".equals(apellidos) || null==apellidos) {
mensajeError+="<br>Ingrese los Apellidos"+apellidos ;
}

if("".equals(email) || null==email) {
mensajeError+="<br>Ingrese su Correo Electrónico";
}

if("".equals(celular) || null==celular) {
mensajeError+="<br>Ingrese su Número de Celular";
}


if("".equals(direccion) || null==direccion) {
mensajeError+="<br>Ingrese su Número de Residencia";
}

if("".equals(clave) || null==clave) {
mensajeError+="<br>Ingrese su Clave";
}

if("".equals(telefono) || null==telefono) {
mensajeError+="<br>Ingrese su Número de Teléfono";
}

if("".equals(estado) || null==estado) {
mensajeError+="<br>Ingrese su Estado";
}

if("".equals(perfil) || null==perfil) {
mensajeError+="<br>Ingrese su Perfil";
}

if("".equals(genero) || null==genero) {
mensajeError+="<br>Ingrese su Genero";
}

if(!"".equals(mensajeError)){
//! se está negando
    
throw new Exception(mensajeError);  
}//fin si no hay ningún error
//ejecutamos la acción



//verificamos si elusuario existe


mensajeError=dao.getActualizarUsuario(con.getCon(), identidad, documento, nombre, apellidos,email,
        celular,direccion, clave, telefono, estado, perfil, genero);

//validamos y enviamos una excepción al guardar el dato

if(!"".equals(mensajeError)){   
throw new Exception(mensajeError);  
}

//verificamos si elusuario existe




} //fin método,no retorna nada. Regresamos al usario servlet  
  
  
  
  
   
  
  
  
}//fin clase
