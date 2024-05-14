package Unicesumar.Domain;

import Unicesumar.Service.Aluno;

public abstract class AlunoEstrutural extends Aluno {

    protected Aluno aluno;

    public AlunoEstrutural(Aluno aluno) {
        super(aluno.getNome(), aluno.getCpf(), aluno.getCurso(), aluno.getSala());
        this.aluno = aluno;
    }

    @Override
    public String getNome() {
        return aluno.getNome();
    }

    @Override
    public Number getCpf() {
        return aluno.getCpf();
    }

    @Override
    public String getCurso() {
        return aluno.getCurso();
    }

    @Override
    public Number getSala() {
        return aluno.getSala();
    }
}