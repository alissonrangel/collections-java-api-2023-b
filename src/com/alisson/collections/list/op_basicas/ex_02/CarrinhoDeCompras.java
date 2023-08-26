package com.alisson.collections.list.op_basicas.ex_02;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        ArrayList<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for (Item i : carrinho) {
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2.5, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2.7, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35.3, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.2, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.printf("O valor total da compra é = R$ %.2f", carrinhoDeCompras.calcularValorTotal());
    }
}
