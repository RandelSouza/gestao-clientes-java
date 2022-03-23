package dao;

/*import necessário*/
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.Pessoa;
import model.PessoaEndereco;

/**
 *
 * @author Ludwig Gonzaga
 */
public class ClienteDAO {

    PreparedStatement pstm;
    ResultSet rst;

    /*inserir cliente*/
 /*listar clientes*/
    public static List<Cliente> listByName(String nomepessoa) {
        Connection connection = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        String sql = "SELECT p.idpessoa,clie.idcliente,e.idendereco,pe.idpessoaendereco ,p.nomepessoa ,p.sobrenomepessoa,p.datanascimento ,e.cidade ,e.unidadefederacao \n"
                + "FROM cliente clie \n"
                + "LEFT JOIN pessoa p \n"
                + "ON p.idpessoa = clie.idpessoa \n"
                + "LEFT JOIN pessoa_endereco pe \n"
                + "ON p.idpessoa = pe.idpessoa \n"
                + "LEFT JOIN endereco e \n"
                + "ON pe.idendereco = e.idendereco \n"
                + "WHERE p.nomepessoa = ?"
                + "ORDER BY p.nomepessoa ASC";

        try {

            PreparedStatement pstm = null;
            ResultSet rst = null;

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, nomepessoa);

            rst = pstm.executeQuery();

            while (rst.next()) {
                Cliente cliente = new Cliente();
                Pessoa pessoa = new Pessoa();
                Endereco endereco = new Endereco();

                pessoa.setNomepessoa(rst.getString("nomepessoa"));
                pessoa.setSobrenomepessoa(rst.getString("sobrenomepessoa"));
                pessoa.setDatanascimento(rst.getDate("datanascimento"));
                cliente.setPessoa(pessoa);

                endereco.setCidade(rst.getString("cidade"));
                endereco.setUnidadefederacao(rst.getString("unidadefederacao"));
                cliente.setEndereco(endereco);

                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            /*Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);*/
        }

        return clientes;
    }

    public static List<Cliente> listClientes() {
        Connection connection = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        String sql = "SELECT p.idpessoa,clie.idcliente,e.idendereco,pe.idpessoaendereco ,p.nomepessoa ,p.sobrenomepessoa,p.datanascimento ,e.cidade ,e.unidadefederacao \n"
                + "    FROM cliente clie \n"
                + "    LEFT JOIN pessoa p \n"
                + "    ON p.idpessoa = clie.idpessoa \n"
                + "    LEFT JOIN pessoa_endereco pe \n"
                + "    ON p.idpessoa = pe.idpessoa \n"
                + "    LEFT JOIN endereco e \n"
                + "    ON pe.idendereco = e.idendereco \n"
                + "    ORDER BY p.nomepessoa ASC";

        try {

            PreparedStatement pstm = null;
            ResultSet rst = null;

            pstm = connection.prepareStatement(sql);

            rst = pstm.executeQuery();

            while (rst.next()) {
                Cliente cliente = new Cliente();
                Pessoa pessoa = new Pessoa();
                Endereco endereco = new Endereco();

                pessoa.setIdpessoa(rst.getInt("idpessoa"));
                pessoa.setNomepessoa(rst.getString("nomepessoa"));
                pessoa.setSobrenomepessoa(rst.getString("sobrenomepessoa"));
                pessoa.setDatanascimento(rst.getDate("datanascimento"));
                cliente.setPessoa(pessoa);

                endereco.setCidade(rst.getString("cidade"));
                endereco.setUnidadefederacao(rst.getString("unidadefederacao"));
                cliente.setEndereco(endereco);

                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            /*Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);*/
        }

        return clientes;
    }

    public static Cliente listById(Integer idpessoa) {
        Connection connection = ConnectionFactory.getConnection();
        Cliente cliente = new Cliente();

        String sql = "SELECT * \n"
                + "FROM cliente clie \n"
                + "LEFT JOIN pessoa p \n"
                + "ON p.idpessoa = clie.idpessoa \n"
                + "LEFT JOIN pessoa_endereco pe \n"
                + "ON p.idpessoa = pe.idpessoa \n"
                + "LEFT JOIN endereco e \n"
                + "ON pe.idendereco = e.idendereco \n"
                + "where p.idpessoa = ?";

        try {

            PreparedStatement pstm = null;
            ResultSet rst = null;

            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, idpessoa);

            rst = pstm.executeQuery();

            if (rst.next()) {
                Pessoa pessoa = new Pessoa();
                Endereco endereco = new Endereco();
                cliente = new Cliente();
                Client client = new Client();

                pessoa.setIdpessoa(rst.getInt("idpessoa"));
                pessoa.setNomepessoa(rst.getString("nomepessoa"));
                pessoa.setSobrenomepessoa(rst.getString("sobrenomepessoa"));
                pessoa.setDatanascimento(rst.getDate("datanascimento"));
                pessoa.setDdd(rst.getInt("ddd"));
                pessoa.setTelefone(rst.getString("telefone"));
                pessoa.setGenero(rst.getString("genero"));
                pessoa.setCpf(rst.getString("cpf"));
                pessoa.setIdentidade(rst.getString("identidade"));
                pessoa.setDdd2(rst.getInt("ddd2"));
                pessoa.setTelefone2(rst.getString("telefone2"));
                cliente.setPessoa(pessoa);

                endereco.setIdendereco(rst.getInt("idendereco"));
                endereco.setTipologradouro(rst.getString("tipologradouro"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setComplemento(rst.getString("complemento"));
                endereco.setBairro(rst.getString("bairro"));
                endereco.setCidade(rst.getString("cidade"));
                endereco.setUnidadefederacao(rst.getString("unidadefederacao"));
                endereco.setCodigopostal(rst.getString("codigopostal"));
                cliente.setEndereco(endereco);

                client.setIdcliente(rst.getInt("idcliente"));
                client.setIdpessoa(rst.getInt("idpessoa"));
                client.setEmailcliente(rst.getString("emailcliente"));
                client.setIdcadastrante(rst.getInt("idcadastrante"));
                cliente.setClient(client);

            }

        } catch (SQLException ex) {
            /*Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);*/
            System.out.println("Erro no SQL");
        }

        return cliente;
    }   

    public static boolean updateCliente(Cliente cliente) {
        Connection connection = ConnectionFactory.getConnection();
        Boolean rstCliente = false;

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            PreparedStatement ps;
            String sql = "UPDATE cliente SET emailcliente=? WHERE idcliente=?";

            ps = connection.prepareStatement(sql);

            ps.setString(1, cliente.getEmailcliente());
            ps.setInt(2, cliente.getIdcliente());

            ps.executeUpdate();

            rstCliente = true;

        } catch (SQLException ex) {
            //Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rstCliente;
    }

}
