package com.otymus.estrutura_dados.pilhas.testes;

import com.otymus.estrutura_dados.pilhas.Pilha;

import java.util.Stack;

public class Aula_18 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        // Classe que usamos para trabalhar com pilhas em java
        Stack<Integer> stack = new Stack<Integer>();

        // Verifica se a pilha está vazia
        System.out.println("Está vazio: "+stack.isEmpty());

        System.out.println("Elemento do topo: "+pilha.topo());

        // Adicionando elementos na pilha ou empilhando
        stack.push(1);
        stack.push(8);
        stack.push(4);

        System.out.println("Elementos da pilha: "+stack);

        // Verificando o tamanho da pilha
        System.out.println("Tamanho da pilha: "+stack.size());

        System.out.println("Está vazio: "+stack.isEmpty());

        System.out.println("Elemento da base: "+stack.firstElement());
        System.out.println("Elemento do topo: "+stack.lastElement());

        // Removendo elemento na pilha, no caso o ultimo
        System.out.println("Removendo elemento da pilha: "+stack.pop());

        System.out.println("Verifica o elemento do topo da pilha: "+stack.peek());

        System.out.println("Elementos da pilha: "+stack);

    }
}
