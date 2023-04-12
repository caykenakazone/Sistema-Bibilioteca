public class Revista extends Item {
    private int numeroEdicao;
    private String editora;

    public Revista(String titulo, String autor, int numeroEdicao, String editora) {
        super(titulo, autor);
        this.numeroEdicao = numeroEdicao;
        this.editora = editora;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getEditora() {
        return editora;
    }
}
