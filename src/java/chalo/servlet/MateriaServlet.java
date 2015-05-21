/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.servlet;

import chalo.entidades.Materia;
import chalo.negocio.MateriaN;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class MateriaServlet extends HttpServlet {

  private String codigo;
    
//permite  todos los m�todos de la intef�z servlet

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)// processRequest: vac�o y protegido; recibe como par�metros peticionnes y respuestas del y hac�a el cliente

            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String modulo = "./FMateria.jsp";
        String pagina="./FPrincipal.jsp";
        request.setAttribute("targetModulo", modulo);
        
        String m = "";
        String d = "";
        request.setAttribute("mensajes", null);
        request.setAttribute("datos", null);
        request.setAttribute("actualizar", "");
  
        
        String codigo = request.getParameter("txtcodigo");
        String medida = request.getParameter("cbomedida");
        String fechai = request.getParameter("txtingreso");
        String fechav = request.getParameter("txtingresov");
        String estado = request.getParameter("cboestado");
        String descripcion = request.getParameter("txtcomentarios");
        
        String boton = request.getParameter("action");
        request.setAttribute("Listado",null);
        request.setAttribute("datomateria",null);
        
        MateriaN un = new  MateriaN();
        Materia enti= new Materia();
        
        if ("buscar".equals(request.getParameter("action"))) {//la request es la peticion del cliente
            try {
                
                request.setAttribute("datomateria",un.getMateria(codigo));
                } catch (Exception e) {
                    m=""+e.getMessage();
            }
        }//fin boton buscar
        
        //Mostrar todos los datos tabla o consulta
         if ("mostrar".equals(request.getParameter("action"))) {//la request es la peticion del cliente
            try {
                request.setAttribute("Listado", un.Listadomateria());
                } catch (Exception e) {
                    m=""+ e.getMessage();
            }
        }//fin boton mostrar y regresamos a FUsuario.jsp
       
     if ("guardar".equals(request.getParameter("action"))) {
            try {
               un.getInsertarMateria(new Materia(codigo,medida,fechai,fechav,estado,descripcion));
               request.setAttribute("listado", un.Listadomateria());
            } catch (Exception e) {
                m=""+e.getMessage();
            }         
          
        }//fin boton guardar. Regreamos a FUsuario.jsp



  if ("actualizar".equals(request.getParameter("action"))) {
            try {
                un.getActualizarMateria(new Materia(codigo,medida,fechai,fechav,estado,descripcion));
                request.setAttribute("listado", un.Listadomateria());
            }catch (Exception e) {
                m=""+e.getMessage();
            }
        }//fin boton actualizar
        
         if ("nuevo".equals(request.getParameter("action"))) {//la request es la peticion del cliente
                 try {
                      enti.setCodigo((""));
                      enti.setMedida((""));
                      enti.setFechai((""));
                     enti.setFechav((""));
                      enti.setEstado((""));
                      enti.setDescripcion((""));
                     
                     
                     request.setAttribute("Listado", null);
                     request.setAttribute("datomateria",enti);// Inicializar valores

                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
                 try {
                     request.setAttribute("Listadomateria", null);
                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
            
            
            
        }//fin boton mostrar y regresamos a proveedores.jsp
        


        request.setAttribute("mensajes", m);
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
