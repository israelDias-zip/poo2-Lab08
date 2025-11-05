package org.Model.Funcionario;

public abstract class Funcionario {
    public String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularSalario();
    public abstract void realizarTarefa();
}

