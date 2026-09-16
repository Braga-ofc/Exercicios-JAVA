package Lista2;

import java.util.Scanner;

/*
 * Questao 18 - Empresa XKW: bonus de 20% do salario para quem tem 5 anos ou mais
 * de empresa e de 10% para os demais.
 */
public class atv18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== EMPRESA XKW - CALCULO DE BONUS ===");
        System.out.print("Digite o salario do funcionario (R$): ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o tempo de servico na empresa (em anos): ");
        int tempoServico = entrada.nextInt();

        if (salario < 0 || tempoServico < 0) {
            System.out.println("Valores invalidos! Salario e tempo de servico nao podem ser negativos.");
        } else {
            double percentual;

            if (tempoServico >= 5) {
                percentual = 0.20;
            } else {
                percentual = 0.10;
            }

            double bonus = salario * percentual;

            System.out.println();
            System.out.printf("Tempo de servico ..: %d ano(s)%n", tempoServico);
            System.out.printf("Percentual do bonus: %.0f%%%n", percentual * 100);
            System.out.printf("VALOR DO BONUS ....: R$ %.2f%n", bonus);
        }

        entrada.close();
    }
}
