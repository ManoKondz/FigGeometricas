package br.edu.figgeoplana;

public class Losango {


    private double diagonalMaior;
    private double diagonalMenor;
    private double area;

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        if (diagonalMaior > 0) {
            this.diagonalMaior = diagonalMaior;
        }
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        if (diagonalMaior > 0) {
            this.diagonalMenor = diagonalMenor;
        }
    }

    public double getArea() {
        return area;
    }


    public void CalcArea() {
        area = diagonalMaior * diagonalMenor/2;
    }

    public void listaAtributos() {
        System.out.printf("\nATRIBUTOS \n\ndiagonal maior: %.1f \ndiagonal menor: %.1f", getDiagonalMaior(), getDiagonalMenor());

    }
}