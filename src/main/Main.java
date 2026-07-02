package main;

import Control.Cartao;
import Control.Compra;

import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        Double limite = leitor.nextDouble();
        leitor.nextLine();
        Cartao cartao = new Cartao(limite);

        Integer opcao = 1;
        while (opcao != 0) {

            System.out.println("Digite a descricao da compra: ");
            String descricao = leitor.nextLine();
            //compra.setDescricao(descricao);

            System.out.println("Digite o valor da compra: ");
            Double valor = leitor.nextDouble();
            //compra.setValor(valor);

            Compra compra = new Compra(descricao, valor);

            cartao.realizarCompra(compra);

            if (cartao.verificarLimite(valor) == true) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = leitor.nextInt();
                leitor.nextLine();

            } else {
                opcao = 0;
            }
        }
        System.out.println("Programa Encerrado!\n");

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS:");
        cartao.imprimirCompra();
    }
}
