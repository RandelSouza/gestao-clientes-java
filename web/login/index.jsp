<%-- 
    Document   : index
    Created on : 04/03/2022, 21:48:56
    Author     : Ludwig Gonzaga
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dao.ConnectionFactory" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="StyleSheet" type="text/css" href="../_css/bootstrap.css" />
        <link href="../_css/style.css" rel="stylesheet" />
        <script src="../_js/bootstrap.js"></script>
        <title>Gestão de Clientes</title>
    </head>

    <body>

        <div class="container" style="margin-top: 200px;">
            <h1>Bem vindo!</h1>

            <form id="formlogin" action="../auth" method="POST" class="form-control card">

                <div class="row mb-3">
                    <label for="emailfuncionario" class="form-label col-sm-2 col-form-label">Insira seu e-mail</label>
                    <input type="email" name="emailfuncionario" id="emailfuncionario" placeholder="mail@mail.com.br">
                </div>
                <div class="row mb-3">
                    <label for="senhafuncionario" class="form-label col-sm-2 col-form-label">Insira sua senha</label>
                    <input type="password" name="senhafuncionario" id="senhafuncionario" placeholder="Insira sua senha">
                </div>

                <input type="submit" id="btnAcessar" name="btnAcessar" class="btn alert-dark alert-link" value="Acessar">
            </form>
            <p class="text-center text-danger">

        </div>
    </body>
</html>
