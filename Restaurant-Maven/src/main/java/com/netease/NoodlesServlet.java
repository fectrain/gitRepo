package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class NoodlesServlet extends HttpServlet {
	Logger log = Logger.getLogger(NoodlesServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        log.info(vegetable);
        if (vegetable == null) {
            vegetable = "Tomato";
        }

        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        writer.println("</body></html>");
    }
}
