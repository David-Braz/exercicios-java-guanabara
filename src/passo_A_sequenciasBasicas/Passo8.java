package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Distancia em Metros: ");
        double mt, cm, km, dc, ht;
        mt = sc.nextDouble();
        cm = mt * 100;
        km = mt / 1000;
        dc = mt / 10;
        ht = mt / 100;

        System.out.println("Centímetros: " + cm);
        System.out.println("Quilômetros: " + km);
        System.out.println("Decâmetros: " + dc);
        System.out.println("Hectômetros: " + ht);
    }
}