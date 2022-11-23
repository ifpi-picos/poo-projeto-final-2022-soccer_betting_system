package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Aposta {
    private LocalDate data;
    private Jogo jogos[];
    private Cliente cliente;
    private String resultado;

    public Aposta(LocalDate data, Jogo jogos[], Cliente cliente, String resultado) {
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

    public String getResultado() {
        return resultado;
    }   
}
