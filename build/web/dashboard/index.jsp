<%@page import="dao.ClienteDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
    try {
        String nomePessoa = request.getParameter("nomepessoa");

        /*para realizar pesquisa por nome*/
        if (nomePessoa != null) {
/*faz a busca por nome*/
            List<Cliente> listaClientes = ClienteDAO.listByName(nomePessoa);
            pageContext.setAttribute("clientes", listaClientes);
/*lista todos*/
        } else {
            List<Cliente> listaClientes = ClienteDAO.listClientes();
            pageContext.setAttribute("clientes", listaClientes);

        }

    } catch (Exception e) {
    }


%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body class="d-flex flex-column min-vh-100">

        <header><%@include file="../partials/header.jspf"%></header>
        <section class="container-md">
            <h1>Olá </h1>


            <footer class="mt-auto"><%@include file="../partials/footer.jspf" %></footer>

    </body>
</html>
