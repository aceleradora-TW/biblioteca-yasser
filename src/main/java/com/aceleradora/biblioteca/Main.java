package com.aceleradora.biblioteca;

public class Main {

    private static final String BOAS_VINDAS = "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre.";

    private static final Livro[] LIVROS = new Livro[]{
            new Livro("Program Development in Java"),
            new Livro("Use a cabeça: Padrões de projeto")
    };

    public static void main(String[] args) {
        System.out.println(BOAS_VINDAS);

        System.out.println("Livros Disponiveis:");
        for (Livro livro : LIVROS) {
            System.out.printf("- %s\n", livro.getTitulo());
        }
    }
}
