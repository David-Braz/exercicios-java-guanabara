package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua Nota: ");
        double nt1 = sc.nextDouble();
        System.out.print("Digite sua Nota: ");
        double nt2 = sc.nextDouble();
        double Soma = nt1 + nt2;
        double media = Soma / 2;
        System.out.print("Sua média é: " + media);
    }
}
