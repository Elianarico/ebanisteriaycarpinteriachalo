/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;

/**
 *
 * @author Usuario
 */
public class Materia {
    
String codigo;
String medida;
String fechai;
String fechav;
String estado;
String descripcion;



public Materia (){}

    public Materia(String codigo, String medida, String fechai, String fechav,
            String estado, String descripcion) {
        
        this.codigo = codigo;
        this.medida = medida;
        this.fechai = fechai;
        this.fechav = fechav;
        this.estado = estado;
        this.descripcion = descripcion;
        
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public String getFechav() {
        return fechav;
    }

    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   

    
    
}
