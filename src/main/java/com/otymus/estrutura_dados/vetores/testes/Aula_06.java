package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

// Verificar se elemento existe no vetor
public class Aula_06 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.verificar("elemento 1"));


    }
}
