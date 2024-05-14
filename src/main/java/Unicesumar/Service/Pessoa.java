package Unicesumar.Service;

public class Pessoa {

    private String nome;
    private Number cpf;

    public Pessoa(String nome, Number cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Number getCpf() {
        return cpf;
    }
}
