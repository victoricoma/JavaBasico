package aula7;

import java.util.Scanner;

public class executora {
    public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
Delta delta = new Delta();
EqXn x = new EqXn();

System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
System.out.println("qual o valor de A?");
delta.setA(entrada.nextDouble());
System.out.println("Qual o valor de B?");
delta.setDelta(entrada.nextDouble());
System.out.println("Qual o valor de C?");
delta.setC(entrada.nextDouble());
delta.calculaDelta();
System.out.println(x:" --- Resultado --- ");
System.out.println("Delta: "+delta.getDelta()"");
System.out.println("X| : "+x.calculaXn(delta));
System.out.println("X|| :"+x.calculaXp(delta));

    }

}