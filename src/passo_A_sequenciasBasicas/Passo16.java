package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos Cigarros você fuma: ");
        int total_cigarro = sc.nextInt();
        System.out.print("Quantos Anos já Fumou: ");
        int total_anos = sc.nextInt();
        int total_dias = total_anos * 365;
        int total_fumado = total_cigarro * total_dias;
        int total_perdido = total_fumado * 10;
        int dias = total_perdido / 60 / 24;
        System.out.print("Você perdeu aproximadamente: " + dias + " de Dias.");

    }
}
