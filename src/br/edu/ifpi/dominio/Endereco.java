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
}
