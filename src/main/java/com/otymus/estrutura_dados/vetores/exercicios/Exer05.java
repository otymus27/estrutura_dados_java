package com.otymus.estrutura_dados.vetores.exercicios;

import com.otymus.estrutura_dados.vetores.Lista;

import java.util.ArrayList;

// Testando com array com generics
public class Exer05 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);


        Lista<String> lista = new Lista<String>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);

    }
}
