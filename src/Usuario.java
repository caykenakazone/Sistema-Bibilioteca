import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private ArrayList<Item> carrinho;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.carrinho = new ArrayList<Item>();
    }

    public void escolherItem(Item item) {
        carrinho.add(item);
    }

    public void devolverItem(Item item) {
        carrinho.remove(item);
    }

    public void esvaziarCarrinho() {
        carrinho.clear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Item> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Item> carrinho) {
        this.carrinho = carrinho;
    }
}
