package Lista2;

import java.util.Scanner;

/*
 * Questao 16 - Macas: R$ 0,30 cada se comprar menos de uma duzia;
 * R$ 0,25 cada se comprar pelo menos doze.
 */
public class atv16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== VENDA DE MACAS ===");
        System.out.println("Menos de 12 unidades ..: R$ 0,30 cada");
        System.out.println("12 unidades ou mais ...: R$ 0,25 cada");
        System.out.print("Digite a quantidade de macas compradas: ");
        int quantidade = entrada.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida! Informe um valor maior que zero.");
        } else {
            double precoUnitario;

            if (quantidade < 12) {
                precoUnitario = 0.30;
            } else {
                precoUnitario = 0.25;
            }

            double total = quantidade * precoUnitario;

            System.out.println();
            System.out.printf("Quantidade ......: %d maca(s)%n", quantidade);
            System.out.printf("Preco unitario ..: R$ %.2f%n", precoUnitario);
            System.out.printf("VALOR TOTAL .....: R$ %.2f%n", total);
        }

        entrada.close();
    }
}
