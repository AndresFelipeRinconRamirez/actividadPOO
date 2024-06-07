
package co.edu.uniminuto;

import java.util.Scanner;

public class EjercicioNo2 {

/*
2.Hacer un programa en Java que cuente y sume 
los múltiplos de 5 y 3 (para ser
sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
comprendidos entre 1
y n (n es determinado por el usuario). 
Imprimir la cantidad de múltiplos de 5 y 3.
*/  
    public static void main(String[] args) {
        // Declaracion de la variable 
        Scanner leer = new Scanner(System.in);
        int numero;
        int multiplosDe3 = 0;
        int multiplosDe5 = 0;
        int sumaMultiplos = 0;
        int cantidadMultiplos = 0;
        //Lectura de numero
        System.out.println("Dame un numero:");
        numero = leer.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sumaMultiplos+=i;
                cantidadMultiplos++;
            } 
            else if (i % 3 == 0) {
                multiplosDe3++;
            } else if (i % 5 == 0) {
                multiplosDe5++;
            
        }
        
    
        }
        System.out.println("La cantidad de multiplos de 3 que estan entre 1 y " + numero + " es: " + multiplosDe3);
        System.out.println("La cantidad de multiplos de 5 que estan entre 1 y " + numero + " es: " + multiplosDe5);
        System.out.println("La suma de los multiplos de 3 y 5 entre 1 y " + numero + " es: " + (multiplosDe3+multiplosDe5));
        
    }
    }


        
    
        /* for (int i=0; i<arrayRandom.length;i++){
            arrayRandom [i] = random.nextInt(150)-99;
            }
        for (int numero : arrayRandom){
            if ( numero > 0 ){
            cantidadPositivos++;
            }
        
        
        
/*        for ( int i=1;i<=numero;i++);{
        if(numero %3==0 && numero %5==0 ){
            multiplosTres+=numero;
            System.out.println("lo numeros multiplos de 3 son : "+numero);
            multiplosTres++;
        } else if (numero % 3 == 0) {
                System.out.println(" es múltiplo de 3"+numero);
            } else if (numero % 5 == 0) {
                System.out.println(" es múltiplo de 5"+numero);
        
 }*/    
       

