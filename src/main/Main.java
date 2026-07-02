package main;

import Control.Cartao;
import Control.Compra;

import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner leitor = new Scanner(System.in);
        Cartao cartao = new Cartao();


        System.out.println("Digite o limite do cartão: ");
        Integer limite = leitor.nextInt();
        cartao.setLimite(limite);

        System.out.println("Digite a descricao da compra: ");
        String descricao = leitor.nextLine();
        //compra.setDescricao(descricao);

        System.out.println("Digite o valor da compra: ");
        Integer valor = leitor.nextInt();
        //compra.setValor(valor);

        Compra compra = new Compra(descricao, valor);

    }
}
