import java.time.Year;

public class Data
{
  private int dia;
  private int mes;
  private int ano;

  public Data (int dia, int mes, int ano) {
    this.setAno(ano);
    this.setMes(mes);
    this.setDia(dia);
  }

  public int getMes() {
    return mes;
  }

  public int getDia() {
    return dia;
  }

  public int getAno() {
    return ano;
  }

  public void setMes(int mes) {
    if (mes >= 1 && mes <= 12) {
      this.mes = mes;
    } else {
      System.out.println("Mês inválido (" + mes + ").");
    }
  }
  
  public void setAno(int ano) {
    this.ano = ano;
  }

  public void setDia(int dia) {
    int diasNoMes = 0;

    switch (this.mes) {
      case 1, 3, 5, 7, 8, 10, 12 -> diasNoMes = 31;
      case 4, 6, 9, 11 -> diasNoMes = 30;
      case 2 -> {
        if (Year.isLeap(this.ano)) {
          diasNoMes = 29;
        } else {
          diasNoMes = 28;
        } 
      }
    }

    if (dia >= 1 && dia <= diasNoMes) {
      this.dia = dia;
    } else {
      System.out.println("Dia inválido (" + dia + ") para o mês/ano.");
    }
  }

  public void displayData() {
    String dataCompleta = String.format("%02d/%02d/%02d", this.dia, this.mes, this.ano);
    System.out.println(dataCompleta);
  }
}