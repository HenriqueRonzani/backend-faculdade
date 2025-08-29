public class PortoGrande extends BasePorto {
  
  public PortoGrande(String nome) {  
    super(nome);
  }
  
  @Override
  public boolean atracarBarco(Barco barco) {
    if (barco.tamanho < 10) {
      System.out.println("Barco muito pequeno para porto grande");
      return false;
    }
    this.barcosAtracados.add(barco);
    return true;
  }
}