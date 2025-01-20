package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo14 {

    //A locadora de carros precisa da sua ajuda para cobrar seus serviços.
    // Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
    // Calcule o preço total a pagar, sabendo que o carro custa R
    //0,20 por Km rodado.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float valor_dia = 90;
        float valor_km = 0.2F;

        System.out.print("Quantos Dias Ficou com o Carro: ");
        int dias = sc.nextInt();
        System.out.print("Quantas KMs Foram Andados: ");
        int Kms = sc.nextInt();

        float calcular_dia = dias * valor_dia;
        float calcular_km = Kms * valor_km;
        float total_gasto = calcular_dia + calcular_km;
        System.out.print("Custo diario com o veiculo foi de: " + calcular_dia + "\n");
        System.out.print("Custo do valor da Kilometragem é de: " + calcular_km + "\n");
        System.out.print("Custo Total de Gasto foi de: " + total_gasto);

    }
}
