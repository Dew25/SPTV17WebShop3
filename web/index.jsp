<%-- 
    Document   : index
    Created on : Apr 22, 2019, 12:16:36 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Наш магазин!</h1>
        <p>${info}</p>
        <a href="showAddProduct">Добавить товар</a><br>
        <a href="showNewCustomer">Зарегистрировать покупателя</a><br>
        <a href="showNewPurchase">Совершить покупку</a><br>
        <a href="showListProducts">Список товаров</a><br>
        <a href="showListCustomers">Список покупателей</a><br>
    </body>
</html>
