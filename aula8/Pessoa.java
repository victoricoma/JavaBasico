package aula8;

public class Pessoa {
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

    //#region Construtores
    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento){
        super();
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Pessoa(){
        super();
    }
    //#endregion

    //#region Encapsuladores
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    //#endregion

    //#region Notação de String
    @Override
    public String toString() {
        return "Pessoa [numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento + "]";
    }
    //#endregion
}
