package Lista2;

import java.util.Scanner;

/*
 * Questao 11 - Ler tres valores inteiros (A, B e C) e apresenta-los em ordem crescente.
 */
public class atv11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== ORDEM CRESCENTE DE TRES INTEIROS ===");
        System.out.print("Digite o valor de A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = entrada.nextInt();

        int aux;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.printf("Valores em ordem crescente: %d, %d, %d%n", a, b, c);

        entrada.close();
    }
}
