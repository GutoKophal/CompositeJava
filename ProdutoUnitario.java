public class ProdutoUnitario extends Produto {
  protected String nome;
  protected double preco;

  public ProdutoUnitario(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
  }

  @Override
  public double calcularPreco() {
      return this.preco;
  }
}