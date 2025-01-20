package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Valor do Produto para ter o Desconto: ");
        float valor = sc.nextFloat();
        float desc = valor * 5 / 100;
        float total = valor - desc;
        System.out.print("Valor do Produto Sem Desconto: " + valor + "\n");
        System.out.print("Valor com 5% de Desconto: " + total);

    }
}
