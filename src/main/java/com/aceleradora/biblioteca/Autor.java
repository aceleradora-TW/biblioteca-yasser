package com.aceleradora.biblioteca;

class Autor {
    private String nome;
    private String sobrenome;

    Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
