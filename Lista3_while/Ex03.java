package Lista3_while;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        while (valor < 1 || valor > 10) {
            System.out.print("Digite um valor inteiro de 1 a 10: ");
            valor = scanner.nextInt();
        }
        int multiplicador = 1;
        while (multiplicador <= 10) {
            System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
            multiplicador++;
        }
        scanner.close();
    }
}
