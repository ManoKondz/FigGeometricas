package br.edu.figgeoplana;

public class Triangulo {

    private double base;
    private double altura;
    private double area;


    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getArea() {
        return area;
    }


    public void calcArea() {
        area = (base * altura)/2;
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTOS \n\nBase: %.1f\n Altura%.1f ", base, altura);

    }
}