package ChainOfResponsabilty.ChainOfResponsabilty_SPITAL.clase;

public abstract class HandlerPacient {
    protected HandlerPacient succesor;

    public HandlerPacient() {
        this.succesor = null;
    }

    public void setSuccesor(HandlerPacient succesor) {
        this.succesor = succesor;
    }

    public abstract String trateazaPacient(int gradGravitate);
}