
package co.edu.uniminuto;

import java.util.Scanner;


public class EjercicioNo8 {

/*8. Dado N cantidad de precios de gaseosas en un supermercado el gerente de ventas
desea que se genere un programa que le permita saber cuál de las gaseosas tiene
el mayor precio, cuál tiene menor precio y cuál es el precio promedio. Hacer las
impresiones según lo requerido
*/
    public static void main(String[] args) {
        // Declaraciòn de la variable 
        Scanner leer = new Scanner(System.in);
        double precioMayor = Integer.MIN_VALUE ;
        double precioMenor = Integer.MAX_VALUE;
        double sumaPrecios = 0;
        double cantidadPrecios = 0;
        double precio = 0;
        double precioPromedios = 0;
        System.out.println("Digite el numero de gaseosas que desea organizar");
        cantidadPrecios = leer.nextInt();
        for (int i = 0; i < cantidadPrecios; i++) {
        System.out.print("Ingrese el precio de la gaseosa " + (i + 1) + ": ");
        precio = leer.nextDouble();
        sumaPrecios+=precio;
        if (precio > precioMayor){
            precioMayor = precio;
        }
        if (precio<precioMenor)
            precioMenor = precio;
        
        }
    precioPromedios = sumaPrecios / cantidadPrecios; 
        System.out.println("El precio mayor es: "+ precioMayor);
        System.out.println("El precio menor es : "+ precioMenor);
        System.out.println("El precio promedio es: "+ precioPromedios);
    }
    
}
