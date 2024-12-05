public class CompositeMain {
  public static void main(String[] args) {
    Produto sofa = new ProdutoUnitario("Sofá", 250);
    Produto mesa = new ProdutoUnitario("Mesa", 350);
    Produto cadeira = new ProdutoUnitario("Cadeira", 80);

    Produto sofaComDesconto = new DescontoDecorator(sofa, 0.10);
    Produto mesaComDesconto = new DescontoDecorator(mesa, 0.15);
    Produto cadeiraComDesconto = new DescontoDecorator(cadeira, 0.20);

    CaixaDeProdutos promocao1 = new CaixaDeProdutos();
    promocao1.adicionarProduto(sofaComDesconto);
    promocao1.adicionarProduto(cadeiraComDesconto);

    CaixaDeProdutos promocao2 = new CaixaDeProdutos();
    promocao2.adicionarProduto(mesaComDesconto);

    CaixaDeProdutos caixaFinal = new CaixaDeProdutos();
    caixaFinal.adicionarProduto(promocao1);
    caixaFinal.adicionarProduto(promocao2);

    System.out.println("Preço Total da Promoção: " + caixaFinal.calcularPreco());
  }
}
