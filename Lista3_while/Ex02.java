package Lista3_while;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        while (numero <= 100) {
            System.out.println(numero);
            numero += 2;
        }
        scanner.close();
    }
}
