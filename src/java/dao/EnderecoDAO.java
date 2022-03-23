package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Endereco;

public class EnderecoDAO {

    public static boolean updateEndereco(Endereco endereco) {
        Connection connection = ConnectionFactory.getConnection();
        Boolean rstUpEndereco = false;

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            PreparedStatement ps;
            String sql = "UPDATE endereco\n"
                    + "SET tipologradouro=?,"
                    + " logradouro=?,"
                    + " complemento=?,"
                    + " bairro=?,"
                    + " cidade=?,"
                    + " unidadefederacao=?,"
                    + " codigopostal=?\n"
                    + "WHERE idendereco=?;";

            ps = connection.prepareStatement(sql);

            //ps.setInt(1, endereco.getIdendereco());
            //ps.setString(2, endereco.getTipoLogradouro());
            ps.setString(1, endereco.getTipologradouro());
            ps.setString(2, endereco.getLogradouro());
            ps.setString(3, endereco.getComplemento());
            ps.setString(4, endereco.getBairro());
            ps.setString(5, endereco.getCidade());
            ps.setString(6, endereco.getUnidadefederacao());
            ps.setString(7, endereco.getCodigopostal());
            ps.setInt(8, endereco.getIdendereco());

            ps.executeUpdate();

            rstUpEndereco = true;

        } catch (SQLException ex) {
            //Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rstUpEndereco;
    }

}