import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos jogadores você quer criar? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            Player jogador = new Player();
            System.out.println(jogador.getPlayer());
        }

        scanner.close();
    }
}
