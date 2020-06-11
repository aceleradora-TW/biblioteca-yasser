package com.aceleradora.biblioteca;

class Livro {
    private String titulo;
    private Autor[] autoria;

    Livro(String titulo, Autor[] autoria) {
        this.titulo = titulo;
        this.autoria = autoria;
    }

    String getTitulo() {
        return titulo;
    }

    Autor[] getAutoria() {
        return autoria;
    }
}
