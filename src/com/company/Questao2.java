package com.company;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo;
        double valorparcial, valorfinal;
        double valor;
        System.out.println("Informe o tipo de operação: (1) Poupança  (2) Fundos de renda fixa ");
        tipo = sc.nextInt();
        if (tipo == 1) {
            System.out.println("Informe o valor a ser investido: ");
            valor = sc.nextInt();
            valorparcial = valor * 0.03;
            valorfinal = valorparcial + valor;
            System.out.println("O valor corrigido da sua poupança é: " + valorfinal);
        }else if (tipo == 2) {
            System.out.println("Informe o valor a ser investido: ");
            valor = sc.nextInt();
            valorparcial = valor * 0.04;
            valorfinal = valor + valorparcial;
            System.out.println("O valor corrigido do seu fundo de renda fixa é: " + valorfinal);
        }else{
            System.out.println("OPERAÇÃO INDISPONÍVEL");

        }
        System.out.println("OBRIGADO POR USAR NOSSO SISTEMA");
    }
}
