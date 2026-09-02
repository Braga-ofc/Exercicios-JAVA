package Lista2;

import java.util.Scanner;
public class atv4 {
    public static void main(String[] args){
        
        //Variáveis
        String Produto;
        int cod;
        double valor;

        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("100 - Cachorro Quente (R$ 1,20)");
        System.out.println("101 - Bauru Simples(R$ 1,30 )");
        System.out.println("102 - Bauru com Ovo (R$ 1,50)");
        System.out.println("103 - Hambúrguer (R$ 1,20)");
        System.out.println("104 - Cheeseburguer (R$ 1,30)");
        System.out.println("105 - Refrigerante (R$ 1,00)");

        System.out.print("\nEscolha o código do produto? ");
        cod = Entrada.nextInt();

        switch (cod) {
            case 100:
                Produto = "Cachorro Quente";
                valor = 1.20;
                break;

            case 101:
                Produto = "Bauru Simples";
                valor = 1.30;
                break;

            case 102:
                Produto = "Bauru com Ovo";
                valor = 1.50;
                break;

            case 103:
                Produto = "Hambúrguer";
                valor = 1.20;
                break;

            case 104:
                Produto = "Cheeseburguer";
                valor = 1.30;
                break;

            case 105:
                Produto = "Refrigerante";
                valor = 1.00;
                break;

            default: System.out.println("Opção inválida");
            return;
        }
        System.out.print("Qual a quantidade de " + Produto + " que você deseja? ");
        int quantidade = Entrada.nextInt();
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: R$ " + (valor * quantidade));
    }
}