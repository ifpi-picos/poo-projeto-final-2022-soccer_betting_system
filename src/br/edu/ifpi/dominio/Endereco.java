package br.edu.ifpi.dominio;

public class Endereco {
    private String rua;
    private int num;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String rua, int num, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public int getNum() {
        return num;
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
