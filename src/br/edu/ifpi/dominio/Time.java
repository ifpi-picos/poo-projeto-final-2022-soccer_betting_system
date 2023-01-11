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
    
    public void contNumeroPontos(int numeroPontos) {
        this.numeroPontos = numeroPontos + 3;
    }
    
    public void contNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias + 1;
        contNumeroPontos(numeroVitorias);
    }

    public void contNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates + 1;
        contNumeroPontos(numeroEmpates - 2);
    }
    
    public void contNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas + 1;
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
