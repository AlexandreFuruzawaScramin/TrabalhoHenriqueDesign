package Unicesumar.Domain;

import Unicesumar.Service.Aluno;
import Unicesumar.Service.Pessoa;

public class AlunoFactory extends PessoaFactory {

    @Override
    public Pessoa createPessoa(String nome, Number cpf, String... args) {
        String curso = args.length > 0 ? args[0] : "Indefinido";
        Number sala = args.length > 1 ? Integer.valueOf(args[1]) : 0;
        return new Aluno(nome, cpf, curso, sala);
    }
}
