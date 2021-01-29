package com.company;

import java.util.Scanner;

public class RoubouPao {

    // Exercicio Nome - Roubou pão
        /* Faça um programa que pergunte o nome do usuário e coloque o
        nome no meio da frase “O Nome roubou pão na casa do João”.
        O nome deve estar com todas as letras maiúscula
         * */

    public static void main(String[] args){

        Scanner captura = new Scanner(System.in);

        String name;
        String genre;
        System.out.println("Digite o seu nome: ");
        name = captura.nextLine().toUpperCase();
        System.out.println(("Digite F para feminino ou M para masculino"));
        genre = captura.nextLine();
        if(genre.equals("M")){
            System.out.println("O " + name + " roubou pão na casa do João.");
        } else {
            System.out.println("A " + name + " roubou pão na casa do João.");

        }
    }
}
