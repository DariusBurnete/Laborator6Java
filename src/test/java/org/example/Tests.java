package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    void addPositive() {
        Calculator c = new Calculator(5);
        c.add(5);
        float result = c.value;
        assertEquals(10, result);
    }

    @Test
    void addNegative() {
        Calculator c = new Calculator(5);
        c.add(-5);
        float result = c.value;
        assertEquals(0, result);
    }

    @Test
    void subPositive() {
        Calculator c = new Calculator(11);
        c.sub(5);
        float result = c.value;
        assertEquals(6, result);
    }

    @Test
    void subNegative() {
        Calculator c = new Calculator(11);
        c.sub(-5);
        float result = c.value;
        assertEquals(16, result);
    }

    @Test
    void mulNegative() {
        Calculator c = new Calculator(11);
        c.mul(-5);
        float result = c.value;
        assertEquals(-55, result);
    }

    @Test
    void mulOver() {
        Calculator c = new Calculator(10);
        c.mul(1.25F);
        float result = c.value;
        assertEquals(12.5, result);
    }

    @Test
    void mulUnder() {
        Calculator c = new Calculator(10);
        c.mul(0.44F);
        float result = c.value;
        assertEquals(4.4, result);
    }

    @Test
    void divNegative() {
        Calculator c = new Calculator(12);
        c.div(-3);
        float result = c.value;
        assertEquals(-4, result);
    }

    @Test
    void divOver() {
        Calculator c = new Calculator(10);
        c.div(2.5F);
        float result = c.value;
        assertEquals(4, result);
    }

    @Test
    void divUnder() {
        Calculator c = new Calculator(10);
        c.div(0.25F);
        float result = c.value;
        assertEquals(40, result);
    }
}