package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    void setCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    void sumar() {
        assertEquals(10, calculadora.sumar(6,4));
    }

    @Test
    void restar() {
        assertEquals(24, calculadora.restar(6,4));
    }

    @Test
    void multiplicar() {
        assertEquals(24, calculadora.multiplicar(6,4));
    }
}