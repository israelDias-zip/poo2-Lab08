package org.Main;

import org.Model.forma.Circulo;
import org.Model.forma.Forma;
import org.Model.forma.Quadrado;
import org.Model.forma.Triangulo;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));
        formas.add(new Triangulo(6, 3));

        for (Forma f : formas) {
            f.desenhar();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("---------------------------");
        }
    }
}

