<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Plataforma Web - Examen Parcial</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        
        <h1>INFORMACION DE PAGO</h1><br>
        <p><i> ${message}</i></p>
        <form action="libros" method="post">  
        
            <input type="hidden" name="action" value="pagar">
            <input type="hidden" name="codigo" value=""> 
            
            <label class="pad_top">Nombre Y Apellido:</label>
            <input type="text" name="firstName" value="${user.firstName}"><br>
            <label class="pad_top">Numero de Tarjeta:</label>
            <input type="text" name="numTarjeta" value="${user.numTarjeta}"><br>        
            <label class="pad_top">Fecha Exp.:</label>
            <input type="text" name="fechaExp" value="${user.fechaExp}"><br> 
            <label class="pad_top">Cod. Seguridad:</label>
            <input type="text" name="codSeg" value="${user.codSeg}"><br>
            
            <label>&nbsp;</label>
            <input type="submit" value="REALIZAR COMPRA" class="margin_left">
            
        </form>
    </body>
</html>
