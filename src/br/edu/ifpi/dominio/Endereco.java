package br.edu.ifpi.dominio;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String rua, int numero, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "["  
                    + this.rua + ", "
                    + this.numero + ", "
                    + this.bairro + ", "
                    + this.cidade + ", "
                    + this.uf + 
                "]";
    }
}
