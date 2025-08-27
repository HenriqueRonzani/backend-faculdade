import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Password passwordGenerator = new Password();

        System.out.print("Quantas senhas você quer gerar? ");
        int passwordQuantity = scanner.nextInt();

        for (int index = 0; index < passwordQuantity; index++) {

            System.out.println(passwordGenerator.generatePassword());
        }

        scanner.close();
    }
}
