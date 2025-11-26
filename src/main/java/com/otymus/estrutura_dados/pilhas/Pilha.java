package com.otymus.estrutura_dados.pilhas;

import com.otymus.estrutura_dados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilhar(T elemento){
        super.adicionar(elemento);
    }

    // Metodo apenas da classe
    public T topo(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho-1];
    }

    // Metodo apenas da classe
    public T desempilhar(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[--tamanho];
    }

}
