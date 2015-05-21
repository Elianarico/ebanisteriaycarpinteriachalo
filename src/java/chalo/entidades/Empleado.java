/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;

/**
 *
 * @author Usuario
 */
public class Empleado {
    String usuario;
    String nombre;
    String clave;
    String perfil;
    String estado;

  public Empleado  (){}

    public Empleado(String usuario, String nombre, String clave, String perfil, String estado) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.clave = clave;
        this.perfil = perfil;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

