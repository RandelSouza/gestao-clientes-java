<%-- 
    Document   : index
    Created on : 04/03/2022, 21:48:56
    Author     : Ludwig Gonzaga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciamento de Clientes</title>
    </head>
    <body>        
        <%
        String redirectURL = "./login/";
        session.invalidate();
        response.sendRedirect(redirectURL);
        %>        
    </body>
    <!-- comment -->
</html>