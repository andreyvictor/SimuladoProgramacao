package com.company;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float primeiraNota;
        float segundaNota;
        float notaFinal;
        System.out.println("Informe a sua primeira nota: ");
        primeiraNota = scanner.nextFloat();
        System.out.println("Informe a sua segunda nota: ");
        segundaNota=scanner.nextFloat();
        notaFinal=(primeiraNota+segundaNota)/2;
        if (notaFinal<=3){
            System.out.println("Infelizmente, você está REPROVADO!");
        }else if (notaFinal>3 && notaFinal<=7){
            System.out.println("Você partipará do EXAME!");
        }else{
            System.out.println("Parabéns, você foi APROVADO!");
        }
    }
}
