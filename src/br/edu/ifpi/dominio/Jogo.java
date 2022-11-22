package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Jogo {
    private LocalDate data;
    private double valorVitoriaTimeA;
    private double valorVitoriaTimeB;
    private double valorEmpate;

    public Jogo(LocalDate data, double valorVitoriaTimeA, double valorVitoriaTimeB, double valorEmpate){
      this.data = data;
      this.valorVitoriaTimeA = valorVitoriaTimeA;
      this.valorVitoriaTimeB = valorVitoriaTimeB;
      this.valorEmpate = valorEmpate;
    }

    public LocalDate getData(){
        return data;
    }

    public double getValorVitoriaTimeA(){
        return valorVitoriaTimeA;
    }

    public void setValorVitoriaTimeA(double valorVitoriaTimeA){
        this.valorVitoriaTimeA = valorVitoriaTimeA;
    }    
    
    public double getValorVitoriaTimeB(){
        return valorVitoriaTimeB;
    }

    public void setValorVitoriaTimeB(double valorVitoriaTimeB){
        this.valorVitoriaTimeB = valorVitoriaTimeB;
     }

    public double getValorEmpate(){
        return valorEmpate;
    }

    public void setValorEmpate(double valorEmpate){
        this.valorEmpate = valorEmpate;
    }
}
