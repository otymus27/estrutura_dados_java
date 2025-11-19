package com.otymus.estrutura_dados.vetores.testes;

import com.otymus.estrutura_dados.vetores.VetorGenerico;

import java.util.ArrayList;

// Utilizando o ArrayList
public class Aula_12 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Contato 1");
        lista.add("Contato 3");

        System.out.println(lista);

        lista.add(1, "Contato 2");

        System.out.println(lista);

        System.out.println("Tamanho da lista: "+ lista.size());

        //buscar por conteudo do array
        boolean existe = lista.contains("Contato 2");
        if (existe) {
            System.out.println(("O elemento existe na lista!"));
        }else{
            System.out.println(("O elemento não existe na lista!"));
        }

        //buscar pelo indice do array
        int pos = lista.indexOf("Contato 2");
        if (pos > -1) {
            System.out.println(("O elemento existe na lista na posição "+pos));
        }else{
            System.out.println(("O elemento não existe na lista na posição "+pos));
        }

        //buscar por por posição
        System.out.println(lista.get(2));

        lista.remove(2);
        lista.remove("Contato 2");
        System.out.println(lista);

    }
}
