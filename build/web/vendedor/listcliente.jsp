<%@page contentType="text/html" pageEncoding="UTF-8"%>       
<%@page import="dao.ClienteDAO"%>
<%@page import="model.Cliente"%>
<%@page import="model.Pessoa" %>
<%@page import="model.*" %>
<%@page import="java.util.*"%>
<%@page import="java.util.List" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Clientes</title>
    </head>
    <body>
        <header><%@include file="header.jspf"%></header>
          

        <div class="container">
            <h1>Clientes cadastrados</h1>  
            <div class="table-responsive">

                <table class="table table-striped table-hover display">
                    <thead>


                        <tr>

                            <td>ID Cliente</td>
                            <td>ID Pessoa</td>
                            <td>Email Cliente</td>
                            <td>ID Cadastrante</td>

                        </tr>  
                    </thead>
                    <c:forEach items="${list}" var="cliente">
                        <tr>

                        </tr>    
                    </c:forEach>

                </table>
            </div>
        </div>
        <footer class="mt-auto"><%@include file="footer.jspf" %></footer>
    </body>
</html>
