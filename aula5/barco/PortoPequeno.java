public class PortoPequeno extends BasePorto {

  public PortoPequeno(String nome) {  
    super(nome);
  }

  @Override
  public boolean atracarBarco(Barco barco) {
    if (barco.tamanho > 10) {
      System.out.println("Barco muito grande para porto pequeno");
      return false;
    }
    this.barcosAtracados.add(barco);
    return true;
  }
}