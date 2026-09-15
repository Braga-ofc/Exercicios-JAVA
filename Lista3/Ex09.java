import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n1 - km/h para m/s\n2 - m/s para km/h\n0 - Encerrar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Velocidade em km/h: ");
                System.out.printf("Resultado: %.2f m/s%n", scanner.nextDouble() / 3.6);
            } else if (opcao == 2) {
                System.out.print("Velocidade em m/s: ");
                System.out.printf("Resultado: %.2f km/h%n", scanner.nextDouble() * 3.6);
            } else if (opcao != 0) System.out.println("Opcao invalida.");
        } while (opcao != 0);
        scanner.close();
    }
}
