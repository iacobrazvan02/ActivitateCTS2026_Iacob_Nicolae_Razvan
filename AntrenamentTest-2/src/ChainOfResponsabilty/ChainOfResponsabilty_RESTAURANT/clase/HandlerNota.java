package ChainOfResponsabilty.ChainOfResponsabilty_RESTAURANT.clase;

public abstract class HandlerNota {
    protected HandlerNota succesor;

    public HandlerNota() {
        this.succesor = null;
    }

    public void setSuccesor(HandlerNota succesor) {
        this.succesor = succesor;
    }

    public abstract String aprobaReducere(double sumaNota);
}