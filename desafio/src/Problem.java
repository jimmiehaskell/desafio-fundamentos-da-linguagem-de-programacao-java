/*
 * O código para solução do problema no site da dio era:
 * 
 * // Abaixo segue um exemplo de código que você pode ou não utilizar
 * import java.util.Scanner;
 *
 *  public class Problem {
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		
		    int A, B, PROD;
		
		    A = sc.nextInt();
		    B = sc.nextInt();
		    //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		    PROD = A*B;

		    System.out.println("PROD = " + PROD);
	    }
    }
 *
 * Resolvi fazer de modo diferente para fixar o aprendizado
 * incluíndo a possibilidade de interação com o usário e a
 * possibilidade de valores diferentes.
 */

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        int PROD;

        System.out.println("Enter the first number:");
        numberOne = scanner.nextInt();

        System.out.println("Enter the secound number:");
        numberTwo = scanner.nextInt();

        PROD = numberOne * numberTwo;

        System.out.println("PROD = " + PROD);
        scanner.close();
    }
}
