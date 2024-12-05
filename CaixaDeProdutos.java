import java.util.List;
import java.util.LinkedList;

public class CaixaDeProdutos extends Produto {
    private List<Produto> produtos;

    public CaixaDeProdutos() {
        this.produtos = new LinkedList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularPreco();
        }
        return total;
    }
}