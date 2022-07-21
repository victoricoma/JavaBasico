package aula7;

import java.lang.Math;

public class Delta extends Equacao {
    private double delta;

    // #region Encapsulamento
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    // #endregion

    // #region Regras de negocios
    public void calculaDelta() {
        delta = (Math.pow(super.getB(), 2) - (4 * super.getA() * super.getC()));
    }

    public void validaEq(){
        if(super.getA() == 0){
            System.out.println("Esta nao e um Eq2g: ");
            System.exit(0);
        }
    }

    public void validaDelta(){
        if(delta<=0){
            System.err.println("Deu ruim com delta negativo.");
            System.exit(0);
        }
    }
    //#endregion

}
