
package co.edu.uniminuto;

import java.util.Scanner;


public class EjercicioNo9 {

/**
9. Leer N cantidad de notas (validar rango de notas), 
imprimir el promedio de las
notas, la nota más alta y la más baja.
*/
    public static void main(String[] args) {
        // Declaracion de la variable 
        Scanner leer = new Scanner (System.in);
        double notas = 0;
        double cantidadNotas = 0 ;
        double sumaNotas = 0;
        double notaAlta = Integer.MIN_VALUE;
        double notaBaja = Integer.MAX_VALUE;
        double promedioNotas = 0;
        System.out.println("Digite la cantidad de notas que desea analizar");
        cantidadNotas = leer.nextDouble();
        for (int i = 0 ; i <cantidadNotas ; i++){
            System.out.println("Digite la nota " + ( i + 1) + ": ");
            notas = leer.nextDouble();
            sumaNotas+= notas; 
            if (notas > notaAlta){
            notaAlta = notas;
        }
        if (notas < notaBaja)
            notaBaja = notas;
        
        }
    promedioNotas = sumaNotas / cantidadNotas;
        System.out.println("La nota más alta es: "+notaAlta);
        System.out.println("La nota más baja es: "+notaBaja);
        System.out.println("El promedio de las notas es: "+promedioNotas );
        
        }
            
    }
    

