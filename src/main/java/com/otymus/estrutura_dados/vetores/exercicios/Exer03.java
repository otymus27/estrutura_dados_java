package com.otymus.estrutura_dados.vetores.exercicios;

import com.otymus.estrutura_dados.vetores.Lista;

import java.util.ArrayList;

// Testando com array com generics
public class Exer03 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");

        System.out.println(lista);

        lista.remover("A");

        System.out.println(lista);

        lista.remover("E");

        System.out.println(lista);

        lista.remover("C");

        System.out.println(lista);
    }
}
