
package co.edu.uniminuto;

import java.util.Scanner;


public class EjercicioNo1 {

/* Hacer un programa en Java que sume los siguientes 
25 impares que le siguen al
número n (n es determinado por el usuario)
Imprimir los 25 impares y la suma.
*/
    
public static void main(String[] args) {
        // Declaracion de variables 
        Scanner leer = new Scanner(System.in);
        int numero;
        int acumaladorImpares = 0;
        int contadorImpares = 0;
        // Lectura de numero
        System.out.println("Dame un numero:");
        numero = leer.nextInt();
        while (contadorImpares < 25 ){
            numero++;
            if (numero % 2 !=0){
            acumaladorImpares+=numero;
                System.out.print(numero+" "); 
                contadorImpares++;
            }
        }  
        System.out.println("Suma:"+ acumaladorImpares);           
    }
    
}
