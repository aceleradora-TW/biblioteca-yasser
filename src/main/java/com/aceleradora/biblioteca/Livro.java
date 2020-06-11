package com.aceleradora.biblioteca;

import java.util.List;

class Livro {
    private String titulo;
    private List<String> autoria;

    Livro(String titulo, List<String> autoria) {
        this.titulo = titulo;
        this.autoria = autoria;
    }

    String getTitulo() {
        return titulo;
    }

    List<String> getAutoria() {
        return autoria;
    }
}
