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
     * ejercicio nivel1 ejer 1.
     *
     * @param args the command line arguments
     */
    int[] listaNumeros = {50, 31, 27, 2, 5, 99};

    public int[] maximos(int[] lista) {
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
     * ejercicio nivel1 ejer 2. Metódo para quitar los espacios en blanco a un
     * String.
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

    /**
     *
     * @param cadena el string limpiar return el string sin acentos
     * @return
     */
    public String quitaAcentos(String cadena) {
        //pájaro
        //pajaro
        //cadena = cadena.toLowerCase();
        cadena = cadena.replace('á', 'a');
        cadena = cadena.replace('é', 'e');
        cadena = cadena.replace('í', 'i');
        cadena = cadena.replace('ó', 'o');
        cadena = cadena.replace('ú', 'u');
        cadena = cadena.replace('ü', 'u');
        return cadena;

    }

    /**
     *
     * @param cadena
     * @return
     */
    public String quitaAcentosVersion2(String cadena) {
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'á':
                    auxiliar = auxiliar + 'a';
                    break;
                case 'é':
                    auxiliar = auxiliar + 'e';
                    break;
                case 'í':
                    auxiliar = auxiliar + 'i';
                    break;
                case 'ó':
                    auxiliar = auxiliar + 'o';
                    break;
                case 'ú':
                    auxiliar = auxiliar + 'u';
                    break;
                case 'ü':
                    auxiliar = auxiliar + 'u';
                    break;
                default:
                    auxiliar = auxiliar + cadena.charAt(i);
                    break;
            }
        }

        return auxiliar;
    }

    public boolean esPalindromo(String frase) {

        //Este programa devuelve verdadero si la frase tiene los mismos caracteres 
        // de izquierda a derecha y de derecha a izquierda.
        //1º Quitamos los espacios en blanco.
        String auxiliar = quitaEspaciosBlancos(frase);

        //2º Pasamos a minusculas toda la frase.
        auxiliar = auxiliar.toLowerCase();

        //3º Quitamos las tildes si existen.
        auxiliar = quitaAcentosVersion2(frase);

        //Voy a usar el metodo de los indices.
        int indiceIzquierdo = 0;
        int indiceDerecho = auxiliar.length() - 1;
        while (auxiliar.charAt(indiceIzquierdo) == auxiliar.charAt(indiceDerecho) && indiceIzquierdo <= indiceDerecho) {
            indiceDerecho--;
            indiceIzquierdo++;
        }

        if (indiceIzquierdo < indiceDerecho) {

            //Se ha salido antes de llegar al medio, por lo tanto no es palindromo.
            return false;
        } else {
            return true; //Si que es palindromo porque los indices se han cruzado.   
        }
    }

    public boolean esIsogramas(String palabra) {

        //Este metodo devuelve true si la palabra no tiene ninguna letra repetida
        // y false si se repite alguna.
        //MURCIELAGO.
        palabra = palabra.toLowerCase();
        palabra = quitaAcentos(palabra);
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i + 1; j < palabra.length(); j++) {
                if (palabra.charAt(i) == palabra.charAt(j)) {
                    return false;
                }
            }
        }

        //Si ha recorrido los dos bucles sin sair en el return false, es porque la palabra no tiene
        // letras repetidas.
        return true;
    }

    /**
     * @param frase
     * @return Creamos metodo para crear anagramas. Este metodo recibe un String
     * formado por arias palabras y devuelve una array de String por ejemplo: (
     * "Alta" "Velocidad" "Española"). Esta verion solo se usara en ñas
     * practicas no en la vida real.
     */
    public String[] divideFrase(String frase) {
        frase = frase + " "; //Metodo paco, añadir un espacio en blanco al final,
        // para que funcione el for con todas las plabras.
        String auxiliar = "";

        //1º Averiguamos cuantos espacios en blanco tiene la frase.
        int numeroEspaciosBlancos = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                numeroEspaciosBlancos++;
            }
        }

        //Mas uno en numeroEspaciosBlancos para que me coja la ultima palabra.
        String[] dividido = new String[numeroEspaciosBlancos];
        int contadorPalabra = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                dividido[contadorPalabra] = auxiliar;
                auxiliar = "";
                contadorPalabra++;
            } else {
                auxiliar = auxiliar + frase.charAt(i);
            }
        }

        return dividido;
    }

    /**
     * Recibe una y devuelve su acornimo (la primera letra de cada palabra que
     * forma la frase).
     *
     * @param frase_
     * @return
     */
    public String acronimo(String frase_) {
        frase_ = frase_.toUpperCase();
        String[] palabras = divideFrase(frase_);
        String auxiliar = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) { //Para evitar el problema de las palabras vacias.
                if (!(palabras[i].equals("Y") || palabras[i].equals("E") || palabras[i].equals("DE") || palabras[i].equals("DEL") || palabras[i].equals("LA"))) {
                    auxiliar = auxiliar + palabras[i].charAt(0);
                }
            }
        }

        return auxiliar;
    }

    public static void main(String[] args) {
        EjerciciosJavaNV1 ejercicio = new EjerciciosJavaNV1();
        System.out.println("Los maximos son: " + Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));

        System.out.println("palíndromo: " + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("palíndromo: " + ejercicio.esPalindromo("esto no es"));
        System.out.println("palíndromo: " + ejercicio.esPalindromo("A mamá Roma le aviva el amor a papá y a papá Roma le aviva el amor a mamá"));
        System.out.println("palíndromo: " + ejercicio.esPalindromo("Amad a la dama"));

        System.out.println("La palabra murcielago " + ejercicio.esIsogramas("murcielago"));
        System.out.println("La palabra careta " + ejercicio.esIsogramas("careta"));
        System.out.println("La palabra ajos " + ejercicio.esIsogramas("ajos"));

        System.out.println(Arrays.toString(ejercicio.divideFrase("Alta Velocidad Española")));
    }
}
