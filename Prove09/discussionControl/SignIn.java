/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discussionControl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zane
 */
@WebServlet(name = "SignIn", urlPatterns = {"/SignIn"})
public class SignIn extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("signIn.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form input
        String username = request.getParameter("username");
        String password = request.getParameter("password");
              
        // Username and password
        String correctUsername = "Zane";
        String correctPassword = "Java";
        
        // Compare username and password to correct values
        
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            
            // New session variable
            
            request.getSession().setAttribute("username", username);
            
            // Redirect to new post
            
            response.sendRedirect("addPost.jsp");
        } else {
            // Bad username/passord
            // Redirect to incorrect login page
            response.sendRedirect("badLogin.jsp");
        }
    }
}
    
    

    