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
        
        <h1>TIENDA DE LIBROS</h1><br>
        <form action="Libros" method="post">
        <table>
            <tr>
              <th>Codigo</th>
              <th>Titulo</th>
              <th>Autor</th>
              <th>Genero</th>
              <th>Precio</th>
              <th></th>
            </tr>
            
            <c:forEach var="item" items="${listaLibros}">
              <tr>
                 <td>Codigo:<input type="text" name="0553380168" class="input-table"></td>
                 <td><input type="text" name="0062387243" class="input-table"></td>
                 <td><input type="text" name="1501127624" ></td> 
                 <td><input type="text" name="0553418025" </td>
              </tr>
               <tr>
                 <td><input type="text" name="A Brief History of Time" ></td>
                 <td><input type="text" name="Divergent" ></td>
                 <td><input type="text" name="Steve Jobs" ></td> 
                 <td><input type="text" name="The Martian" </td>
              </tr>
               <tr>
                 <td><input type="text" name="Stephen Hawking" ></td>
                 <td><input type="text" name="Veronica Roth" ></td>
                 <td><input type="text" name="Walter Isaacson" ></td> 
                 <td><input type="text" name="Andy Weir" </td>
              </tr>
              <tr>
                 <td><input type="text" name="Ciencia" ></td>
                 <td><input type="text" name="Sci-Fi" ></td>
                 <td><input type="text" name="Biografia" ></td> 
                 <td><input type="text" name="Sci-Fi" </td>
              </tr>
               <tr>
                 <td><input type="text" name="19.84" ></td>
                 <td><input type="text" name="16.13" ></td>
                 <td><input type="text" name="21.26" ></td> 
                 <td><input type="text" name="14.88" </td>
              </tr>
              
                
                <td id='comprar'>
                 <input type="hidden" name="action" value="comprar">                    
                 <input type="hidden" name="codigo" value="${id.comprar}">                    
                 <input type="submit" value="¡COMPRAR!">
                                                     
                                               
                </td>
                </td>
              </tr>
            </c:forEach>
          </table>
         </form>
   </body>
</html>
