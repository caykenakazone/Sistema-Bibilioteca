    public class DVD extends Item{
    private String genero;
    private double duracao;

    //Construtor

    public DVD(String titulo, String autor, String genero, double duracao) {
        super(titulo, autor);
        this.genero = genero;
        this.duracao = duracao;
    }

    //Getters e Setters


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
