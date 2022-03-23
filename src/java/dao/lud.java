/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Cliente;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 *
 * @author Ludwig Gonzaga
 */
public class lud {

    public static void main(String[] args) {
        /*List<Cliente> clientes = ClienteDAO.listClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getPessoa().getNomepessoa());
        }*/
Cliente cliente = ClienteDAO.listById(39);
        System.out.println(cliente.getClient().getEmailcliente());



    }

}
