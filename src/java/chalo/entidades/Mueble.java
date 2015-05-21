/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;


public class Mueble {
    String codigo;
    String tipomueble;
    String costopro;
    String costoven;
    String estado;
    String descripcion;
           
    
    public Mueble(){}
    
    public Mueble(String codigo,  String tipomueble, String costopro,String costoven,String estado,String descripcion){
        this.codigo=codigo;
        this.tipomueble=tipomueble;
        this.costopro=costopro;
        this.costoven=costoven;
        this.estado=estado;
        this.descripcion=descripcion;
        
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipomueble() {
        return  tipomueble();
    }

    public void setTipomueble(String tipomueble) {
        this.tipomueble = tipomueble;
    }

    public String getCostopro() {
        return costopro;
    }

    public void setCostopro(String costopro) {
        this.costopro = costopro;
    }

    public String getCostoven() {
        return costoven;
    }

    public void setCostoven(String costoven) {
        this.costoven = costoven;
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

    private String tipomueble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

