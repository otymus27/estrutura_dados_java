package com.otymus.estrutura_dados.pilhas.exercicios;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<Integer>();

        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        // Classe para entrada de dados pelo teclado
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o "+(i + 1) +"º número:");
            Integer num = scan.nextInt();

            if(num % 2 == 0 && num != 0){
                pilhaPar.empilhar(num);
            }else if(num % 2 == 1 && num != 0){
                pilhaImpar.empilhar(num);
            }else{
                pilhaPar.desempilhar();
                pilhaImpar.desempilhar();
            }

        }

        System.out.println("Pilha atualizada: "+pilhaPar);
        System.out.println("Pilha atualizada: "+pilhaImpar);

        if (pilhaPar.estaVazia() && pilhaImpar.estaVazia()){
            System.out.println("A pilha de pares e impares estão vazias!");
        }else {
            System.out.println(pilhaPar);
            System.out.println("O tamanho da pilha de pares é: "+pilhaPar.tamanho());

            System.out.println(pilhaImpar);
            System.out.println("O tamanho da pilha de impares é: "+pilhaImpar.tamanho());

            for(int i = pilhaPar.tamanho(); i >= 0; i--){
                pilhaPar.desempilhar();
            }

            for(int i = pilhaImpar.tamanho(); i >= 0; i--){
                pilhaImpar.desempilhar();
            }

        }

        System.out.println("Pilha de pares atual desempilhada: "+pilhaPar);
        System.out.println("Pilha de impares atual desempilhada: "+pilhaImpar);

    }

}
