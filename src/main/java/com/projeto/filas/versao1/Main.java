package com.projeto.filas.versao1;

public class Main {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println("Item tirado da Fila : "+minhaFila.dequeue());

        System.out.println(minhaFila);

        System.out.println("Item adicionado na Fila : "+minhaFila.enqueue(new No("ultimo")));

        System.out.println(minhaFila);

        System.out.println("Primeiro item da Fila "+minhaFila.first());

        System.out.println(minhaFila);
    }

}
