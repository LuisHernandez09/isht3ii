/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis
 */
public class palindromoTest {
    
    public palindromoTest() {
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
     * Test of main method, of class palindromo.
     */
   @Test
    public void Prueba1() {
        System.out.println("Prueba 1 palabra correcta");
        String input = "zxywyxz";
        boolean expectedResult = true;
        boolean actualResult = palindromo.evaluate(input);
        assertEquals(expectedResult, actualResult);
        
    }
    
    @Test
    public void Prueba2() {
        System.out.println("Prueba 2 sin caracteres");
        
        // given
        String input = "";
        boolean expectedResult = true;
        
        
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    @Test   
    public void Prueba3() {
        System.out.println("Prueba 3 con tabulaciones");
        
        // given
        String input = "oso          oso";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    @Test
    public void Prueba4() {
        System.out.println("Prueba 4 un caracter");
        
        // given
        String input = "x";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
    @Test   
    public void Prueba5() {
        System.out.println("Prueba 5 espacio en blanco");
        
        // given
        String input = "oso oso";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }

    
    
    @Test   
    public void Prueba6() {
        System.out.println("Prueba 6 cadena extensa");
        
        // given
        String input = "el oso de la calle come mucha miel";
        boolean expectedResult = false;
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    
     @Test   
    public void Prueba7() {
        System.out.println("Prueba 7 con saltos de linea");
        
        // given
        String input = "oso"
                + " oso";
        boolean expectedResult = true;
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
        assertEquals(expectedResult, actualResult);

    }
    

    @Test(expected=IllegalArgumentException.class)
    public void Prueba8() {
        System.out.println("Prueba 8 cadena null");
        
        // given
        String input = null;
        //throw expectedResult = throw new IllegalArgumentException("You can't pass a null String as input.");
                
        // when
        boolean actualResult = palindromo.evaluate(input);

        // then
    }
    
   
    
    
    
}
