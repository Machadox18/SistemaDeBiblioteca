import model.Livro;
import service.BibliotecaService;

public class Main {
    public static void main(String[] args) {

        BibliotecaService service = new BibliotecaService();

        Livro l1 = new Livro("Clean Code", "Robert Martin", 120);
        Livro l2 = new Livro("Effective Java", "John Smith", 190);
        Livro l3 = new Livro("Java Básico", "Robert Martin", 80);

        service.adicionarLivro(l1);
        service.adicionarLivro(l2);
        service.adicionarLivro(l3);
    }
}