package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Valor: ");
        int Num1 = sc.nextInt();
        System.out.print("Digite o Segundo Valor: ");
        int Num2 = sc.nextInt();
        int Soma = Num1 + Num2;
        System.out.print("A Soma dos Valore é: " + Soma);
    }
}
