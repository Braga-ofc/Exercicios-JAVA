package Lista2;

import java.util.Scanner;
public class atv3 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print("Qual o valor do produto? ");
        double ValProd = Entrada.nextDouble();

        System.out.println("\n1 - Estados Unidos");
        System.out.println("2 - França");
        System.out.println("3 - México");
        System.out.println("4 - Argentina");
        System.out.println("5 - China");

        System.out.print("\nEm qual país você reside? ");
        int Pais = Entrada.nextInt();
        
        double frete;
        String nomepais;

        switch (Pais) {
            case 1:
            frete = 60;
            nomepais = "Estados Unidos";
             break;

            case 2:
            frete = 75.50;
            nomepais = "França";
            break;

            case 3:
            frete = 50;
            nomepais = "México";
            break;

            case 4:
            frete = 27.35;
            nomepais = "Argentina";
            break;

            case 5:
            frete = 80;
            nomepais = "China";
            break;

            default: System.out.println("Opção inválida");
            return;
        }
    System.out.println("\nSeu País é: " + nomepais);
    System.out.println("\nSeu Frete ficou: " + frete);
    System.out.println("\nValor Total: " +67 (ValProd + frete));
    }
}