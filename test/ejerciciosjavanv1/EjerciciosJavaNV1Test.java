/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class EjerciciosJavaNV1Test {
    
    public EjerciciosJavaNV1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of maximos method, of class EjerciciosJavaNV1.
     */
    @Test
    public void testMaximos() {
        System.out.println("maximos");
        int[] lista = null;
        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
    }

    /**
     * Test of esPalindromo method, of class EjerciciosJavaNV1.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String frase = "";
        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
        assertEquals(true, instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.esPalindromo("aca"));
        assertEquals(false, instance.esPalindromo("Acaso"));
        assertEquals(false, instance.esPalindromo("feo caraculo"));
        assertEquals(false, instance.esPalindromo("ligar es agil"));
        assertEquals(true, instance.esPalindromo("alli ves a Sevilla"));
        assertEquals(true, instance.esPalindromo("allí ves a Sevilla"));
    }

    /**
     * Test of esIsogramas method, of class EjerciciosJavaNV1.
     */
    @Test
    public void testEsIsogramas() {
        System.out.println("esIsogramas");
        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
        assertEquals(true, instance.esIsogramas("murcielago"));
        assertEquals(true, instance.esIsogramas("ajos"));
        assertEquals(false, instance.esIsogramas("ojo"));
        assertEquals(true, instance.esIsogramas("pera"));
        assertEquals(false, instance.esIsogramas("perro"));
        assertEquals(true, instance.esIsogramas("vaso"));
        assertEquals(false, instance.esIsogramas("botella"));
        assertEquals(true, instance.esIsogramas("cuadro"));
        assertEquals(false, instance.esIsogramas("perejil"));
        assertEquals(false, instance.esIsogramas("cocreta"));
        assertEquals(false, instance.esIsogramas("cuadra"));
        assertEquals(true, instance.esIsogramas("cubo"));
        assertEquals(false, instance.esIsogramas("Cocreta"));
        assertEquals(false, instance.esIsogramas("isódroma"));
    }

//    /**
//     * Test of quitaAcentos method, of class EjerciciosJavaNV1.
//     */
//    @Test
//    public void testQuitaAcentos() {
//        System.out.println("quitaAcentos");
//        String cadena = "";
//        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
//        String expResult = "";
//        String result = instance.quitaAcentos(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of quitaAcentosVersion2 method, of class EjerciciosJavaNV1.
//     */
//    @Test
//    public void testQuitaAcentosVersion2() {
//        System.out.println("quitaAcentosVersion2");
//        String cadena = "";
//        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
//        String expResult = "";
//        String result = instance.quitaAcentosVersion2(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of divideFrase method, of class EjerciciosJavaNV1.
//     */
//    @Test
//    public void testDivideFrase() {
//        System.out.println("divideFrase");
//        String frase = "";
//        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
//        String[] expResult = null;
//        String[] result = instance.divideFrase(frase);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of acronimo method, of class EjerciciosJavaNV1.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        String frase_ = "";
        EjerciciosJavaNV1 instance = new EjerciciosJavaNV1();
        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        assertEquals("CETS", instance.acronimo("Centro de Estudios Tecnologicos y Sociales"));
        assertEquals("OMS", instance.acronimo("Organizacion Mundial de la Salud"));
        assertEquals("UFV", instance.acronimo("Universidad Francisco de Vitoria"));
        assertEquals("ESO", instance.acronimo("educacion secundaria obligatoria"));
        assertEquals("ITV", instance.acronimo("inspeccion tecnica de vehiculos"));
        assertEquals("OTAN", instance.acronimo("organizacion trato atlantico norte"));
        assertEquals("OTAN", instance.acronimo("organizacion trato atlantico  norte"));
       
    }

    
}
