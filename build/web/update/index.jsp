<%@page import="dao.ClienteDAO"%>
<%@page import="model.Cliente"%>
<%@page import="model.Cliente"%>
<%@page import="model.*"%>
<%
    try {
        Integer idPessoa = Integer.parseInt(request.getParameter("idpessoa"));

        /*para realizar pesquisa por nome*/
        if (idPessoa != null) {
            Cliente cliente = ClienteDAO.listById(idPessoa);
            pageContext.setAttribute("cliente", cliente);
            /*lista todos*/
        } else {
            response.sendRedirect("../read");

        }

    } catch (Exception e) {
    }


%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body class="d-flex flex-column min-vh-100">
        <header><%@include file="../partials/header.jspf"%></header>      
        <div class="container-md" style="margin-top: 15px;">

            <div class="container row-cols-auto">

                <div class="card card-primary card-outline ">

                    <div class="card-header list-group-item-dark">
                        <h3 class="card-title" style="text-align: center;">Atualização de dados para Cliente ${cliente.pessoa.nomepessoa} ${cliente.pessoa.sobrenomepessoa} </h3>
                    </div>

                    <form id="update" name="update" action="/clientjava/PessoaController" method="POST">
                        <div class="card-body">
                            <input type="text" name="idpessoa" value="${cliente.pessoa.idpessoa}" hidden>
                            <input type="text" name="idcliente" value="${cliente.client.idcliente}" hidden>
                            <input type="text" name="idendereco" value="${cliente.endereco.idendereco}" hidden>
                            <input type="text" name="idpessoaendereco" value="${cliente.pessoaendereco.idpessoaendereco}" hidden>
                            <%@include file="../partials/update/dados.jspf" %>
                            <hr class="mb-4 mt-4" name="enderecos">
                            <%@include file="../partials/update/endereco.jspf" %>
                            <hr class="mb-4 mt-4">
                            <%@include file="../partials/update/contatos.jspf" %>
                        </div>

                        <div class="row row-cols-auto align-content-center align-items-center" style="margin: 15px auto auto 20px;">
                            <div class="col-6 mb-4 ml-6 align-items-center">
                                <input type="submit" class="btn alert-success alert-link" value="Salvar">
                            </div>
                            <div class="col-6 mb-4 ml-6 align-items-center">
                                <a href="../update/index.jsp?idpessoa=<c:out value="${cliente.pessoa.idpessoa}"/>" class="btn alert-danger alert-link" role="danger">Excluir</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <footer class="mt-auto"><%@include file="../partials/footer.jspf" %></footer>

    </body>
</html>

