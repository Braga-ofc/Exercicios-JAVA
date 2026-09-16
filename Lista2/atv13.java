package Lista2;

import java.util.Scanner;

/*
 * Questao 13 - Ler um valor inteiro e apresenta-lo caso NAO seja maior que 3.
 * Dica do enunciado: utilizar apenas o operador logico de negacao (!).
 */
public class atv13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== VALOR QUE NAO E MAIOR QUE 3 ===");
        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        // Usando o operador de negacao: "nao e maior que 3"
        if (!(numero > 3)) {
            System.out.println("Valor lido: " + numero);
        } else {
            System.out.println("O valor digitado e maior que 3, portanto nao sera apresentado.");
        }

        entrada.close();
    }
}
