/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.servlet;

import chalo.entidades.Gestion;
import chalo.negocio.GestionN;
import chalo.utilidades.Utilidades;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class GestionServlet extends HttpServlet {
  
   
//permite  todos los m�todos de la intef�z servlet

   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)// processRequest: vac�o y protegido; recibe como par�metros peticionnes y respuestas del y hac�a el cliente

            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String modulo = "./FGestion.jsp";
        String pagina="./FPrincipal.jsp";
         request.setAttribute("targetModulo", modulo);
        
         
        String m = "";
        String d = "";
        request.setAttribute("mensajes", null);
        request.setAttribute("datos", null);
        String consecutivo = request.getParameter("txtconsecutivo");
        String idempleado = request.getParameter("txtidempleado");
        String codmueble = request.getParameter("txtcodmueble");
        String idtarea = request.getParameter("cbotarea");
        String cantidad = request.getParameter("txtcantidad");
        String fecha_sistema = request.getParameter("txtfecha_sistema");
        String hora_Inicial = request.getParameter("txthora_Inicial");
        String hora_final = request.getParameter("txthora_final");
        String cant_terminadas = request.getParameter("txtcant_terminadas");
        String cant_pendientes = request.getParameter("txtcant_pendientes");
        String usuariocreador = request.getParameter("txtusuariocreador");
        String estado = request.getParameter("cboestado");
        String total_horas = request.getParameter("txttotal_horas");
      
        String boton = request.getParameter("action");
        request.setAttribute("Listado",null);
        request.setAttribute("ListadoTareas",null);
        request.setAttribute("datogestion",null);
        
        GestionN un = new  GestionN();
        Gestion enti = new Gestion();
        
        if ("buscar".equals(request.getParameter("action"))) {//la request es la peticion del cliente
            try {
                
               request.setAttribute("datogestion",un.getGestion(consecutivo));
                } catch (Exception e) {
                    m=""+e.getMessage();
            }
        }//fin boton buscar
        
        //Mostrar todos los datos tabla o consulta
         if ("mostrar".equals(request.getParameter("action"))) {//la request es la peticion del cliente
            try {
                request.setAttribute("Listado", un.Listadogestion());
                } catch (Exception e) {
                    m=""+ e.getMessage();
            }
            try {
                    request.setAttribute("ListadoTareas",un.Listadotareas());
                } catch (Exception e) {
                    m=""+ e.getMessage();
            }}
         
             if ("nuevo".equals(request.getParameter("action"))) {//la request es la peticion del cliente
                 try {
                      enti.setFecha_sistema(Utilidades.getFecha());
                      enti.setHora_Inicial(Utilidades.getHoraCorta());
                      enti.setUsuariocreador(usuariocreador);
                     enti.setConsecutivo(un.getConsecutivoGestion());
                      
                     
                     request.setAttribute("Listado", null);
                     request.setAttribute("datogestion",enti);// Inicializar valores

                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
                 try {
                     request.setAttribute("ListadoTareas", null);
                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
            
            
            
        }//fin boton mostrar y regresamos a proveedores.jsp
        if ("crear".equals(request.getParameter("action"))) {
            try {
             request.setAttribute("ListadoTareas",un.Listadotareas());
             request.setAttribute("Listado",null);
             request.setAttribute("datogestion",null);
               
            } catch (Exception e) {
            }
        }//fin boton crear

        if ("guardar".equals(request.getParameter("action"))) {
            try {
               un.getInsertarGestion(new Gestion(consecutivo,idempleado, codmueble,idtarea,cantidad,fecha_sistema,hora_Inicial ,hora_final , cant_terminadas , cant_pendientes ,usuariocreador,estado,total_horas));
               request.setAttribute("Listado", un.Listadogestion());
                } catch (Exception e) {
                 m=""+e.getMessage();
            }
        }//fin boton guardar------>regresamos proveedores.jsp



        if ("bloquear".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta boton del servlet :" + boton;
              d = "Nombre :" + consecutivo;
               

            } catch (Exception e) {
            }
        }//fin boton bloquear

        if ("actualizar".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta boton del servlet :" + boton;
               d = "Nombre :" + idtarea;
                
            } catch (Exception e) {
            }
        }//fin boton actualizar
        
        
        
        


        request.setAttribute("mensaje", m);
        request.setAttribute("datos", d);
        




   request.getRequestDispatcher(pagina).forward(request, response);

    }//fin metodo processRequest
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

