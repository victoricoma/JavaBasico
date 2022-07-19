package aula6;

public class app {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();

        System.out.println(q1.getNomeFigura());
        q1.setLado(12);
        System.out.println("Area: "+q1.getArea());
        System.out.println("Perimetro: "+q1.getPerimetro());
    }
}
