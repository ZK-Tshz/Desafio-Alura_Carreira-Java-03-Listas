package Control;

public class Cartao {

    private Integer limite;

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public boolean verificarLimite(Integer valor) {
        if (this.limite >= valor) {
            return true;
        } else {
            return false;
        }

    }

}
