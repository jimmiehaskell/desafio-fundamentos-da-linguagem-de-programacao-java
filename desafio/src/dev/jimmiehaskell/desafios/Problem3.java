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

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne;
        double numberTwo;
        double media = 0;

        System.out.println("Enter the first number:");
        numberOne = scanner.nextInt();

        System.out.println("Enter the secound number:");
        numberTwo = scanner.nextInt();

        if (numberOne <= 10 && numberTwo <= 10) {
            media = ((numberOne * 3.5) + (numberTwo * 7.5))/11;
            System.out.printf("MEDIA = %.5f\n", media);
        } else {
            System.out.println("Valores inválidos.");
        }

        scanner.close();
    }
}
