
package co.edu.uniminuto;

import javax.swing.JOptionPane;


public class EjercicioNo12 {

    /**
     * 12. Realizar un programa que genere una matriz 5x5, inicializarla en 2 e imprimirla.
     */
    public static void main(String[] args) {
        // Declaracion de la variable
        // Declaración de variables 
        // casteo de datos -> String a Short
        short fila = 5;
        short columna = 5;
        while (fila == 2);
        short[][] arrayBidimen = new short[fila][columna];
        for (int i=0;i<fila; i++){
            for (int j=0;j<columna; j++){
                arrayBidimen [i][j] = 2;
            }
            
        }for (int i=0;i<fila; i++){
            for (int j=0;j<columna; j++){
                System.out.print(arrayBidimen[i][j]+" ");
            }
            System.out.println("");
        }

    }

}
   
    

