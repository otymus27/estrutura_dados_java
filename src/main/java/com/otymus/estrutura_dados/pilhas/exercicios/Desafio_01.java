package com.otymus.estrutura_dados.pilhas.exercicios;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Stack;

public class Desafio_01 {

    public static void main(String[] args) {

        imprimirResultado("Ana");
        imprimirResultado("ABBBBA");
        imprimirResultado("cabo");



    }

    public static void imprimirResultado(String palavra){
        System.out.println(palavra + " é palindromo "+ verificaPalindromo(palavra));
    }

    public static boolean verificaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<>();

        for(int i = 0; i < palavra.length(); i++){
            pilha.empilhar(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilhar();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;

    }

}
