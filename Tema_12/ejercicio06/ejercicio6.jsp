<%-- 
    Document   : ejercicio6
    Created on : 30-ene-2019, 10:45:32
    Author     : laura
    
    Realiza un conversor de pesetas a euros.
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
        <h1>Conversor de pesetas a euros</h1>
        <% 
            
            double euros = 166.386;
            String pesetas = request.getParameter("pesetas");
            double resultado = Double.parseDouble(pesetas) / euros;
            DecimalFormat dosDecimales = new DecimalFormat("0.00");
            
        %>
        
        <p><%= pesetas %> pesetas son <b><%= dosDecimales.format(resultado) %></b> euros.</p>
    </body>
</html>
