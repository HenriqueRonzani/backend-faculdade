
import java.util.ArrayList;
import java.util.List;

public class PortoMain {

    public static void main(String[] args) {
        List<Barco> frota = new ArrayList<>();
        frota.add(new Barco("Veleiro", 12));
        frota.add(new Barco("Lancha", 8));
        frota.add(new Barco("Navio de Carga", 45));
        frota.add(new Barco("Bote", 3));
        frota.add(new Barco("Iate", 25));

        PortoPequeno portoPequeno = new PortoPequeno("Porto de Santos");
        PortoGrande portoGrande = new PortoGrande("Porto de Itajaí");

        for (Barco barco : frota) {
            System.out.println("Teste barco " + barco.getNome());
            if (!portoPequeno.atracarBarco(barco)); {
                portoGrande.atracarBarco(barco);
            }
            System.err.println("-----");
        }

    }
}
