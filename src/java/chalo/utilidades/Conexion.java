/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.utilidades;

/**
 *
 * @author usuario
 */
import chalo.persistencia.SQLHelpers;
import chalo.persistencia.SQLHelpers2;
import chalo.persistencia.SQLHelpersMateria;
import chalo.persistencia.SQLHelpersGestion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *@serial 000-8999
 * @author Sani
 * @since 29-05-2014
 */
public class Conexion {
    Connection Con;
    public Conexion(){}//Constructor de la clase
    static{
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();//crear una instancia o una copia o un  objeto de la clase oracle Driver 
    }
    catch(ClassNotFoundException e1){
    System.out.println("ClassNotFoundException"+e1.getMessage());
            }
    catch(InstantiationException e2){
    System.out.println("InstantiationException"+e2.getMessage());//controlar las excepciones de la inicializacion
        }
    catch(IllegalAccessException e3){
    System.out.println("IllegalAccessException"+e3.getMessage());//Controla  los errores cuando se accece a la clase de forma no permitida
       }
    catch(Exception e){
    System.out.println("Exception"+e.getMessage());}//errores generales
    
    }//fin static
    public Connection getCon() {//devuelve un objeto
        ConexionDB();
                
        return Con;
    }

    public void setCon(Connection Con) {//establece y recibe como parametro un objeto
        this.Con = Con;
    }
    public void cerrar() throws SQLException{
    
    this.Con.close();
    }
    public void ConexionDB(){//Metodo vacio sin parámetros
    String host="localhost";
    String puerto="1521";
    String SID="xe";
    String user="prueba";
    String password="123";
    try{
DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
setCon(DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+puerto+":"+SID, user, password));


}
    catch(SQLException e4){
    System.out.println("SQLException"+e4.getMessage());
            
    }
    catch (Exception e){
    System.out.println("Exception"+e.getMessage());
    }
            
    }      
    
    public static void main(String param[]){
    Conexion c=new Conexion();
    try{
    ResultSet r=c.getCon().prepareStatement(SQLHelpers2.getMueble()).executeQuery();
    //es un estado que permite establecer los resultados o guardar resultados de tablas o consultas temporalmente
    if(r.next()){
    System.out.println("identidad "+r.getString(1));
    System.out.print("documento"+r.getString(2));
    System.out.println("nombre "+r.getString(3));
    System.out.println("apellidos "+r.getString(4));
    System.out.print("email "+r.getString(5));
    System.out.println("celular "+r.getString(6));
   
  
    
 
    while(r.next()){
    System.out.println("identidad "+r.getString(1));
    System.out.print("documento"+r.getString(2));
    System.out.println("nombre "+r.getString(3));
    System.out.println("apellidos "+r.getString(4));
    System.out.print("email "+r.getString(5));
    System.out.println("celular "+r.getString(6));
   
    }       
    } else{
    System.out.println("¡...No hay datos...! ");}//fin si
    
    }//fin mientras
    catch(Exception e){
    System.out.println("Error :"+e.getMessage()+"Causa :"+e.getCause());
    
    }
 
    
     
}//fin catch 
    
    
    
     
    }//fin conexion
    
