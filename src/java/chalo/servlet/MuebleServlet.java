
package chalo.servlet;


import chalo.entidades.Mueble;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chalo.negocio.MuebleN;

/**
 *
 * @author Usuario
 */
public class MuebleServlet extends HttpServlet {
 
   

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
   
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String modulo = "FMueble.jsp";
        String pagina="./FPrincipal.jsp";
        request.setAttribute("targetModulo", modulo);
        String m = "";
        String d = "";
        request.setAttribute("mensajes", null);
        request.setAttribute("datos", null);
       
        
    String codigo= request.getParameter("txtcodigo");
    String tipomueble = request.getParameter("txttipomueble");
    String costopro = request.getParameter("txtcostopro");
    String costoven = request.getParameter("txtcostoven");
    String estado = request.getParameter("cboestado");
    String descripcion = request.getParameter("textarea");
   
   
        String boton = request.getParameter("action");
        request.setAttribute("listado", null);
        request.setAttribute("datomueblen", null);
        
        MuebleN un= new MuebleN();
        
        
        if ("nuevo".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta botón del servlet: "+boton;
                d = "codigo:"+ codigo;
            } catch (Exception e) {
            }
        }//fin boton nuevo
        
        
        if ("guardar".equals(request.getParameter("action"))) {
            try {
               un.getInsertarMueble(new Mueble(codigo, tipomueble, costopro, costoven, estado, descripcion));
               request.setAttribute("listado", un.ListadoMueble());
            } catch (Exception e) {
                m=""+e.getMessage();
            }         
          
        }//fin boton guardar. Regreamos a FUsuario.jsp
        
        
        if ("actualizar".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta botón del servlet: "+boton;
                d = "codigo:"+ codigo;
            }catch (Exception e2) {
                
            }
        }//fin boton actualizar
        
        
        if ("modificar".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta botón del servlet: "+boton;
                d = "codigo:"+ codigo;
            } catch (Exception e2) {
            }
        }//fin boton modificar
        
        
        if ("buscar".equals(request.getParameter("action"))) {
            try {
            request.setAttribute("datomueble", un.getMueble(codigo));
            request.setAttribute("listado", un.ListadoMueble());
           
            } catch (Exception e2) {
            m=""+e2.getMessage();
            }
        }//fin boton buscar---- regresamos a FUsuario.jsp
        
        
        if ("mostrar".equals(request.getParameter("action"))) {
            try {
            request.setAttribute("listado", un.ListadoMueble());
            } catch (Exception e2) {
            m=""+e2.getMessage();
            }
        }//fin boton mostrar

        
         if ("bloquear".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta botón del servlet: "+ boton;
                d = "codigo:"+ codigo;
            } catch (Exception e) {
            }
        }//fin boton bloquear
         
           if ("salir".equals(request.getParameter("action"))) {
            try {
              request.getSession().invalidate();
           request.getRequestDispatcher("./index.jsp").forward(request, response);   
                
            } catch (Exception e) {
            }
        }//fin boton actualizar 
         
         
         
        
         
        request.setAttribute("mensajes", m);
        request.setAttribute("datos", d);
        request.getRequestDispatcher(pagina).forward(request, response);
      
    }
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