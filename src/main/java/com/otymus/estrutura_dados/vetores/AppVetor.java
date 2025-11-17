package com.otymus.estrutura_dados.vetores;

public class AppVetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        int i = 0;
        i++;

        try{
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            //vetor.adicionar("elemento 3");

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Tamanho: " + vetor.tamanho());
    }
}
