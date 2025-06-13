package com.example;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Welcome to My Java Web Page</h1>");
        response.getWriter().println("<p>This is served from a Java Servlet using Maven.</p>");
        response.getWriter().println("</body></html>");
    }
}
