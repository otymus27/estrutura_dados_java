package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

// Remover um elemento em qualquer posicao do array
public class Aula_09 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);

        vetor.remover(1);

        System.out.println(vetor);

    }
}
