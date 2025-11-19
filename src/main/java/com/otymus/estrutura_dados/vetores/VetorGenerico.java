package com.otymus.estrutura_dados.vetores;

import java.util.Arrays;
import java.util.Objects;

public class VetorGenerico {

    private Object[] elementos;
    private int tamanho;

    public VetorGenerico(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    // Metodo para aumentar capacidado do array
    public void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length*2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // Metodo para adicionar elemento no vetor 3 opção, retornando um booleano
    public boolean adicionar(Object elemento){
        this.aumentarCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // Metodo para adicionar elemento em qualquer posiçao do array
    public boolean adicionar(int posicao, Object elemento){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }

        this.aumentarCapacidade();
        for (int i = tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;

        return false;
    }

    // Metodo para remover elemento em qualquer posiçao do array
    public void remover(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }

        for (int i = posicao; i < tamanho-1; i++) {
            this.elementos[i] = elementos[i+1];
        }

        tamanho--;

    }

    // Metodo para buscar um elemento do array de uma determina
    public Object buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        return this.elementos[posicao];
    }

    // Metodo para buscar um elemento do array de uma determina
    public int buscar(Object elemento){
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i =0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VetorGenerico that = (VetorGenerico) o;
        return tamanho == that.tamanho && Objects.deepEquals(elementos, that.elementos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(elementos), tamanho);
    }
}
