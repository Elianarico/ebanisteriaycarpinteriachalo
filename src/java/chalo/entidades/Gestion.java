/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.entidades;

import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */

public class Gestion {

    public Gestion() {
    }

  private String   consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,
  hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador ,  estado ,  total_horas;
  
  private String nombre_empleado, nombre_tarea, nombre_mueble; 

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getNombre_mueble() {
        return nombre_mueble;
    }

    public void setNombre_mueble(String nombre_mueble) {
        this.nombre_mueble = nombre_mueble;
    }
  
    public Gestion(String consecutivo, String idempleado, String codmueble, String idtarea, String cantidad, String fecha_sistema, String hora_Inicial, String hora_final, String cant_terminadas, String cant_pendientes, String usuariocreador, String estado, String total_horas) {
        this.consecutivo = consecutivo;
        this.idempleado = idempleado;
        this.codmueble = codmueble;
        this.idtarea = idtarea;
        this.cantidad = cantidad;
        this.fecha_sistema = fecha_sistema;
        this.hora_Inicial = hora_Inicial;
        this.hora_final = hora_final;
        this.cant_terminadas = cant_terminadas;
        this.cant_pendientes = cant_pendientes;
        this.usuariocreador = usuariocreador;
        this.estado = estado;
        this.total_horas = total_horas;
    }

    

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getCodmueble() {
        return codmueble;
    }

    public void setCodmueble(String codmueble) {
        this.codmueble = codmueble;
    }

    public String getIdtarea() {
        return idtarea;
    }

    public void setIdtarea(String idtarea) {
        this.idtarea = idtarea;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_sistema() {
        return fecha_sistema;
    }

    public void setFecha_sistema(String fecha_sistema) {
        this.fecha_sistema = fecha_sistema;
    }

    public String getHora_Inicial() {
        return hora_Inicial;
    }

    public void setHora_Inicial(String hora_Inicial) {
        this.hora_Inicial = hora_Inicial;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }

    public String getCant_terminadas() {
        return cant_terminadas;
    }

    public void setCant_terminadas(String cant_terminadas) {
        this.cant_terminadas = cant_terminadas;
    }

    public String getCant_pendientes() {
        return cant_pendientes;
    }

    public void setCant_pendientes(String cant_pendientes) {
        this.cant_pendientes = cant_pendientes;
    }

    public String getUsuariocreador() {
        return usuariocreador;
    }

    public void setUsuariocreador(String usuariocreador) {
        this.usuariocreador = usuariocreador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(String total_horas) {
        this.total_horas = total_horas;
    }
    
    
}

