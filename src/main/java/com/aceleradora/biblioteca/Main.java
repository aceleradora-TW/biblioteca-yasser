package com.aceleradora.biblioteca;

public class Main {

    private static final String BOAS_VINDAS = "Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre.";

    private static final Livro[] LIVROS = new Livro[]{
            new Livro("Program Development in Java", new Autor[]{
                    new Autor("Barbara", "Liskov")
            }),
            new Livro("Use a cabeça: Padrões de projeto", new Autor[]{
                    new Autor("Kathy", "Sierra"),
                    new Autor("Elisabeth", "Freeman")
            })
    };

    private static String formataLivroParaExibicao(Livro livro) {
        String autorasFormatadas = "";
        Autor[] autoria = livro.getAutoria();

        for (int i = 0; i < autoria.length; i++) {
            autorasFormatadas += autoria[i].getNomeCompleto();
            if (i < autoria.length - 1) {
                autorasFormatadas += ", ";
            }
        }

        return String.format("- %s (%s)", livro.getTitulo(), autorasFormatadas);
    }

    public static void main(String[] args) {
        System.out.println(BOAS_VINDAS);

        System.out.println("Livros Disponiveis:");
        for (Livro livro : LIVROS) {
            System.out.println(formataLivroParaExibicao(livro));
        }
    }
}
