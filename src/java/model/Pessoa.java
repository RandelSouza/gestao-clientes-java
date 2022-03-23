package model;

import java.util.Date;

/**
 *
 * @author Ludwig Gonzaga
 */
public class Pessoa {
    
    private int idpessoa;
    private String nomepessoa;
    private String sobrenomepessoa;
    private Date datanascimento;
    private int ddd;
    private String telefone;
    private String genero;
    private String cpf;
    private String identidade;
    private int ddd2;
    private String telefone2;

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNomepessoa() {
        return nomepessoa;
    }

    public void setNomepessoa(String nomepessoa) {
        this.nomepessoa = nomepessoa;
    }

    public String getSobrenomepessoa() {
        return sobrenomepessoa;
    }

    public void setSobrenomepessoa(String sobrenomepessoa) {
        this.sobrenomepessoa = sobrenomepessoa;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public int getDdd2() {
        return ddd2;
    }

    public void setDdd2(int ddd2) {
        this.ddd2 = ddd2;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idpessoa=" + idpessoa + ", nomepessoa=" + nomepessoa + ", sobrenomepessoa=" + sobrenomepessoa + ", datanascimento=" + datanascimento + ", ddd=" + ddd + ", telefone=" + telefone + ", genero=" + genero + ", cpf=" + cpf + ", identidade=" + identidade + ", ddd2=" + ddd2 + ", telefone2=" + telefone2 + '}';
    }
    
                
}
