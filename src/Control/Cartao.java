package Control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cartao {

    private Double limite;
    private Double saldo;

    public Cartao(Double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public Double getLimite() {
        return limite;
    }

//    public void setLimite(Double limite) {
//        this.limite = limite;
//    }



    public boolean verificarLimite(Double valor) {
        if (this.limite >= valor) {
            return true;
        } else {
            return false;
        }
    }

    List<Compra> itensCompra = new ArrayList<>();

    public void realizarCompra(Compra compra) {
        if (verificarLimite(compra.getValor()) == true) {

            itensCompra.add(compra);
            this.limite = getLimite() - compra.getValor();
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void imprimirCompra() {
        itensCompra.sort(Comparator.comparing(Compra::getValor));
        for (Compra item: itensCompra) {
            System.out.println(item.getDescricao() + " - " + item.getValor());
        }
    }

}
