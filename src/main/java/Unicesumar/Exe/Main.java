package Unicesumar.Exe;

import Unicesumar.Domain.AlunoFactory;
import Unicesumar.Domain.CursoObserver;
import Unicesumar.Domain.PessoaFactory;
import Unicesumar.Service.Aluno;
import Unicesumar.Domain.AlunoVerificarCurso;
import Unicesumar.Service.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Estrutural
        Aluno aluno = new Aluno("João", 123456789, "Ciência da Computação", 101);
        Aluno alunoComAtividades = new AlunoVerificarCurso(aluno, "Futebol, Xadrez");
        System.out.println("Aluno: " + alunoComAtividades.getNome());
        System.out.println(" ");
        System.out.println("Curso: " + alunoComAtividades.getCurso());
        System.out.println(" ");

        //Criacional
        PessoaFactory alunoFactory = new AlunoFactory();

        Pessoa aluno1 = alunoFactory.createPessoa("João", 123456789, "Ciência da Computação", "101");
        Pessoa aluno2 = alunoFactory.createPessoa("Maria", 987654321, "Engenharia Civil", "202");

        System.out.println("Aluno 1: " + aluno1.getNome() + ", Curso: " + ((Aluno) aluno1).getCurso() + ", Sala: " + ((Aluno) aluno1).getSala());
        System.out.println("Aluno 2: " + aluno2.getNome() + ", Curso: " + ((Aluno) aluno2).getCurso() + ", Sala: " + ((Aluno) aluno2).getSala());
        System.out.println(" ");

        //Comportamental
        Aluno aluno3 = new Aluno("João", 123456789, "Ciência da Computação", 101);
        CursoObserver observer1 = new CursoObserver("Administração");


        aluno3.addObserver(observer1);

        System.out.println("Aluno: " + aluno3.getNome());
        System.out.println("Curso: " + aluno3.getCurso());
        System.out.println(" ");

        aluno3.setCurso("Engenharia de Software");

        System.out.println("Novo Curso: " + aluno3.getCurso());
    }

}