package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.Vetor;

// Adicionando elementos no final do array
public class Aula_04 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try{
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            vetor.adicionar("elemento 3");

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Tamanho real do vetor: "+vetor.tamanho());
    }
}
