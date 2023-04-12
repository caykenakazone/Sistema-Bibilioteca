public class Livro extends Item {
    private int anoPublicacao;
    private int numPaginas;
    private String editora;

    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas, String editora) {
        super(titulo, autor);
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getEditora() {
        return editora;
    }
}

