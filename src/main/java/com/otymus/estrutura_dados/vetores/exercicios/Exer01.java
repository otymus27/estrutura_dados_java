package com.otymus.estrutura_dados.vetores.exercicios;


import com.otymus.estrutura_dados.vetores.Lista;
import com.otymus.estrutura_dados.vetores.testes.Contato;

// Testando com array com generics
public class Exer01 {

    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(1);

        vetor.adicionar("a");
        vetor.adicionar("b");
        System.out.println(vetor);
        System.out.println(vetor.contem("a"));
        System.out.println(vetor.contem("h"));

        Lista<Contato> contatos = new Lista<Contato>(2);

        Contato c1 = new Contato("Contato 1", "contato1@gmail.com", "12345-4567");
        Contato c2 = new Contato("Contato 2", "contato2@gmail.com", "12345-9999");
        Contato c3 = new Contato("Contato 2", "contato2@gmail.com", "12345-9999");
        contatos.adicionar(c1);
        contatos.adicionar(c2);

        System.out.println(contatos);

        System.out.println(contatos.contem(c1));
        System.out.println(contatos.contem(c3));
    }
}
