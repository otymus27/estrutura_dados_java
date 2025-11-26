package com.otymus.estrutura_dados.vetores;

import com.otymus.estrutura_dados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista() {
        super();
    }

    public Lista(int capacidade){
        super(capacidade);
    }

    public boolean adicionar(T elemento) {
        return super.adicionar(elemento);
    }

    public boolean adicionar(int posicao, T elemento){
        return super.adicionar(posicao, elemento);
    }

    public T obtem(int posicao){
        return this.buscar(posicao);
    }

    public T buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int buscar(T elemento){
        for (int i=0; i<this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento){

        for (int i=this.tamanho-1; i>=0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){
        return buscar(elemento) > -1; //>=0
    }

    public void remover(int posicao){
        super.remover(posicao);
    }

    public void remover(T elemento){
        int pos = this.buscar(elemento);
        if (pos > -1){
            this.remover(pos);
        }
    }

    public void limpar(){
        for (int i=0; i<this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

}
