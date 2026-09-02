package Lista2;

import java.util.Scanner;
public class atv5 {
    public static void main(String[] args){

        Scanner Entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int num = Entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " É um número par.");
        } else {
            System.out.println(num + " É um número ímpar.");
        }
    }
}