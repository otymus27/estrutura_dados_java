package com.otymus.estrutura_dados.pilhas.exercicios;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<Livro>();

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

        System.out.println("Pilha de livros criada, pilha está vazia? "+pilha.estaVazia());

        pilha.empilhar(livro1);
        pilha.empilhar(livro2);

        System.out.println("Tamanho da pilha de livros: "+pilha.tamanho());

        System.out.println("Livros na pilha: "+pilha);


        if (pilha.estaVazia()){
            System.out.println("A pilha está vazia!");
        }else {
            System.out.println(pilha);
            System.out.println("O tamanho da pilha é: "+pilha.tamanho());

            for(int i = pilha.tamanho(); i > 0; i--){
                pilha.desempilhar();
            }

        }

        System.out.println("Pilha atual desempilhada: "+pilha);

    }

}
