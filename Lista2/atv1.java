package Lista2;

import java.util.Scanner;
public class atv1 {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Escolha um número de 1 a 12: ");
        int Mes = Entrada.nextInt();
        
        switch (Mes) {
            case 1 -> System.out.println("Janeiro");

            case 2 -> System.out.println("Fevereiro");

            case 3 -> System.out.println("Março");

            case 4 -> System.out.println("Abril");

            case 5 -> System.out.println("Maio");
            
            default -> System.out.println("Número inválido");  
        }


    }
}