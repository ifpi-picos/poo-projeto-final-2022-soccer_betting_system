package br.edu.ifpi.dominio;
import java.time.LocalDateTime;

public class Jogo {
    private Time timeA;
    private Time timeB;
    private LocalDateTime dataHora;
    private double valorVitoriaTimeA;
    private double valorVitoriaTimeB;
    private double valorEmpate;

    public Jogo(LocalDateTime dataHora, double valorVitoriaTimeA, double valorVitoriaTimeB, double valorEmpate){
      this.dataHora = dataHora;
      this.valorVitoriaTimeA = valorVitoriaTimeA;
      this.valorVitoriaTimeB = valorVitoriaTimeB;
      this.valorEmpate = valorEmpate;
    }

    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValorVitoriaTimeA() {
        return valorVitoriaTimeA;
    }

    public void setValorVitoriaTimeA(double valorVitoriaTimeA) {
        this.valorVitoriaTimeA = valorVitoriaTimeA;
    }    
    
    public double getValorVitoriaTimeB() {
        return valorVitoriaTimeB;
    }

    public void setValorVitoriaTimeB(double valorVitoriaTimeB) {
        this.valorVitoriaTimeB = valorVitoriaTimeB;
    }

    public double getValorEmpate() {
        return valorEmpate;
    }

    public void setValorEmpate(double valorEmpate) {
        this.valorEmpate = valorEmpate;
    }

    @Override
    public String toString() {
        return "["  
                    + this.timeA + ", "
                    + this.timeB + ", "
                    + this.dataHora + ", "
                    + this.valorVitoriaTimeA + ", "
                    + this.valorVitoriaTimeB + ", "
                    + this.valorEmpate +                  
                "]";
    }
}
