package br.edu.principal;

import br.edu.figgeoplana.*;
// import br.edu.figgeoespacial.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {

        Byte escolhatip = 0;
        Byte escolhafig = 0;
        Byte escolhacalc = 0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Deseja fazer cálculo de: \n1. Figura Plana\n2. Figura Espacial(falta implementar)");
        escolhatip = sc.nextByte();

        if (escolhatip == 1) {
            MenuPlanas mp = new MenuPlanas();
            mp.FigsPlanas();
        }
    }
}