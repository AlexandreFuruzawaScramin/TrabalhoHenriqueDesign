package Unicesumar.Service;

import Unicesumar.Interface.Observer;
import Unicesumar.Interface.Subject;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Subject {

    private String curso;
    private Number sala;
    private List<Observer> observers = new ArrayList<>();

    public Aluno(String nome, Number cpf, String curso, Number sala) {
        super(nome, cpf);
        this.curso = curso;
        this.sala = sala;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
        notifyObservers();
    }

    public Number getSala() {
        return sala;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}