package org.Model.forma;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo de raio " + raio);
    }
}

