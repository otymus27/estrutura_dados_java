package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

// Adicionar maior capacidade para o array
public class Aula_08 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor.toString());


    }
}
