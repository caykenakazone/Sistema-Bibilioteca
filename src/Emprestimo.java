import java.time.LocalDate;
import java.util.ArrayList;

abstract class Emprestimo {
    private Usuario usuario;
    private ArrayList<Item> itens;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, ArrayList<Item> itens, LocalDate dataEmprestimo) {
        this.usuario = usuario;
        this.itens = itens;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void fazerEmprestimo() {
        for (Item item : itens) {
            item.setDisponivel(false);
        }
        usuario.getCarrinho().clear();
    }

    public void devolverEmprestimo() {
        dataDevolucao = LocalDate.now();
        for (Item item : itens) {
            if (usuario.getCarrinho().contains(item)){
                item.setDisponivel(true);
            }
        }
    }

    public void imprime() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data de devolução: " + dataDevolucao);
        System.out.println("Itens emprestados:");
        for (Item item : itens) {
            System.out.println("- " + item.getTitulo());
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
