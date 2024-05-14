package Unicesumar.Domain;

import Unicesumar.Interface.Observer;
import Unicesumar.Service.Aluno;

public class CursoObserver implements Observer {

    private String nome;

    public CursoObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Aluno aluno) {
        System.out.println(nome + ": O aluno " + aluno.getNome() + " mudou de curso para: " + aluno.getCurso());
    }
}