package org.Main;

import org.Model.Funcionario.Desenvolvedor;
import org.Model.Funcionario.Estagiario;
import org.Model.Funcionario.Funcionario;
import org.Model.Funcionario.Gerente;

import java.util.ArrayList;

public class MainFuncionario {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ana", "G001", 7000, 2000));
        funcionarios.add(new Desenvolvedor("Carlos", "D002", 5000, 3, "Java"));
        funcionarios.add(new Estagiario("Marina", "E003", 1500));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("Salário: R$" + f.calcularSalario());
            f.realizarTarefa();
            System.out.println("---------------------------");
        }
    }
}

