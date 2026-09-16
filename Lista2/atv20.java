package Lista2;

import java.util.Scanner;

/*
 * Questao 20 - Calculo do IMC (peso / altura^2) com classificacao
 * diferente para homens e mulheres, conforme as tabelas do enunciado.
 */
public class atv20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.print("Digite o seu peso em kg (ex: 70,5): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a sua altura em metros (ex: 1,75): ");
        double altura = entrada.nextDouble();

        System.out.println("Informe o sexo:");
        System.out.println("  1 - Masculino");
        System.out.println("  2 - Feminino");
        System.out.print("Opcao: ");
        int sexo = entrada.nextInt();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Dados invalidos! Peso e altura devem ser maiores que zero.");
        } else if (sexo != 1 && sexo != 2) {
            System.out.println("Opcao invalida! Digite 1 para masculino ou 2 para feminino.");
        } else {
            double imc = peso / (altura * altura);
            String classificacao;

            if (sexo == 1) {
                // Tabela IMC para HOMENS
                if (imc < 17) {
                    classificacao = "Muito abaixo do peso";
                } else if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc < 25) {
                    classificacao = "Peso normal";
                } else if (imc < 30) {
                    classificacao = "Acima do peso";
                } else if (imc < 35) {
                    classificacao = "Obesidade grau I";
                } else if (imc <= 40) {
                    classificacao = "Obesidade grau II";
                } else {
                    classificacao = "Obesidade grau III";
                }
            } else {
                // Tabela IMC para MULHERES
                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc < 25) {
                    classificacao = "Peso ideal (parabens)";
                } else if (imc < 30) {
                    classificacao = "Levemente acima do peso";
                } else if (imc < 35) {
                    classificacao = "Obesidade grau I";
                } else if (imc <= 40) {
                    classificacao = "Obesidade grau II (severa)";
                } else {
                    classificacao = "Obesidade grau III (morbida)";
                }
            }

            System.out.println();
            System.out.println("---------- RESULTADO ----------");
            System.out.printf("Sexo ...........: %s%n", (sexo == 1 ? "Masculino" : "Feminino"));
            System.out.printf("IMC calculado ..: %.2f kg/m2%n", imc);
            System.out.printf("Classificacao ..: %s%n", classificacao);
        }

        entrada.close();
    }
}
