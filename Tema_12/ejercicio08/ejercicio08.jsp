<%-- 
    Document   : ejercicio06
    Created on : 31-ene-2019, 8:36:51
    Author     : laura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 08</title>
        <link href="estilo.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <% int n = Integer.parseInt(request.getParameter("numero")); %>
    <h1>Tabla de multiplicar</h1>
    <table>
      <%
        for(int i = 0; i < 11; i++) {
          out.println("<tr><td>" + i + " x " + n + "</td><td> = </td><td>" + i * n + "</td></tr>");
        }
      %>
    </body>
</html>
