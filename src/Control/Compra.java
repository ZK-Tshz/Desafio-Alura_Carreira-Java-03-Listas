package Control;

public class Compra {

    public Compra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    private String descricao;
    private Double valor;

    Cartao cartao = new Cartao();

    public String getDescricao() {
        return descricao;
    }

//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }

    public Double getValor() {
        return valor;
    }

//    public void setValor(Double valor) {
//        this.valor = valor;
//    }

}
