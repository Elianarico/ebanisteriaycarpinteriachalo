/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;

/**
 *
 * @author Usuario
 */
public class Usuario {
String identidad;
String documento;
String nombre;
String apellidos;
String email;
String celular;
String direccion;
String clave;
String telefono;
String estado;
String perfil;
String genero;


public Usuario (){}

    public Usuario(String identidad, String documento, String nombre, String apellidos,
            String email, String celular, String direccion, String clave, String telefono,String estado, String perfil, String genero) {
        
        this.identidad = identidad;
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
        this.clave = clave;
        this.telefono = telefono;
        this.estado = estado;
        this.perfil = perfil;
        this.genero = genero;
        
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    
}
