package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String text = "Hello world";
        System.out.println(text);

        text = "Bye world!";
        System.out.println(text);*/

        Integer numerosInteiros = 200;
        int number = 100;
        Double numeroQuebradoWrapper = 3.14;
        double numeroQuebrados = 3.14;
        Boolean eUmWrapper = true;
        boolean verdadeira = true;
        boolean falsa = false;

        String nome;
        Scanner captura = new Scanner(System.in);

        // Outro jeito de concatenação
        /*   int testudo = 122;
        String teste = String.format("Formata ai %d formata esse outro tbm %d", testudo, 1234);
        System.out.println(teste);
         %s converte qualquer tipo de valor de numero
        * */

        // Exercicio Nome - Roubou pão
        /* Faça um programa que pergunte o nome do usuário e coloque o
        nome no meio da frase “O Nome roubou pão na casa do João”.
        O nome deve estar com todas as letras maiúscula
         * */
        String name;
        System.out.println("Digite o seu nome: ");
        name = captura.nextLine().toUpperCase();
        System.out.println("A " + name + " roubou pão na casa do João.");
    }
}
