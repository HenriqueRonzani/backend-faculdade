public class EmpregadoTeste {

  public static void main(String[] args) {
    // Criando dois objetos Empregado
    Empregado empregado1 = new Empregado("Carlos", "Silva", 3500.00);
    Empregado empregado2 = new Empregado("Ana", "Pereira", 4200.00);

    // Exibindo o salário anual inicial de cada um
    System.out.println("--- Salários Anuais Iniciais ---");
    System.out.printf("Empregado 1 (%s %s): R$ %.2f%n", 
        empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        
    System.out.printf("Empregado 2 (%s %s): R$ %.2f%n", 
        empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());

    System.out.println("\n--- Concedendo um aumento de 10% ---");

    // Dando um aumento de 10% para cada empregado
    double novoSalario1 = empregado1.getSalarioMensal() * 1.10;
    empregado1.setSalarioMensal(novoSalario1);

    double novoSalario2 = empregado2.getSalarioMensal() * 1.10;
    empregado2.setSalarioMensal(novoSalario2);

    // Exibindo o salário anual após o aumento
    System.out.println("\n--- Salários Anuais Após Aumento ---");
    System.out.printf("Novo salário anual de %s: R$ %.2f%n", 
        empregado1.getNome(), empregado1.getSalarioAnual());
        
    System.out.printf("Novo salário anual de %s: R$ %.2f%n", 
        empregado2.getNome(), empregado2.getSalarioAnual());
  }
}