/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.ProductFacade;

/**
 *
 * @author user
 */
@WebServlet(name = "WebShop3Controller", urlPatterns = {
    "/showAddProduct",
    "/createProduct",
    "/showNewCustomer",
    "/createCustomer",
    "/showNewPurchase",
    "/createPurchase",
    "/showListProducts",
    "/showListCustomers",
    
})
public class WebShop3Controller extends HttpServlet {
@EJB ProductFacade productFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/showAddProduct":
                request.getRequestDispatcher("/showAddProduct.jsp")
                        .forward(request, response);
                break;
            case "/createProduct":
                String brand = request.getParameter("brand");
                String name = request.getParameter("name");
                String color = request.getParameter("color");
                String size = request.getParameter("size");
                String quantity = request.getParameter("quantity");
                String price = request.getParameter("price");
                Product product = new Product(
                        brand, 
                        name, 
                        color, 
                        new Double(size), 
                        new Integer(quantity), 
                        new Integer(price)
                );
                productFacade.create(product);
                request.setAttribute("info", "Продукт добавлен");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/showNewCustomer":
                
                break;
            case "/createCustomer":
                
                break;
            case "/showNewPurchase":
                
                break;
            case "/createPurchase":
                
                break;
            case "/showListProducts":
                
                break;
            case "/showListCustomers":
                
                break;    
            default:
                throw new AssertionError();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
