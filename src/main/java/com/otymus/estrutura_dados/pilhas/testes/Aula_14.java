package com.otymus.estrutura_dados.pilhas.testes;

import com.otymus.estrutura_dados.pilhas.Pilha;

public class Aula_14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++){
            pilha.empilhar(i*2);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }


}
