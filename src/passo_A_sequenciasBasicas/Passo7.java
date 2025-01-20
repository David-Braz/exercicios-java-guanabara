package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dite um número Real: ");
        float Num = sc.nextFloat();
        float Mult = Num * 2;
        float TreePart = Num / 3;
        System.out.print("O Dobra do Número escolhido é: " + Mult +"\n" + "A Terceira Parte do Número escolhido é: " + TreePart);
    }
}
