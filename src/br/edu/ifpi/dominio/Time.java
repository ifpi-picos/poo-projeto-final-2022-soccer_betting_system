package br.edu.ifpi.dominio;

public class Time {
    private String nome;
    private int numeroPontos;
    private int numeroVitorias;
    private int numeroEmpates;
    private int numeroDerrotas;

    public Time(String nome,int numPontos, int numeroVitorias, int numeroEmpates, int numeroDerrotas) {
        this.nome = nome;
        this.numeroPontos = numPontos;
        this.numeroVitorias = numeroVitorias;
        this.numeroEmpates = numeroEmpates;
        this.numeroDerrotas = numeroDerrotas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPontos() {
        return numeroPontos;
    }

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroPontos(int numeroPontos) {
        this.numeroPontos = numeroPontos;
    }

    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }

    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }

    @Override
    public String toString() {
        return "["  
                    + this.nome + ", "
                    + this.numeroPontos + ", "
                    + this.numeroVitorias + ", "
                    + this.numeroDerrotas +               
                "]";
    }
}
