package br.edu.figgeoplana;
public class Trapezio {

    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double area;

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        if (baseMaior > 0) {
            this.baseMaior = baseMaior;
        }
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        if (baseMenor > 0) {
            this.baseMenor = baseMenor;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void CalcArea() {
        area = (baseMenor + baseMaior) * altura/2;
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTOS \n\nbase maior: \nbase menor: \naltura: ", getBaseMaior(), getBaseMenor(), getAltura());
    }
}