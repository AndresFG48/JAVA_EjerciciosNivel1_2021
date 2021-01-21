/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv1;

import java.util.Arrays;

/**
 *
 * @author Andrés
 */
public class EjerciciosJavaNV1 {
    
    /*
    Ejemplo de como hacer un array y que busque el numero mayor de la lista.
     //Declaro un array de integers para hacer pruebas.
    int[] listaNumeros = {333, 31, 200, 20, 5, 99};
    
    public int maximo (int[] lista) {
        int auxiliar = lista[0]; //El maximo va a ser el primer elemento del array.
        
        for (int i = 0; i< lista.length; i++) {
            if (auxiliar < lista[1]) {
                auxiliar = lista[1];
            }
        }
        return auxiliar;
    }
    */
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        EjerciciosJavaNV1 ejercicio = new EjerciciosJavaNV1();
        System.out.println(ejercicio.maximo(ejercicio.listaNumeros));
        
        
    }
    */
     /**
     * @param args the command line arguments
     */
    int[] listaNumeros = {50, 31, 27, 2, 5, 99};
    
    private int[] maximos (int[] lista) {
        int[] auxiliar = {lista[0], lista[0]};
        
        for (int i = 0; i < lista.length; i++) {
           if (auxiliar[0] < lista[1]) {
               auxiliar[0] = lista[1];   
            } 
           else if (auxiliar [1] < lista[1]) {
               auxiliar[1] = lista[1];
           }
        }
        
        return auxiliar;
    }
    
     public static void main(String[] args) {
        EjerciciosJavaNV1 ejercicio = new EjerciciosJavaNV1();
        System.out.println(Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
     }
}
