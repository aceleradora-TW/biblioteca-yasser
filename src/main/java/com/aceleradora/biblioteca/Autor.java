package com.aceleradora.biblioteca;

class Autor {
    private String nome;
    private String sobrenome;

    Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
