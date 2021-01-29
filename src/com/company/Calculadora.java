package com.company;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        int numero;
        System.out.println("Digite dois números inteiros");
        numero = captura.nextInt();
        int segundoNumero = captura.nextInt();

        int total = numero + segundoNumero;
        System.out.println("O valor da soma é " + total);

        int totalSubtracao = numero - segundoNumero;
        System.out.println("O valor da subtração do primeiro valor com o segundo é: " + totalSubtracao);

        int totalMuliplicacao = numero * segundoNumero;
        System.out.println("O resultado da multiplicação com os valores informados é: " + totalMuliplicacao);

        int totalDivisao = numero / segundoNumero;
        System.out.println("O resultado do primeiro valor dividido pelo segundo é: " + totalDivisao);
    }
}
