package Unicesumar.Domain;

import Unicesumar.Service.Pessoa;

public abstract class PessoaFactory {
    public abstract Pessoa createPessoa(String nome, Number cpf, String... args);
}
