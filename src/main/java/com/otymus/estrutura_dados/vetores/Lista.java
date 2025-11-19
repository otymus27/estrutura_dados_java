package com.otymus.estrutura_dados.vetores;

import java.util.Arrays;
import java.util.Objects;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    // Metodo para aumentar capacidado do array
    public void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // Metodo para adicionar elemento no vetor 3 opção, retornando um booleano
    public boolean adicionar(T elemento){
        this.aumentarCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // Metodo para adicionar elemento em qualquer posiçao do array
    public boolean adicionar(int posicao, T elemento){
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

    public void remover(T elemento){
        int pos = this.buscar(elemento);
        if (pos > -1){
            this.remover(pos);
        }
    }

    // Metodo para buscar um elemento do array de uma determina
    public T buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        return this.elementos[posicao];
    }

    // Metodo para buscar um elemento do array de uma determina
    public int buscar(T elemento){
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T obtem(int posicao){
        return this.buscar(posicao);
    }

    // Metodo contem semelhante ao do arraylist
    public boolean contem(T elemento){
        return buscar(elemento) != -1;
    }

    public int ultimoIndice(T elemento){

        for (int i=this.tamanho-1; i>=0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove todos os elementos armazenados na estrutura.
     *
     * O método:
     * - Define cada posição usada do array como null (permitindo GC);
     * - Reseta o tamanho lógico para zero.
     *
     * Equivalente ao método clear() de uma coleção.
     */
    public void limpar() {
        // Remove as referências dos elementos atualmente ocupados
//        for (int i = 0; i < this.tamanho; i++) {
//            this.elementos[i] = null;
//        }

        Arrays.fill(this.elementos, null);

        // Marca a estrutura como vazia
        this.tamanho = 0;


    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i =0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
            s.append("\n");
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
        Lista that = (Lista) o;
        return tamanho == that.tamanho && Objects.deepEquals(elementos, that.elementos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(elementos), tamanho);
    }


}
