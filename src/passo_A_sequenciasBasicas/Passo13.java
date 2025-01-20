package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo13 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float Salario,Aumento,Total;
        System.out.print("Digite Seu Salário: ");
        Salario = sc.nextFloat();
        Aumento = Salario * 15 / 100;
        Total = Aumento + Salario;
        System.out.print("Salario antigo é: " + Salario + "\n");
        System.out.print("Novo Salario com 15% de aumento é:  " + Total);
    }
}
