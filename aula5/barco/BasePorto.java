import java.util.ArrayList;
import java.util.List;

public class BasePorto 
{
  String nome;
  List<Barco> barcosAtracados = new ArrayList<>();

    public BasePorto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        return true;
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
    }
}