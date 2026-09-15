import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int senhaCorreta = 1234;
        int senha;
        do {
            System.out.print("Digite a senha de quatro digitos: ");
            senha = scanner.nextInt();
            if (senha != senhaCorreta) System.out.println("Senha Incorreta.");
        } while (senha != senhaCorreta);
        System.out.println("Senha Correta.");
        scanner.close();
    }
}
