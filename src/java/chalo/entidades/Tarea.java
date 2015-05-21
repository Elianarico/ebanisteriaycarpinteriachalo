/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;

/**
 *
 * @author USER
 */
public class Tarea {
private String  codigo,      descripcion,      costo_hora;    

    public Tarea() {
    }

    public Tarea(String codigo, String descripcion, String costo_hora) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo_hora = costo_hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCosto_hora() {
        return costo_hora;
    }

    public void setCosto_hora(String costo_hora) {
        this.costo_hora = costo_hora;
    }
    
}
