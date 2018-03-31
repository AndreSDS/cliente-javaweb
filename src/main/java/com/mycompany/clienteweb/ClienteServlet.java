/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clienteweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edube
 */
@WebServlet(urlPatterns = {"/cliente","/clienteController","/clienteServlet"})
public class ClienteServlet extends HttpServlet{

    public ClienteServlet() {
        System.out.println("Construindo servlet...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Iniciando o servlet...");
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chamando service...");
        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("Chamou o método GET...");
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Chamou o método post...");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Chamou o método put...");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Chamou o método delete...");
    }
}
