package com.company;

import java.util.Scanner;

public class ConversorMoedas {
    // Exercício Conversão Reais em Dólar

    public static void main(String[] args){

        Scanner captura = new Scanner(System.in);

        double valorReais;
        double valorDolar = 5.33;

        System.out.println("Digite uma quantia em reais");
        valorReais = captura.nextDouble();
        double conversao = valorReais / valorDolar;
        System.out.println("O valor R$ " + valorReais + " equivale à " + conversao + " dolares");
    }
}
