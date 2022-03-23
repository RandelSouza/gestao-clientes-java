<%@page import="dao.ClienteDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    try {
        Integer idPessoa = Integer.parseInt(request.getParameter("idpessoa"));

        /*para realizar pesquisa por nome*/
        if (idPessoa != null) {
            Cliente cliente = ClienteDAO.listById(idPessoa);
            pageContext.setAttribute("cliente", cliente);
            /*lista todos*/
        } else {
            /*response.sendRedirect("../read");*/

        }

    } catch (Exception e) {
    }


%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../_css/bootstrap.css" rel="stylesheet" />
        <link href="../_css/style.css" rel="stylesheet" />
        <script src="../_js/bootstrap.js"></script>
    </head>
    <body class="d-flex flex-column min-vh-100">
        <header>
            <%@include file="../partials/header.jspf"%>
        </header>
        <section class="container-md" style="margin-top: 3%;">
            <div style="content">
                <div class="card card-primary card-outline">
                    <div class="card-header">
                        <h3 class="card-title card-title" style="text-align: center;">Dados do cliente para Cadastro</h3>
                    </div>
                    <form method="POST" action="upclient.jsp" id="new-client">
                        <div class="card-body">
                            <%@include file="../partials/create/dadospessoais.jspf" %>
                            <hr class="mb-4 mt-4">
                            <%@include file="../partials/create/endereco.jspf" %>
                            <hr class="mb-4 mt-4">
                            <%@include file="../partials/create/contatos.jspf" %>
                            <hr class="mb-4 mt-4">
                            <div class="row float-right">
                                <div class="col-12 mb-4">
                                    <button type="submit" class="btn btn-success">Cadastrar</button>    
                                </div>
                            </div>

                        </div>

                    </form>
                </div> 
            </div>
        </section>


        <footer class="mt-auto"><%@include file="../partials/footer.jspf" %></footer>

    </body>
</html>
