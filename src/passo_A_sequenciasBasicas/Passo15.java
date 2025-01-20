package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo15 {
    public static void main(String[] args){
        int dias_trabalhado,total_horas;
        float  Salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto dia foram Trabalhados: ");
        dias_trabalhado = sc.nextInt();
        total_horas = dias_trabalhado * 8;
        Salario = total_horas * 25;
        System.out.print("O Salario é: " + Salario);
    }
}
