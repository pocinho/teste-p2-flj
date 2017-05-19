/**
 * Created by Paulo Pocinho on 05/05/2017.
 */
public class Flor {
    private String nome;
    private double preco;
    private int stock;

    public String getNome() {
        return new String(nome);
    }

    public void setNome(String nome) {
        this.nome = new String(nome);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Flor(String nome, double preco, int stock) {
        this.nome = new String(nome);
        this.preco = preco;
        this.stock = stock;
    }

    public Flor(Flor f) {
        this.nome = f.getNome();
        this.preco = f.getPreco();
        this.stock = f.getStock();
    }

    @Override
    public Flor clone() {
        return new Flor(this);
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Nome: ");
        resultado.append(nome);
        resultado.append("; Preco: ");
        resultado.append(preco);
        resultado.append("€; Stock: ");
        resultado.append(stock);
        return resultado.toString();
    }
}
