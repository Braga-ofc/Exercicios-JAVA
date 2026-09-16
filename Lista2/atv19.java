package Lista2;

import java.util.Scanner;

/*
 * Questao 19 - Aprovacao de emprestimo bancario: aprovar caso o valor da parcela
 * represente no maximo 30% do salario do solicitante.
 */
public class atv19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== ANALISE DE EMPRESTIMO BANCARIO ===");
        System.out.print("Digite o valor do emprestimo (R$): ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Digite o numero de parcelas: ");
        int numeroParcelas = entrada.nextInt();

        System.out.print("Digite o salario do solicitante (R$): ");
        double salario = entrada.nextDouble();

        if (valorEmprestimo <= 0 || numeroParcelas <= 0 || salario <= 0) {
            System.out.println("Dados invalidos! Todos os valores devem ser maiores que zero.");
        } else {
            double valorParcela = valorEmprestimo / numeroParcelas;
            double limite = salario * 0.30;

            System.out.println();
            System.out.printf("Valor da parcela ........: R$ %.2f%n", valorParcela);
            System.out.printf("Limite (30%% do salario) .: R$ %.2f%n", limite);

            if (valorParcela <= limite) {
                System.out.println("RESULTADO: EMPRESTIMO APROVADO!");
            } else {
                System.out.println("RESULTADO: EMPRESTIMO NEGADO!");
            }
        }

        entrada.close();
    }
}
