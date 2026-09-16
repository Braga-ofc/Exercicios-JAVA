package Lista2;

import java.util.Scanner;

/*
 * Questao 17 - Calcular o peso ideal a partir da altura e do sexo.
 * Homens:   (72.7 * altura) - 58
 * Mulheres: (62.1 * altura) - 44.7
 */
public class atv17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CALCULO DO PESO IDEAL ===");
        System.out.print("Digite a altura em metros (ex: 1.75): ");
        double altura = entrada.nextDouble();

        System.out.println("Informe o sexo:");
        System.out.println("  1 - Feminino");
        System.out.println("  2 - Masculino");
        System.out.print("Opcao: ");
        int sexo = entrada.nextInt();

        if (altura <= 0) {
            System.out.println("Altura invalida! Informe um valor maior que zero.");
        } else if (sexo == 1) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal (feminino): %.2f kg%n", pesoIdeal);
        } else if (sexo == 2) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal (masculino): %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Opcao invalida! Digite 1 para feminino ou 2 para masculino.");
        }

        entrada.close();
    }
}
