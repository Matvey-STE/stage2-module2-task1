package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GetUsersServlet extends HttpServlet {
    public void init() {

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        getServletContext().getRequestDispatcher("/jsp/users.jsp").forward(request,response);
    }
    public void destroy() {
    }
}
