/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.negocio;

import chalo.persistencia.Daos;
import chalo.utilidades.Conexion;

/**
 *
 * @author Usuario
 */
public class SedeN {
Daos dao;    
Conexion c = new Conexion ();
    
public SedeN () { 
dao = new Daos ();
}// fin constructor
//public List<Sede> listadoSedes(String campo, String valor)
//{ return dao.ListadoSedes(c.getCon(), campo, valor);    
//}

//public Sede getSede (String campo, String valor)
//{ return dao.getSede (c.getCon(), campo, valor);    
//}

//public void grabarSede (Sede hijosede )throws Esception  {
//String consc= hijosede.getConsc();
//todos los datos


//String mensaje="";

//se colocan todos los datos
//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(nombre) ||null==(nombre)){ 
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//lanzar excepción
//if (! "".equals(mensaje)){
  //throw new Exception(mensaje);
//}

//mensaje = dao.getInsertarSede(c.getCon(), consc, datos);

//if (! "".equals(mensaje)){
  //throw new Exception(mensaje);
//}



//}//fin grabar sede

//public void grabarSede (Sede hijosede )throws Esception  {
//String consc= hijosede.getConsc();
//todos los datos


//String mensaje="";

//se colocan todos los datos
//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(nombre) ||null==(nombre)){ 
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//if ("".equals(consc) ||null==(consc)){
//mensaje="<br>Ingrese consecutivo";

//}

//lanzar excepción
//if (! "".equals(mensaje)){
  //throw new Exception(mensaje);
//}

//mensaje = dao.getInsertarSede(c.getCon(), consc, datos);

//if (! "".equals(mensaje)){
  //throw new Exception(mensaje);
//}



//}//fin grabar sede



}
