package com.aceleradora.biblioteca;

import java.util.List;

class Livro {
    private String titulo;
    private List<Autor> autoria;

    Livro(String titulo, List<Autor> autoria) {
        this.titulo = titulo;
        this.autoria = autoria;
    }

    String getTitulo() {
        return titulo;
    }

    List<Autor> getAutoria() {
        return autoria;
    }
}
