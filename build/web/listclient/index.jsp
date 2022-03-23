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
            <table class="table table-hover text-nowrap">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Sobrenome</th>
                        <th>Data de Nascimento</th>
                        <th>Cidade</th>
                        <th>Estado</th>
                        <th style="width:15%"></th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${clientes}" var="cliente">
                    <tr>
                    <td><c:out value="${cliente.pessoa.nomepessoa}" /></td>
                    <td><c:out value="${cliente.pessoa.sobrenomepessoa}" /></td>
                    <td><c:out value="${cliente.pessoa.datanascimento}" /></td>
                    <td><c:out value="${cliente.endereco.cidade}" /></td>
                    <td><c:out value="${cliente.endereco.unidadefederacao}" /></td>
                    <td>
                        <a href="../read/index.jsp?idpessoa=<c:out value="${cliente.pessoa.idpessoa}"/>    " class="btn btn-block btn-primary btn-sm">Consultar</a
                        >
                    </td>
                    </tr>
                </c:forEach>         
                </tbody>
            </table>


            <footer class="mt-auto"><%@include file="../partials/footer.jspf" %></footer>

    </body>
</html>
