package com.otymus.estrutura_dados.vetores;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

//    // Metodo para adicionar elemento no vetor
//    public void adicionar(String elemento) {
//        for (int i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

    // Metodo para adicionar elemento no vetor 2 opção
//    public void adicionar(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else{
//            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elemento!");
//        }
//
//    }

    // Metodo para adicionar elemento no vetor 3 opção, retornando um booleano
    public boolean adicionar(String elemento){
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }
}
