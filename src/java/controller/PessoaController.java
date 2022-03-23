/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import dao.EnderecoDAO;
import dao.PessoaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Endereco;
import model.Pessoa;
import model.PessoaEndereco;

/**
 *
 * @author randel
 */
@WebServlet(name = "PessoaController", urlPatterns = {"/PessoaController"})
public class PessoaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           Pessoa pessoa = new Pessoa();
           pessoa.setIdpessoa(Integer.parseInt(request.getParameter("idpessoa")));
           pessoa.setNomepessoa(request.getParameter("nomepessoa"));
           pessoa.setSobrenomepessoa(request.getParameter("sobrenomepessoa"));
           pessoa.setGenero(request.getParameter("genero"));
           
           String dataNascimento = request.getParameter("datanascimento");
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           pessoa.setDatanascimento(dateFormat.parse(dataNascimento));
           
           pessoa.setIdentidade(request.getParameter("identidade"));
           pessoa.setCpf(request.getParameter("cpf"));
           pessoa.setTelefone(request.getParameter("telefone"));
           pessoa.setDdd(Integer.parseInt(request.getParameter("ddd")));
           pessoa.setTelefone2(request.getParameter("telefone2"));
           pessoa.setDdd2(Integer.parseInt(request.getParameter("ddd2")));
           System.out.println(pessoa);
                      
          /*========================================================================*/ 
          
           Cliente cliente = new Cliente();
           cliente.setIdcliente(Integer.parseInt(request.getParameter("idcliente")));
           cliente.setEmailcliente(request.getParameter("emailcliente"));
           System.out.println(cliente);
           
          /*========================================================================*/ 
          
           Endereco endereco = new Endereco();
           endereco.setIdendereco(Integer.parseInt(request.getParameter("idendereco")));
           endereco.setTipologradouro(request.getParameter("tipologradouro"));
           endereco.setLogradouro(request.getParameter("logradouro"));
           endereco.setComplemento(request.getParameter("complemento"));
           endereco.setCodigopostal(request.getParameter("cep"));
           endereco.setBairro(request.getParameter("bairro"));
           endereco.setCidade(request.getParameter("cidade"));
           endereco.setUnidadefederacao(request.getParameter("unidadefederacao"));
           System.out.println(endereco);
           
          /*========================================================================*/ 
          
           //PessoaEndereco pessoaEndereco = new PessoaEndereco();
           //pessoaEndereco.setIdendereco(Integer.parseInt(request.getParameter("idpessoaendereco")));
        
          /*================PERSINTÊNCIA DOS DADOS (UPDATE) =====================================*/ 
           PessoaDAO.updatePessoa(pessoa);
           ClienteDAO.updateCliente(cliente);
           EnderecoDAO.updateEndereco(endereco);
           // Caso precise atualizar o idpessoaendereco chamar o DAO responsável
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
