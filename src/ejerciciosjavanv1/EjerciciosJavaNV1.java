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

    private int[] maximos(int[] lista) {
        int[] maximos = {0, 0};
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maximos[0]) {
                maximos[1] = maximos[0];
                maximos[0] = lista[i];
            } else if (lista[i] > maximos[1]) {
                maximos[1] = lista[i];
            }
        }

        return maximos;
    }

    /**
     * Metódo para quitar los espacios en blanco a un String.
     */
    private String quitaEspaciosBlancos(String cadena) {

        //Acaso hubo buhos aca.
        //Acasohubobuhosaca.
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }

        return auxiliar;
    }

    public boolean esPalindromo(String frase) {

        //Este programa devuelve verdadero si la frase tiene los mismos caracteres 
        // de izquierda a derecha y de derecha a izquierda.
        String auxiliar = quitaEspaciosBlancos (frase);
        return false; //No es palindromo.
    }

    public static void main(String[] args) {
        EjerciciosJavaNV1 ejercicio = new EjerciciosJavaNV1();
        System.out.println("Los maximos son: " + Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));

        System.out.println("palíndromo: " + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("palíndromo: " + ejercicio.esPalindromo("esto no es"));
    }
}
