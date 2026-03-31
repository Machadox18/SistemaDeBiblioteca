package service;

import model.Livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaService {

    private List<Livro> livros = new ArrayList<Livro>();
    private Map<String, List<Livro>> autores = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);

        autores.computeIfAbsent(livro.autor(), a -> new ArrayList<>()).add(livro);
    }
}
