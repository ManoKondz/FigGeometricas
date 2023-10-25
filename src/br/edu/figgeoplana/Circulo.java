package br.edu.figgeoplana;

public class Circulo {
    private double raio;
    private double area;

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double getArea() {
        return area;
    }

    public void CalcArea1() {
        area = Math.PI * Math.pow(raio, 2);
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTO\n\nraio: %.1f", raio);
    }
}