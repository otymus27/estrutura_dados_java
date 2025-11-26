package com.otymus.estrutura_dados.pilhas.exercicios;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exerc04 {

    public static void main(String[] args) {

        Stack<Livro> stack = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setTitulo("Livro 1");
        livro1.setAutor("José Silva");
        livro1.setAnoPublicacao(2024);
        livro1.setIsbn("A123");

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro 2");
        livro2.setAutor("Ana Moser");
        livro2.setAnoPublicacao(2023);
        livro2.setIsbn("A124");

        System.out.println("Pilha de livros criada, pilha está vazia? "+stack.isEmpty());

        stack.push(livro1);
        stack.push(livro2);

        System.out.println("Tamanho da pilha de livros: "+stack.size());

        System.out.println("Livros na pilha: "+stack);


        if (stack.isEmpty()){
            System.out.println("A pilha está vazia!");
        }else {
            System.out.println(stack);
            System.out.println("O tamanho da pilha é: "+stack.size());

            for(int i = stack.size(); i >= 0; i--){
                stack.pop();
            }

        }

        System.out.println("Pilha atual desempilhada: "+stack);

    }

}
