package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Aposta {
    private LocalDate data;
    private Jogo[] jogos;
    private Cliente cliente;
    private Time[] resultado;

    public Aposta(LocalDate data, Jogo[] jogos, Cliente cliente, Time[] resultado) {
        this.data = data;
        this.jogos = jogos;
        this.cliente = cliente;
        this.resultado = resultado;
    }

    public LocalDate getData() {
        return data;
    }

    public Jogo[] getJogos() {
        return jogos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Time[] getResultado() {
        return resultado;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setJogos(Jogo[] jogos) {
        this.jogos = jogos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setResultado(Time[] resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "["  
                    + this.data + ", "
                    + this.jogos + ", "
                    + this.cliente + ", "
                    + this.resultado + 
                "]";
    }
}
