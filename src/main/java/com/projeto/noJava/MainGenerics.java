
package com.projeto.noJava;

public class MainGenerics {
    public static void main(String[] args) {
        NoGenerics<String> no1 = new NoGenerics<>("Conteudo no1");

        NoGenerics<String> no2 = new NoGenerics<>("Conteudo no2");

        no1.setProximoNo(no2);

        NoGenerics<String> no3 = new NoGenerics<>("Conteudo no3");
        no2.setProximoNo(no3);

        NoGenerics<String> no4 = new NoGenerics<>("Conteudo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
