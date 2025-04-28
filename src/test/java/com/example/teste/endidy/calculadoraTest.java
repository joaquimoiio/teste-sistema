package com.example.teste.endidy;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class calculadoraTest {
    @InjectMocks
    private calculadora calculadora;
    @BeforeEach
    void setup(){
        calculadora = new calculadora();
    }

    @Test
    void testSoma(){
        double resultado = calculadora.soma(2,3);
    }

    @Test
    void testSubtracao(){
        double resultado = calculadora.subtracao(2,3);
        assertEquals(-1,resultado);
    }
    @Test
    void testMultiplicacao(){
        double resultado = calculadora.multiplicacao(2,3);
        assertEquals(6,resultado);
    }

    @Test
    void testDivisao(){
        double resultado = calculadora.divisao(2,4);
        assertEquals(0.5,resultado);
    }

    @Test
    void testDivisaoPorZero(){
        assertThrows(ArithmeticException.class, () ->
                calculadora.divisao(2,0));
    }

    @Test
    void testPotencia(){
        double resultado = calculadora.potencia(2,3);
        assertEquals(8,resultado);
    }
    @Test
    void testRaiz(){
        double resultado = calculadora.raiz(4);
        assertEquals(2,resultado);
    }

    @Test
    void testRaizNegativo(){
        assertThrows(ArithmeticException.class, () ->
            calculadora.raiz(-4));
        }
    @Test
    void testFatorial(){
        double resultado = calculadora.fatorial(4);
        assertEquals(24,resultado);
    }

    @Test
    void testFatorialNegativo(){
        assertThrows(ArithmeticException.class, () ->
                calculadora.fatorial(-4));
    }

    @Test
    void testMedia(){
        double [] numeros = {1,2,3,4,5};
        double resultado = calculadora.media(numeros);
        assertEquals(3, resultado);
    }

}
