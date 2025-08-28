public class DataTeste {

  public static void main(String[] args) {
    System.out.println("--- Testando a Classe Data ---");

    System.out.println("\n1. Criando uma data válida (27/08/2025):");
    Data dataValida = new Data(27, 8, 2025);
    System.out.print("   Resultado: ");
    dataValida.displayData();

    System.out.println("\n2. Criando uma data com dia inválido (31/04/2024):");
    Data dataDiaInvalido = new Data(31, 4, 2024);
    System.out.print("   Resultado: ");
    dataDiaInvalido.displayData();

    System.out.println("\n3. Criando uma data com mês inválido (10/15/2023):");
    Data dataMesInvalido = new Data(10, 15, 2023);
    System.out.print("   Resultado: ");
    dataMesInvalido.displayData();
    
    System.out.println("\n4. Criando data em ano não bissexto (29/02/2023):");
    Data dataNaoBissexto = new Data(29, 2, 2023);
    System.out.print("   Resultado: ");
    dataNaoBissexto.displayData();
  }
}