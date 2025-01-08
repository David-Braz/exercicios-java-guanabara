package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Seu Nome: ");
        String Nome = sc.nextLine();
        System.out.print("Digite Sue Salario: ");
        int Salario = sc.nextInt();
        System.out.print("Meu Nome é: " + Nome + "\n" + "Meu Salario é: " + Salario);

    }
}
