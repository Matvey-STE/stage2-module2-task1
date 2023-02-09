package com.example.servlet;

import com.example.User;
import com.example.Warehouse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "addUserServlet", value = "/add")
public class AddUserServlet extends HttpServlet {
    public void init() {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        User getUser = new User(firstName,lastName);
        Warehouse.getInstance().addUser(getUser);

        request.setAttribute("users",Warehouse.getInstance().getUsers());

        RequestDispatcher rd = request.getRequestDispatcher("/jsp/users.jsp");
        rd.forward(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        getServletContext().getRequestDispatcher("/jsp/add.jsp").forward(request,response);
    }
    public void destroy() {
    }
}
