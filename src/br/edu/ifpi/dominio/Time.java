package br.edu.ifpi.dominio;

public class Time {
    private String nome;
    private String serie;
    private int numeroVitorias;
    private int numeroDerrotas;

    public Time(String nome, String serie, int numPontos, int numeroVitorias, int numeroDerrotas) {
        this.nome = nome;
        this.serie = serie;
        this.numeroVitorias = numeroVitorias;
        this.numeroDerrotas = numeroDerrotas;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void contNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias + 1;
    }

    public void contNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas + 1;
    } 
}
