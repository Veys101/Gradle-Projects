package com.app.webdemo;
 
import  org.junit.Before;
import  org.junit.Test;
import  org.mockito.Mock;
import  org.mockito.MockitoAnnotations;
 
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.beans.Transient;
import java.io.PrintWriter;
import java.io.StringWriter;
 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class HelloServletTest {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher requestDispatcher;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void doGet() throws Exception {
        when(request.getContentType()).thenReturn("text/html");
        when(request.getRequestDispatcher("./hello.html")).thenReturn(requestDispatcher);
        new HelloServlet().doGet(request, response);
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void doPost() throws Exception {
       when(request.getParameter("hello")).thenReturn("John");
       when(request.getRequestDispatcher("hello.jsp")).thenReturn(requestDispatcher);
       new HelloServlet().doPost(request, response);
       verify(request).setAttribute("username", "John");
       verify(requestDispatcher).forward(request, response);

    }

}
