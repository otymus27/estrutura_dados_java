package com.otymus.estrutura_dados.pilhas.testes;

import com.otymus.estrutura_dados.pilhas.Pilha;

public class Aula_17 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Elemento do topo: "+pilha.topo());

        // Adicionando elementos na pilha
        pilha.empilhar(1);
        pilha.empilhar(8);
        pilha.empilhar(4);

        System.out.println("Elementos da pilha: "+pilha);

        System.out.println("Pilha está vazia: "+pilha.estaVazia());

        System.out.println("Elemento do topo: "+pilha.topo());

        // Removendo elemento na pilha, no caso o ultimo
        pilha.desempilhar();

        System.out.println("Elementos da pilha: "+pilha);

    }
}
