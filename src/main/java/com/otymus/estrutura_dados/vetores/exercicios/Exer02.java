package com.otymus.estrutura_dados.vetores.exercicios;

import com.otymus.estrutura_dados.vetores.Lista;

import java.util.ArrayList;

// Testando com array com generics
public class Exer02 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<String>(5);
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("A");

        System.out.println(lista.ultimoIndice("B"));
    }
}
