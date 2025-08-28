public class FaturaTeste {

  public static void main(String[] args) {
    Fatura fatura1 = new Fatura("001", "Mouse sem fio", 5, 75.50);

    Fatura fatura2 = new Fatura("002", "Teclado Mecânico", 2, 350.0);

    System.out.println("--- Fatura 1 ---");
    System.out.println("Número: " + fatura1.getNumero());
    System.out.println("Descrição: " + fatura1.getDescricao());
    System.out.println("Quantidade: " + fatura1.getQuantidade());
    System.out.println("Preço por Item: R$ " + fatura1.getPrecoPorItem());
    System.out.println("Total da Fatura: R$ " + fatura1.getTotalFatura());

    System.out.println("--- Fatura 2 ---");
    System.out.println("Número: " + fatura2.getNumero());
    System.out.println("Descrição: " + fatura2.getDescricao());
    System.out.println("Quantidade: " + fatura2.getQuantidade());
    System.out.println("Preço por Item: R$ " + fatura2.getPrecoPorItem());
    System.out.println("Total da Fatura: R$ " + fatura2.getTotalFatura());
  }
}