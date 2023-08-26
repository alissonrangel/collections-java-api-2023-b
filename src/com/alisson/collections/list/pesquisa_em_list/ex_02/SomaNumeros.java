package com.alisson.collections.list.pesquisa_em_list.ex_02;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numberList = new ArrayList<>();

    public void adicionarNumero(int numero){
        numberList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (int n: numberList) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maxValue = numberList.get(0);
        for (int n : numberList) {
            if (n > maxValue){
                maxValue = n;
            }
        }
        return maxValue;
    }

    public int encontrarMenorNumero(){
        int minValue = numberList.get(0);
        for (int n : numberList) {
            if (n < minValue){
                minValue = n;
            }
        }
        return minValue;
    }

    public List<Integer> exibirNumeros(){
        return numberList;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}
