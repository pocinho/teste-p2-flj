import java.util.Arrays;

/**
 * Created by Paulo Pocinho on 05/05/2017.
 */
public class Florista {
    private String nome;
    private Flor[] lista;
    private Flor florEleita;

    public String getNome() {
        return new String(nome);
    }

    public void setNome(String nome) {
        this.nome = new String(nome);
    }

    public Flor[] getLista() {
        return Arrays.copyOf(lista, lista.length);
    }

    public void setLista(Flor[] lista) {
        this.lista = Arrays.copyOf(lista, lista.length);
    }

    public Flor getFlorEleita() {
        return florEleita.clone();
    }

    public void setFlorEleita(Flor florEleita) {
        this.florEleita = florEleita.clone();
    }

    public double vendeFlor(String nomeFlor, int qtd) {
        double resultado = 0.0;
        for (int i = 0; i < lista.length; ++i) {
            if (lista[i].getNome().equalsIgnoreCase(nomeFlor)) {
                resultado = qtd * lista[i].getPreco();
                lista[i].setStock(lista[i].getStock() - qtd);
            }
        }
        return resultado;
    }

    public int compraFlor(String nomeFlor, int qtd) {
        int resultado = 0;
        for (int i = 0; i < lista.length; ++i) {
            if (lista[i].getNome().equalsIgnoreCase(nomeFlor)) {
                lista[i].setStock(lista[i].getStock() + qtd);
                resultado = lista[i].getStock();
            }
        }
        return resultado;
    }

    public String listaInventarioLoja() {
        StringBuilder resultado = new StringBuilder("Nome da Flor\tQtd em Stock\tPreco\tValor\n");
        double totalStock = 0.0;
        for (int i = 0; i < lista.length; ++i) {
            resultado.append(lista[i].getNome());
            resultado.append("\t\t");
            resultado.append(lista[i].getStock());
            resultado.append("\t\t");
            resultado.append(lista[i].getPreco());
            resultado.append("€\t");
            resultado.append(lista[i].getPreco() * lista[i].getStock());
            resultado.append("€\n");
            totalStock += lista[i].getPreco() * lista[i].getStock();
        }
        resultado.append("\nValorização Total do Stock:\t");
        resultado.append(totalStock);
        resultado.append("€");
        return resultado.toString();
    }

    public Florista(String nome, Flor[] flores, Flor florEleita) {
        this.nome = new String(nome);
        this.lista = Arrays.copyOf(flores, flores.length);
        this.florEleita = florEleita.clone();
    }

    public String verFlor(String nome) {
        String resultado = "";
        for (int i = 0; i < lista.length; ++i) {
            if (lista[i].getNome().equalsIgnoreCase(nome)) {
                resultado = lista[i].toString();
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Florista: ");
        resultado.append(nome);
        resultado.append("; Flor Eleita: ");
        resultado.append(florEleita);
        return resultado.toString();
    }
}
