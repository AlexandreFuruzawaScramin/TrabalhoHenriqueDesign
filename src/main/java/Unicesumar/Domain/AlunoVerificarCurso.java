package Unicesumar.Domain;

import Unicesumar.Service.Aluno;

public class AlunoVerificarCurso extends AlunoEstrutural {

    private String atividades;

    public AlunoVerificarCurso(Aluno aluno, String atividades) {
        super(aluno);
        this.atividades = atividades;
    }

    public String getAtividades() {
        return atividades;
    }

    @Override
    public String getCurso() {
        return aluno.getCurso() + ", Participa de: " + atividades;
    }
}