package br.edu.figgeoplana;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MenuPlanas {

    double escolhafig;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");


    public void FigsPlanas() {


        System.out.println("\nDeseja fazer cálculo da área de um: \n1. Triângulo\n2. Quadrado\n3. Retângulo\n4. Paralelogramo\n5. Losango\n6. Trapézio\n7. Círculo|");
        escolhafig = sc.nextByte();

        if (escolhafig == 1) {
            Triangulo objTrian = new Triangulo();

            System.out.print("\nDigite a medida da base: ");
            double x = sc.nextDouble();
            objTrian.setBase(x);

            System.out.print("\nDigite a medida da altura: ");
            x = sc.nextDouble();
            objTrian.setAltura(x);

            objTrian.listaAtributos();
            objTrian.calcArea();

            System.out.printf("\nA área do triângulo vale: %.1f ", objTrian.getArea());
        }

        if (escolhafig == 2) {
            Quadrado objQuad = new Quadrado();

            System.out.print("\nDigite a medida do lado: ");
            double x = sc.nextDouble();
            objQuad.setLado(x);

            objQuad.listaAtributos();
            objQuad.CalcArea();

            System.out.printf("\nA área do quadrado vale: %.1f ", objQuad.getArea());
        }

        if (escolhafig == 3) {
            Retangulo objRetan = new Retangulo();

            System.out.print("\nDigite a medida da base: ");
            double x = sc.nextDouble();
            objRetan.setBase(x);

            System.out.print("\nDigite a medida da altura: ");
            x = sc.nextDouble();
            objRetan.setAltura(x);

            objRetan.listaAtributos();
            objRetan.CalcArea();

            System.out.printf("\nA área do retângulo vale: %.1f", objRetan.getArea());
        }

        if (escolhafig == 4) {
            Paralelogramo objParalel = new Paralelogramo();

            System.out.print("\nDigite a medida da base: ");
            double x = sc.nextDouble();
            objParalel.setBase(x);

            System.out.print("\nDigite a medida da altura: ");
            x = sc.nextDouble();
            objParalel.setAltura(x);

            objParalel.listaAtributos();
            objParalel.CalcArea();

            System.out.printf("\nA área do paralelogramo vale: %.1f", objParalel.getArea());
        }

        if (escolhafig == 5) {
            Losango objLosan = new Losango();

            System.out.print("\nDigite a medida da diagonal maior: ");
            double x = sc.nextDouble();
            objLosan.setDiagonalMaior(x);

            System.out.print("\nDigite a medida da diagonal menor: ");
            x = sc.nextDouble();
            objLosan.setDiagonalMenor(x);

            objLosan.listaAtributos();
            objLosan.CalcArea();

            System.out.printf("\nA área do losango vale: %.1f", objLosan.getArea());
        }

        if (escolhafig == 6) {
            Trapezio objTrap = new Trapezio();

            System.out.print("\nDigite a medida da base menor: ");
            double x = sc.nextDouble();
            objTrap.setBaseMenor(x);

            System.out.print("\nDigite a medida da base maior: ");
            x = sc.nextDouble();
            objTrap.setBaseMaior(x);

            System.out.print("\nDigite a medida da altura: ");
            x = sc.nextDouble();
            objTrap.setAltura(x);

            objTrap.listaAtributos();
            objTrap.CalcArea();

            System.out.printf("\nA área do trapézio vale: %.1f", objTrap.getArea());
        }

        if (escolhafig == 7) {
            Circulo objCirc = new Circulo();

            System.out.print("\nDigite a medida do raio: ");
            double x = sc.nextDouble();
            objCirc.setRaio(x);

            objCirc.listaAtributos();
            objCirc.CalcArea1();

            System.out.printf("\nA área do círculo vale: %.1f", objCirc.getArea());
        }
    }
}


