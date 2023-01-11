package br.edu.ifpi.dominio;
import java.time.LocalDateTime;

public class Jogo {
    private Time timeA;
    private Time timeB;
    private LocalDateTime dataHora;
    private double valorVitoriaTimeA;
    private double valorVitoriaTimeB;
    private double valorEmpate;

    public Jogo(Time timeA, Time timeB, LocalDateTime dataHora, double valorVitoriaTimeA, double valorVitoriaTimeB, double valorEmpate){
      this.timeA = timeA;
      this.timeB = timeB;
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

    public double getValorVitoriaTimeB() {
        return valorVitoriaTimeB;
    }

    public double getValorEmpate() {
        return valorEmpate;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setValorVitoriaTimeA(double valorVitoriaTimeA) {
        this.valorVitoriaTimeA = valorVitoriaTimeA;
    }    
    

    public void setValorVitoriaTimeB(double valorVitoriaTimeB) {
        this.valorVitoriaTimeB = valorVitoriaTimeB;
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
