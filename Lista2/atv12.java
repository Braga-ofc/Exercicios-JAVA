package Lista2;

import java.util.Scanner;

/*
 * Questao 12 - Ler quatro valores inteiros (A, B, C e D) e apresentar apenas
 * os que sejam divisiveis por 2 e por 3.
 */
public class atv12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== VALORES DIVISIVEIS POR 2 E POR 3 ===");
        System.out.print("Digite o valor de A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = entrada.nextInt();

        System.out.print("Digite o valor de D: ");
        int d = entrada.nextInt();

        System.out.println();
        System.out.println("Valores divisiveis por 2 e por 3:");

        boolean encontrou = false;

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("A = " + a);
            encontrou = true;
        }
        if (b % 2 == 0 && b % 3 == 0) {
            System.out.println("B = " + b);
            encontrou = true;
        }
        if (c % 2 == 0 && c % 3 == 0) {
            System.out.println("C = " + c);
            encontrou = true;
        }
        if (d % 2 == 0 && d % 3 == 0) {
            System.out.println("D = " + d);
            encontrou = true;
        }

        if (!encontrou) {
            System.out.println("Nenhum dos valores digitados e divisivel por 2 e por 3.");
        }

        entrada.close();
    }
}
