package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Descubra o Valor antecessor e sucessor do Número escolhido!!!");
        System.out.print("\n"+"Digite um Número: ");
        int Num = sc.nextInt();
        int ant = Num - 1;
        int dep = Num + 1;
        System.out.print("O Número Anterior é: " + ant + "\n" + "O Número Posterior é: " + dep);
    }
}
