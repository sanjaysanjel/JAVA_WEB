package com.webApp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addServlet")
public class addServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String i = request.getParameter("num1");
        String j = request.getParameter("num2");

        int num1= Integer.parseInt(i);
        int num2= Integer.parseInt(j);
        int sum=num1+num2;

        PrintWriter out = response.getWriter();
        out.println("the result is doPost:"+sum);

//        RequestDispatcher rd = request.getRequestDispatcher("sq");
//        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    int i = Integer.parseInt((request.getParameter("num1")));
//    int j = Integer.parseInt((request.getParameter("num2")));
       String num1 =  request.getParameter("num1");
       String num2 =  request.getParameter("num2");

       int n1 = Integer.parseInt(num1);
       int n2 = Integer.parseInt(num2);

       int sum = n1 + n2;

        PrintWriter out = response.getWriter();
        out.println("the result is"+sum);
//    RequestDispatcher rd = request.getRequestDispatcher("sq");
//        rd.forward(request,response);
    }
}
