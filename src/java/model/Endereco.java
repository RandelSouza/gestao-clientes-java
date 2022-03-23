package model;

/**
 *
 * @author Ludwig Gonzaga
 */
public class Endereco {

    private int idendereco;
    private String tipologradouro;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String unidadefederacao;
    private String codigopostal;

    public int getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public String getTipologradouro() {
        return tipologradouro;
    }

    public void setTipologradouro(String tipologradouro) {
        this.tipologradouro = tipologradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUnidadefederacao() {
        return unidadefederacao;
    }

    public void setUnidadefederacao(String unidadefederacao) {
        this.unidadefederacao = unidadefederacao;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    @Override
    public String toString() {
        return "Endereco{" + "idendereco=" + idendereco + ", tipologradouro=" + tipologradouro + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", unidadefederacao=" + unidadefederacao + ", codigopostal=" + codigopostal + '}';
    }            
    
}
