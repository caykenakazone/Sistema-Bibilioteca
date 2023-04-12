import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 128, "Agir");
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 288, "HarperCollins");
        Revista revista1 = new Revista("Carros mais vendidos", "Auto Esporte",322,"Rocco");
        DVD dvd1 = new DVD("Interestelar", "Junin", "Ficção científica",169);
        DVD dvd2 = new DVD("O Senhor dos Anéis: A Sociedade do Anel","João José", "Fantasia", 178);

        Usuario usuario1 = new Usuario("Carlos Cayke", "cayke@email", "Rua dos Eucalipitos");
        Usuario usuario2 = new Usuario("João Pedro", "jp@email", "Rua Olhos d'água");
        Usuario usuario3 = new Usuario("Luiz Felipe", "luiz@email", "Rua Calistemon");


        usuario1.escolherItem(livro1);
        usuario1.escolherItem(revista1);
        usuario1.escolherItem(dvd1);
        Emprestimo emprestimo1 = new Emprestimo(usuario1, usuario1.getCarrinho(),LocalDate.of(2023, 3, 22));



        usuario2.escolherItem(livro2);
        usuario2.escolherItem(revista1);
        usuario2.escolherItem(dvd2);
        usuario2.devolverItem(livro2);
        Emprestimo emprestimo2 = new Emprestimo(usuario2, usuario2.getCarrinho(),LocalDate.of(2023, 2, 19));



        usuario3.escolherItem(dvd1);
        usuario3.escolherItem(dvd2);
        Emprestimo emprestimo3 = new Emprestimo(usuario3, usuario3.getCarrinho(),LocalDate.of(2023, 1, 7));
        emprestimo3.devolverEmprestimo();

        emprestimo1.imprime();
        System.out.println();
        emprestimo2.imprime();
        System.out.println();
        emprestimo3.imprime();
    }
}
