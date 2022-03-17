/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.empresa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hector
 */
public class EmpregadoTest {
    
    public EmpregadoTest() {
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
    
    /**
     *
     */
    @Test
    public void obterSalarioAnualtest1(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",1000);
        double esperado;
        esperado=12000;
        double resultado;
        resultado=pepito.obterSalarioAnual();
        assertEquals(esperado,resultado);
        
    }
    
    /**
     * proba method obtersalarioanual
     */
    @Test
    public void obterSalarioAnualtest2(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",0);
        double esperado;
        esperado=0;
        double resultado;
        resultado=pepito.obterSalarioAnual();
        assertEquals(esperado,resultado);
        
    }
    
    @Test
    public void incrementarSalariotest1(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",1000);
        double esperado;
        double resultado;
        resultado=pepito.incrementarSalario(20);
        esperado=1200;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void incrementarSalariotest2(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",1100);
        double esperado;
        double resultado;
        resultado=pepito.incrementarSalario(20);
        esperado=1320;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void incrementarSalariotest3(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",0);
        double esperado;
        double resultado;
        resultado=pepito.incrementarSalario(20);
        esperado=0;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void incrementarSalariotest4(){
        Empregado pepito=new Empregado(01,"pepito","garcia","garcia",1100);
        double esperado;
        double resultado;
        resultado=pepito.incrementarSalario(0);
        esperado=1100;
        assertEquals(esperado,resultado);
    }
    
}
    