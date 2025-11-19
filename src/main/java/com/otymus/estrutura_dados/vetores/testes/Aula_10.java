package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.VetorGenerico;

// Testando com array generico
public class Aula_10 {

    public static void main(String[] args) {
        VetorGenerico vetor = new VetorGenerico(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar(4);
        vetor.adicionar(3);
        vetor.adicionar(3.0);

        System.out.println(vetor);
        vetor.remover(1);
        System.out.println(vetor);


    }
}
