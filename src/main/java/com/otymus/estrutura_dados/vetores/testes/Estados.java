package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

import static java.lang.IO.println;

// Adicionando elementos no final do array
public class Estados {

    public static void main(String[] args) {
        Vetor estados = new Vetor(5);

        estados.adicionar("AC");
        estados.adicionar("AM");
        estados.adicionar("BA");

        System.out.println("Tamanho real do vetor: "+estados.tamanho());
        println(estados);

        System.out.println(estados.verificar("AM"));
    }
}
