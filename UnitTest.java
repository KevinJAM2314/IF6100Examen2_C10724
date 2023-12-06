/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cr.go.ucr.test;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    
    public UnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testNotSuma(){
       OperacionAritmetica context = new OperacionAritmetica( new Sumar() );
       assertEquals(context.procesar(-1,1), -1);
    }
    
    public void testSuma(){
       OperacionAritmetica context = new OperacionAritmetica( new Sumar() );
       assertNotEquals(context.procesar(1,2), -1);
    }   
    
    public void testNotResta(){
       OperacionAritmetica context = new OperacionAritmetica( new Resta() );
       assertEquals(context.procesar(2,3), -2);
    }
    
    public void testRestaNegativa(){
       OperacionAritmetica context = new OperacionAritmetica( new Resta() );
       assertEquals(context.procesar(-2,1), -1);
    }
    
    public void testResta(){
       OperacionAritmetica context = new OperacionAritmetica( new Resta() );
       assertNotEquals(context.procesar(4,4), -2);
    }
    
    public void testNotDivision(){
       OperacionAritmetica context = new OperacionAritmetica( new Division() );
       assertEquals(context.procesar(2,0), -3);
    }
    
    public void testDivisionNegtiva(){
       OperacionAritmetica context = new OperacionAritmetica( new Division() );
       assertEquals(context.procesar(7,-1), -1);
    }
    
    public void testDivision(){
       OperacionAritmetica context = new OperacionAritmetica( new Division() );
       assertNotEquals(context.procesar(10,2), -3);
    }

    public void testDivision2(){
       OperacionAritmetica context = new OperacionAritmetica( new Division() );
       assertNotEquals(context.procesar(0,5), -3);
    }
    
    public void testNotMultiplicacion(){
       OperacionAritmetica context = new OperacionAritmetica( new Multiplicacion() );
       assertEquals(context.procesar(4,-3), -1);
    }
    
    public void testMultiplicacion(){
       OperacionAritmetica context = new OperacionAritmetica( new Multiplicacion() );
       assertNotEquals(context.procesar(4,3), -1);
    }  
}
