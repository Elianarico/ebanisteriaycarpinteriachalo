/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chalo.servlet;



import chalo.entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chalo.negocio.UsuarioN;

/**
 *
 * @author Usuario
 */
public class UsuarioServlet extends HttpServlet {
 
   

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
   
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String modulo = "FUsuario.jsp";
        String pagina="./FPrincipal.jsp";
        request.setAttribute("targetModulo", modulo);
        String m = "";
        String d = "";
        request.setAttribute("mensajes", null);
        request.setAttribute("datos", null);
        request.setAttribute("actualizar", "");
       
        
    String nombre = request.getParameter("txtnombre");
    String documento = request.getParameter("cbodocumento");
    String apellidos = request.getParameter("txtapellidos");
    String identidad = request.getParameter("txtnumero");
    String email = request.getParameter("txtemail");
    String celular = request.getParameter("txtcelular");
    String direccion = request.getParameter("txtdireccion");
    String clave = request.getParameter("txtclave");
    String telefono = request.getParameter("txttelefono");
    String estado = request.getParameter("cboestado");
    String perfil = request.getParameter("cboperfil");
    String genero = request.getParameter("cbogenero");
   
        String boton = request.getParameter("action");
        request.setAttribute("listado", null);
        request.setAttribute("datousuario", null);
        
        UsuarioN un= new UsuarioN();
        Usuario enti = new Usuario();
        
        
       if ("nuevo".equals(request.getParameter("action"))) {//la request es la peticion del cliente
                 try {
                      enti.setNombre((""));
                      enti.setDocumento((""));
                      enti.setApellidos((""));
                     enti.setIdentidad((""));
                      enti.setEmail((""));
                      enti.setCelular((""));
                      enti.setDireccion((""));
                     enti.setClave((""));
                     enti.setTelefono((""));
                      enti.setEstado((""));
                      enti.setPerfil((""));
                     enti.setGenero((""));
                     
                     request.setAttribute("Listado", null);
                     request.setAttribute("datousuario",enti);// Inicializar valores

                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
                 try {
                     request.setAttribute("ListadoUsuario", null);
                 } catch (Exception e) {
                     m = "" + e.getMessage();
                 }
            
            
            
        }//fin boton mostrar y regresamos a proveedores.jsp
        
        
    if ("guardar".equals(request.getParameter("action"))) {
            try {
               un.getInsertarUsuario(new Usuario(identidad, documento, nombre, apellidos, email, celular, direccion, clave, telefono, estado, perfil, genero));
               request.setAttribute("listado", un.ListadoUsuario());
            } catch (Exception e) {
                m=""+e.getMessage();
            }         
          
        }//fin boton guardar. Regreamos a FUsuario.jsp
        
        if ("actualizar".equals(request.getParameter("action"))) {
            try {
                un.getActualizarUsuario(new Usuario(identidad, documento, nombre, apellidos, email, celular, direccion, clave, telefono, estado, perfil, genero));
                request.setAttribute("listado", un.ListadoUsuario());
            }catch (Exception e) {
                m=""+e.getMessage();
            }
        }//fin boton actualizar
        
        
   
        
        
        if ("buscar".equals(request.getParameter("action"))) {
            try {
            request.setAttribute("datousuario", un.getUsuario(identidad));
            request.setAttribute("listado", un.ListadoUsuario());
            request.setAttribute("actualizar", "readonly");
            //regresamos a FUsuario
            } catch (Exception e) {
            m=""+e.getMessage();
            }
        }//fin boton buscar---- regresamos a FUsuario.jsp
        
        
        if ("mostrar".equals(request.getParameter("action"))) {
            try {
            request.setAttribute("listado", un.ListadoUsuario());
            } catch (Exception e) {
            m=""+e.getMessage();
            }
        }//fin boton mostrar

        
         if ("bloquear".equals(request.getParameter("action"))) {
            try {
                m = "Respuesta botón del servlet: "+ boton;
                d = "Nombre:"+ nombre;
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

//catch-controla y captura errores
        //IOException clase que permite controlar errores de entrada y salida
        //PrintWriter-imprime o escribe..Responce- entrega respuesta..
      //PrintWriter out=responce- da una respuesta  y la imprime en pantalla.
      