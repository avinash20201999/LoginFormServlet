
package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avinashchauhan
 */
public class RegisterServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("user_name");
        String email=request.getParameter("user_email");
        String pass=request.getParameter("user_password");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String content="<h1 style=\"text-align:center;\">Welcome Back "+name+"!! "+"</h1>";
        out.println(content);
    }

    @Override
    public String getServletInfo() {
        return "This Servlet is created by avinash chauhan @ 16th July 2022 for helping the other students and freshers on Servlet For Form";
    }// </editor-fold>

    

}
