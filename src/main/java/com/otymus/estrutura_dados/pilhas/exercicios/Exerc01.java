package com.otymus.estrutura_dados.pilhas.exercicios;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        // Classe para entrada de dados pelo teclado
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o "+(i + 1) +"º número:");
            Integer num = scan.nextInt();

            if(num % 2 == 0){
                pilha.empilhar(num);
            }else{
                pilha.desempilhar();
            }

        }

        if (pilha.estaVazia()){
            System.out.println("A pilha está vazia!");
        }else {
            System.out.println(pilha);
            System.out.println("O tamanho da pilha é: "+pilha.tamanho());

            for(int i = pilha.tamanho(); i >= 0; i--){
                pilha.desempilhar();
            }

        }

        System.out.println("Pilha atual desempilhada: "+pilha);

    }

}
