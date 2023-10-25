package br.edu.figgeoplana;

import br.edu.principal.*;
import java.util.Scanner;
import java.text.DecimalFormat;



public class MenuPlanas {



    Principal pr = new Principal();

    double escolhafig;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");


    public void FigsPlanas() {


        System.out.println("\nDeseja fazer cálculo da área de um: \n1. Triângulo\n2. Quadrado\n3. Circulo\n4. Trapézio\n5. Paralelogramo\n6. Losango\n7. Retângulo|");
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
            objQuad.CalcArea1();

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
            objRetan.CalcArea1();

            System.out.println("\nA área do retângulo vale: " + df.format(objRetan.getArea()));
        }



    }
}
