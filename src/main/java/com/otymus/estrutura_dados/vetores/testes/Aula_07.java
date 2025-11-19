package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

// Adicionar elemento em qualquer posição do array
public class Aula_07 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        vetor.adicionar(0,"A");

        vetor.adicionar(3,"H");

        System.out.println(vetor.toString());


    }
}
