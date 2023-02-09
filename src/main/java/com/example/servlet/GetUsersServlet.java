package com.example.servlet;

import com.example.User;
import com.example.Warehouse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;
public class GetUsersServlet extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Set<User> userSet = Warehouse.getInstance().getUsers();
        request.setAttribute("users", userSet);
        getServletContext().getRequestDispatcher("/jsp/users.jsp").forward(request,response);
    }
    public void destroy() {
    }
}
