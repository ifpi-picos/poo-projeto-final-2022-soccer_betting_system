package br.edu.ifpi.dominio;

public class Time {
    private String nome;
    private String serie;
    private int numPontos;
    private int numVitorias;
    private int numDerrotas;

    public Time(String nome, String serie, int numPontos, int numVitorias, int numDerrotas) {
        this.nome = nome;
        this.numPontos = numPontos;
        this.numVitorias = numVitorias;
        this.numDerrotas = numDerrotas;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    public int getNumPontos() {
        return numPontos;
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public int getNumDerrotas() {
        return numDerrotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }

    public void setNumDerrotas(int numDerrotas) {
        this.numDerrotas = numDerrotas;
    } 
}
