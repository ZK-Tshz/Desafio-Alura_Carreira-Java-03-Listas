package Control;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    public Compra(String descricao, Integer valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    private String descricao;
    private Integer valor;

    Cartao cartao = new Cartao();

    public String getDescricao() {
        return descricao;
    }

//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }

    public Integer getValor() {
        return valor;
    }

//    public void setValor(Integer valor) {
//        this.valor = valor;
//    }

    List<Compra> itensCompra = new ArrayList<>();

    public void realizarCompra(Compra item) {
        if (cartao.verificarLimite(getValor()) == true) {

            item = getDescricao();
            itensCompra.add(item);
        }
    }

    public void debitarValor() {
        cartao.setLimite(cartao.getLimite() - getValor());
    }
}
