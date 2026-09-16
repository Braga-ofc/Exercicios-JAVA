package Lista2;

import java.util.Scanner;

/*
 * Questao 14 - Ler um numero inteiro, multiplica-lo por dois e apresentar
 * o resultado somente se for maior que 30.
 */
public class atv14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MULTIPLICACAO POR DOIS ===");
        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        int resultado = numero * 2;

        if (resultado > 30) {
            System.out.println("Resultado da multiplicacao: " + resultado);
        } else {
            System.out.println("O resultado nao e maior que 30, portanto nao sera apresentado.");
        }

        entrada.close();
    }
}
