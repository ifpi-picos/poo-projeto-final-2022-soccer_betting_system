package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(String nome, String email, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "["  
                    + this.nome + ", "
                    + this.email + ", "
                    + this.dataNascimento + ", "
                    + this.endereco + 
                "]";
    }
}
