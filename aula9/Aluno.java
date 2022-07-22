package aula9;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;


    //#region Construtores e Encapsuladores
    public Aluno(String nome, String email, double salario, String cpf) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
    }
    
    public Aluno() {
        super();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }
    //#endregion

    //#region Regras de Negocios
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        setNome(valorSeparado[0]);
        setEmail(valorSeparado[1]);
        setSalario(Double.parseDouble(valorSeparado[2]));
        setCpf(valorSeparado[3]);
    }

    public void separaCpf(){
        String cpf = getCpf();
        String[] cpfSep = cpf.split("-");
        System.out.println(cpfSep[0]);
        System.out.println(cpfSep[1]);

        String campos = cpfSep[0];
        String troca = campos.replace(".", ";");
        System.out.println(troca);
        String[] camposSep = troca.split(";");
        int c1 = Integer.parseInt(camposSep[0]);
        int c2 = Integer.parseInt(camposSep[1]);
        int c3 = Integer.parseInt(camposSep[2]);
        int d1 = Integer.parseInt(cpfSep[1]);

        System.out.println("Inteiro c1: "+c1+", Inteiro c2: "+c2+", Inteiro c3: "+c3+", Inteiro d1: "+d1);
        System.out.println("Calculo CPF: "+(c1+c2+c3) % d1);
        
    }
    //#endregion
}
