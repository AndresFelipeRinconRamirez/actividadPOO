package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo15 {

    /**
     * Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente
     * con los números impares partiendo desde n (n es dada por el usuario) y se
     * imprima.
     */
    public static void main(String[] args) {
        // Declaracion de la variable 
        int numero;
        int valorNumero = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un numero");
        numero = leer.nextInt();
        int[][] arrayBidimen = new int[5][6];
        valorNumero = numero;
        for (int i = 0; i < arrayBidimen.length; i++) {
            for (int j = 0; j < arrayBidimen[i].length; j++) {
                arrayBidimen[i][j] = valorNumero;
                valorNumero += 2;
            }
        }
        System.out.println("La matriz que se genera es: ");
        for (int i = 0; i < arrayBidimen.length; i++) {
            for (int j = 0; j < arrayBidimen[i].length; j++) {
                System.out.print(arrayBidimen[i][j] + " ");
            }
            System.out.println();
        }
    }
}

