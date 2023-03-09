package com.projeto.noJava;

public class NoGenerics<T> {
    private T conteudo;
    private NoGenerics<T> proximoNo;

    public NoGenerics(T conteudo) {
        this.proximoNo=null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerics<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerics<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
