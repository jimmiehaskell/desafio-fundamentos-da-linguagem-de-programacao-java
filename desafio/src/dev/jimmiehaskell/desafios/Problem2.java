/*
* O código para solução do problema no site da dio era:
* 
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A, B, media;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        
        //TODO: Complete os espaços em branco com uma possível solução para o desafio 
        media = ((A * 3.5) + (B * 7.5))/11; 
        
        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
        }
        }
        *
        * Resolvi fazer de modo diferente para fixar o aprendizado
        * incluíndo a possibilidade de interação com o usário e a
        * possibilidade de valores diferentes.
        */
        
package dev.jimmiehaskell.desafios;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int soma;

        System.out.println("Enter the first number:");
        numberOne = scanner.nextInt();

        System.out.println("Enter the secound number:");
        numberTwo = scanner.nextInt();

        soma = numberOne + numberTwo;

        System.out.println("SOMA = " + soma);
        scanner.close();
    }
}
