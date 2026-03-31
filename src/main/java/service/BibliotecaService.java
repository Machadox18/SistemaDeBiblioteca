package service;

import model.Livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BibliotecaService {

    private List<Livro> livros = new ArrayList<Livro>();
    private Map<String, List<Livro>> autores = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);

        autores.computeIfAbsent(livro.autor(), a -> new ArrayList<>()).add(livro);
    }

    public void listarLivros() {
        livros.forEach(System.out::println);
    }

    public void listarLivrosCaros(double valor) {
        List<Livro> caros = livros.stream()
                .filter(l -> l.preco() > valor)
                .collect(Collectors.toList());

        caros.forEach(System.out::println);
    }
}
