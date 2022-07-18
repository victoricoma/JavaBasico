package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    //#region Encapsulamento [Getters e Setters]
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //#endregion
}
