<%-- 
    Document   : showAddProduct
    Created on : Apr 22, 2019, 12:26:42 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавка товара</title>
    </head>
    <body>
        <h1>Заполните форму</h1>
        <form action="createProduct" method="POST">
            Бренд:<br>
            <input type="text" name="brand"><br>
            Название:<br>
            <input type="text" name="name"><br>
            Цвет:<br>
            <input type="text" name="color"><br>
            Размер:<br>
            <input type="text" name="size"><br>
            Количество:<br>
            <input type="text" name="quantity"><br>
            Цена:<br>
            <input type="text" name="price"><br>
            <br>
            <input type="submit" value="Добавить"><br>
        </form>
    </body>
</html>
