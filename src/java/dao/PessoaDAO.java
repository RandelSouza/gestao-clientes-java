package dao;

/**
 *
 * @author Ludwig Gonzaga
 */
/*import necessário*/
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.Pessoa;
import model.PessoaEndereco;

/**
 *
 * @author Ludwig Gonzaga
 */
public class PessoaDAO {

    public static boolean updatePessoa(Pessoa pessoa) {
        System.out.println("Update Pessoa \n");
        System.out.println(pessoa);
        
        Connection connection = ConnectionFactory.getConnection();
        Boolean rstUpPessoa = false;

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            PreparedStatement ps;
            String sql = "UPDATE pessoa SET nomepessoa=?,"
                                 + " sobrenomepessoa=?,"
                                 + " datanascimento=?,"
                                 + " ddd=?, telefone=?,"
                                 + "genero=?, cpf=?,"
                                 + "identidade=?, ddd2=?,"
                                 + " telefone2=? "
                         + "WHERE idpessoa=?;";


            ps = connection.prepareStatement(sql);

            ps.setString(1, pessoa.getNomepessoa());
            ps.setString(2, pessoa.getSobrenomepessoa());
            ps.setDate  (3, new java.sql.Date(pessoa.getDatanascimento().getTime()));
            ps.setInt(4, pessoa.getDdd());
            ps.setString(5, pessoa.getTelefone());
            ps.setString(6, pessoa.getGenero());
            ps.setString(7, pessoa.getCpf());
            ps.setString(8, pessoa.getIdentidade());
            ps.setInt(9, pessoa.getDdd2());
            ps.setString(10, pessoa.getTelefone2());
            ps.setInt(11, pessoa.getIdpessoa());

            ps.executeUpdate();

            rstUpPessoa = true;

        } catch (SQLException ex) {
            //Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rstUpPessoa;
    }

}
