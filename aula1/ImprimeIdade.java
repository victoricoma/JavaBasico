package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 40;
        String nome = "Victor Icoma";
        double altura = 1.88;
        double peso = 132.56;

        double imc = (peso) / (altura * altura);

        System.out.println("Ola: " + nome);
        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " risco de subnutricao.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " isso ai garoto(a)");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " opa pode estar pesado cuidado.");
            } else {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " procure um médico e um nutricionista.");
            }

        } else {
            System.out.println("Novo demais para medicao.");
        }
    }
}