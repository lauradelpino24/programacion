<%-- 
    Document   : ejercicio5
    Created on : 30-ene-2019, 10:14:52
    Author     : laura

    Realiza un conversor de euros a pesetas.
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Conversor de euros a pesetas</h1>
        <% 
            
            double pesetas = 166.386;
            String euros = request.getParameter("euros");
            double resultado = Double.parseDouble(request.getParameter("euros"))* pesetas;
            DecimalFormat dosDecimales = new DecimalFormat("0.00");
            
        %>
        
        <p><%= euros %> euros son <b><%= dosDecimales.format(resultado) %></b> pesetas.</p>
    </body>
</html>
