package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo9 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite Seu valor na Carteira: ");
        double Saldo = sc.nextDouble();
        double valorDolar = Saldo * 3.45;
        if(Saldo < 3.45) {
            System.out.print("Saldo na Carteira Insuficiente!");
            return;
        }
        String result = String.format("%.2f", valorDolar);
        System.out.print("Seu Saldo em Dolar é: " + result );
    }
}
