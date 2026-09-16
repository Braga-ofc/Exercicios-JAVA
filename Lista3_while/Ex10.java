package Lista3_while;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int senhaCorreta = 1234;
        System.out.print("Digite a senha de quatro digitos: ");
        int senha = scanner.nextInt();
        while (senha != senhaCorreta) {
            System.out.println("Senha Incorreta.");
            System.out.print("Digite a senha novamente: ");
            senha = scanner.nextInt();
        }
        System.out.println("Senha Correta.");
        scanner.close();
    }
}
