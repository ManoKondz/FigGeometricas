package br.edu.figgeoplana;


public class Retangulo {

    private double base;
    private double altura;
    private double area;

    public void CalcArea1() {
        area = base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getArea() {
        return area;
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTOS \n\nbase: %.1f\naltura: %.1f ", getBase(), getAltura());
    }

}