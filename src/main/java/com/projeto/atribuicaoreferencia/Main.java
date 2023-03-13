package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        MeuObj objA = new MeuObj(1);
        MeuObj objC = new MeuObj(8);
        MeuObj objB = objA; //Objeto B recebe a ref. do objA, ou seja, qd o valor que está no obja muda, objb tbm.


        System.out.println("ObjA =  " +objA + "  ObjB =  " + objB );
        objA = objC;


        System.out.println("ObjA =  " +objA + "  ObjB =  " + objB );


    }
}

