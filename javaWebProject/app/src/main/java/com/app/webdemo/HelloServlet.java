package com.app.webdemo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("./hello.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException {
        String uName = request.getParameter("hello");
        request.setAttribute("username", uName);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}
