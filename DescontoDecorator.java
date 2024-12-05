public class DescontoDecorator extends Produto {
  private Produto produto;
  private double desconto;

  public DescontoDecorator(Produto produto, double desconto) {
      this.produto = produto;
      this.desconto = desconto;
  }

  @Override
  public double calcularPreco() {
      return produto.calcularPreco() * (1 - desconto);
  }
}