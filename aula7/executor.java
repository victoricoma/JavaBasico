package aula7;

import java.util.Scanner;

public class executor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Delta delta = new Delta();
        EquacaoX x = new EquacaoX();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("------------------------------------------------------");
        System.out.println("Valor de A?");
        delta.setA(entrada.nextDouble());
        delta.validaEq();
        System.out.println("Valor de B?");
        delta.setB(entrada.nextDouble());
        System.out.println("Valor de C?");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();
        System.out.println(" --- Resultados da Equação --- ");
        System.out.println("Delta: " + delta.getDelta());
        delta.validaDelta();
        System.out.println("X|   : " + x.calculaXn(delta));
        System.out.println("X||  : " + x.calculaXp(delta));
    }
}
