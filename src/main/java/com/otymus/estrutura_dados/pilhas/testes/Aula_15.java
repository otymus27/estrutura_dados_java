package com.otymus.estrutura_dados.pilhas.testes;

import com.otymus.estrutura_dados.pilhas.Pilha;

public class Aula_15 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Pilha está vazia: "+pilha.estaVazia());

        pilha.empilhar(1);
        pilha.empilhar(8);
        pilha.empilhar(4);

        System.out.println("Pilha está vazia: "+pilha.estaVazia());

        System.out.println("Elementos da pilha: "+pilha);

    }
}
