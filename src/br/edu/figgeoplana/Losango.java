package br.edu.figgeoplana;

public class Losango {


    private double diagMaior;
    private double diagMenor;
    private double area;

    public double getDiagMaior() {
        return diagMaior;
    }

    public void setDiagMaior(double diagMaior) {
        if (diagMaior > 0) {
            this.diagMaior = diagMaior;
        }
    }

    public double getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor) {
        if (diagMaior > 0) {
            this.diagMenor = diagMenor;
        }
    }

    public double getArea() {
        return area;
    }


    public void CalcArea() {
        area = diagMaior * diagMenor/2;
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTOS \n\ndiagonal maior: %.1f \ndiagonal menor: %.1f", getDiagMaior(), getDiagMenor());
    }
}