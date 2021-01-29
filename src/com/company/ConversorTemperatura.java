package com.company;

import java.util.Scanner;

public class ConversorTemperatura {
    //Exercício conversão de temperaturas

        /*Escreva um programa que, com base em uma temperatura em graus celsius,
        a converta e exiba em Kelvin (K), Réaumur (Re),
        Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67
         */

    public static void main(String[] args){

        Scanner captura = new Scanner(System.in);

        double tempCelsius;
        System.out.println("Digite uma temperatura em Celsius");
        tempCelsius = captura.nextDouble();
        double conversaoFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempCelsius + " em Celsius equivale à " + conversaoFahrenheit + " Fahrenheit (F)");
        double conversaoKelvin = tempCelsius + 273.15;
        System.out.println(tempCelsius + " em Celsius equivale à " + conversaoKelvin + " Kelvin (K) " );
        double conversaoReaumur = tempCelsius * 0.8;
        System.out.println(tempCelsius + " em Celsius equivale à " + conversaoReaumur + " Reaumur (Re) " );
        double conversaoRankine = (tempCelsius * 1.8) + 32 + 459.67;
        System.out.println(tempCelsius + " em Celsius equivale à " + conversaoRankine + " Rankine (Ra) " );
    }
}
