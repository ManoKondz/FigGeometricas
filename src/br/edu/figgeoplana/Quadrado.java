package br.edu.figgeoplana;


public class Quadrado {

    private double lado;

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public double getArea() {
        return area;
    }

    private double area;

    public void CalcArea1() {
        area = Math.pow(lado, 2);
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTO\n\nlado: %.1f ", lado);
    }

}