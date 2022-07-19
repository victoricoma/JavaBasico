package aula6;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();

        System.out.println("----- --------- ---------");
        System.out.println(q1.getNomeFigura());
        System.out.println("Informe o lado da figura: ");
        q1.setLado(entrada.nextInt());
        System.out.println("Area: "+q1.getArea());
        System.out.println("Perimetro: "+q1.getPerimetro());

        System.out.println("----- --------- ---------");
        System.out.println(t1.getNomeFigura());
        System.out.println("Altura: ");
        t1.setAltura(entrada.nextInt());
        System.out.println("Base: ");
        t1.setBase(entrada.nextInt());
        System.out.println("Lado A: ");
        t1.setLadoA(entrada.nextInt());
        System.out.println("Lado B: ");
        t1.setLadoB(entrada.nextInt());
        System.out.println("Lado C: ");
        t1.setLadoC(entrada.nextInt());
        
        System.out.println("Area: "+t1.getArea());
        System.out.println("Perimetro: "+t1.getPerimetro());
    }
}
