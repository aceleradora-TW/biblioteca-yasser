package com.aceleradora.biblioteca;

import java.util.Arrays;

public class Main {

    private static final String BOAS_VINDAS = "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre.";

    private static final Livro[] LIVROS = new Livro[]{
            new Livro("Program Development in Java", Arrays.asList(
                    new Autor("Barbara", "Liskov"))
            ),
            new Livro("Use a cabeça: Padrões de projeto", Arrays.asList(
                    new Autor("Kathy", "Sierra"),
                    new Autor("Elisabeth", "Freeman")
            ))
    };

    public static void main(String[] args) {
        System.out.println(BOAS_VINDAS);

        System.out.println("Livros Disponiveis:");
        for (Livro livro : LIVROS) {
            System.out.printf("- %s\n -- %s\n", livro.getTitulo(), livro.getAutoria());
        }
    }
}
