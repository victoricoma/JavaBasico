package aula4;

import java.lang.Math;

public class Carro {
    //#region Atributos
    String marca;
    String modelo;

    int numPassageiro;
    double capCombustivel;
    double consCombustivel;
    //#endregion

    //#region Regras de Negócios da Classe (Métodos)
    public double calculaAutonomia(){
        return Math.round((this.capCombustivel * this.consCombustivel));
    }

    public double verificarEcoDesempenho(){
        double eco = this.calculaAutonomia()/this.numPassageiro;
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice){
        if(this.verificarEcoDesempenho()>indice){
            return true;
        }else{
            return false;
        }
    }
    //#endregion
}
