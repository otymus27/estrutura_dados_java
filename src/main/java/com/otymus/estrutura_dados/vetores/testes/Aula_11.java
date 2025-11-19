package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.VetorGenerico;

// Testando com array generico com uma classe
public class Aula_11 {

    public static void main(String[] args) {
        VetorGenerico vetor = new VetorGenerico(2);


        Contato c1 = new Contato("Contato 1", "contato1@gmail.com", "12345-4567");
        Contato c2 = new Contato("Contato 2", "contato2@gmail.com", "12345-9999");
        Contato c3 = new Contato("Contato 3", "contato3@gmail.com", "12345-3333");

        Contato c4 = new Contato("Contato 4", "contato4@gmail.com", "12345-3333");

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);
//        vetor.adicionar(c4);

        int pos = vetor.buscar(c4);
        if (pos != -1) {
            System.out.println("Elemento existe no vetor!");
        }else{
            System.out.println("Elemento não existe no vetor!");
        }

        System.out.println(vetor);
        System.out.println("Tamanho: "+vetor.tamanho());


    }
}
