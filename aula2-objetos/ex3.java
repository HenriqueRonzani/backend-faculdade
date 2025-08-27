import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Pokémons você quer criar? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            Pokemon pokemon = new Pokemon();
            System.out.println(pokemon.getPokemon());
        }

        scanner.close();
    }
}
