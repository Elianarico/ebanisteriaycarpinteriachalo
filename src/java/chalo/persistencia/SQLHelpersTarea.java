/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.persistencia;

/**
 *
 * @author Usuario
 */
public class SQLHelpersTarea {
    
   //String codigo, String medida, String fechai, String fechav,
            //String estado, String descripcion

public static String getTarea()
{
return "SELECT codigo,descripcion,costo_hora from tbltarea";   
}//fin método  

public static String getTarea(String codigo)
{
return "SELECT codigo,descripcion,costo_hora from tbltarea where codigo='"+codigo+"'";   
}//fin método buscar un dato
//Nos vamos para---> Daos
// Buscar un dato
//insertar un dato 
public static String getInsertarTarea(){
return "INSERT INTO tbltarea(codigo,descripcion,costo_hora)"
        +"values(?,?,?)";
}//fin insertar

//Actualizar un dato
public static String getActualizarTarea(){

    return "UPDATE tbltarea codigo=?,descripcion=?,costo_hora=?";
}//fin actualizar 
    //nos vamos para daos
    
}

    


