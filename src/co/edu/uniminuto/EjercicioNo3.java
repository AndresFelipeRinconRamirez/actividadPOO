
package co.edu.uniminuto;

import java.util.Scanner;


public class EjercicioNo3 {

    /**
     * 3.Hacer un programa en Java que, dado un rango, 
     * por el usuario, se da número inicial y uno final (tomar en cuenta 
     * que el inicial debe ser menor que el final, hacer
     la validación y volver a pedir los dos números si no cumple 
     * la condición) y sumelos números pares dentro del rango 
     * incluyendo el valor inicial y final.
     */
    public static void main(String[] args) {
        // Declaracion de la variable
        Scanner leer = new Scanner(System.in);
        int numeroInicial; 
        int numeroFinal;
        int sumaPares = 0;
        do {
            System.out.print("Ingrese el número inicial que desea para el rango del rango: ");
            numeroInicial = leer.nextInt();

            System.out.print("Ingrese el número final del rango: ");
            numeroFinal = leer.nextInt();

            if (numeroInicial >= numeroFinal) {
                System.out.println("Error, el número inicial debe ser menor que el número final. Inténtelo de nuevo.");
            }
        } while (numeroInicial >= numeroFinal);
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) { 
                sumaPares += i; 
            }
        }

        System.out.println("La suma de los números pares entre " + numeroInicial + " y " + numeroFinal + " es: " + sumaPares);
    }
}
    
    
