package com.company;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class EvenOperatorTest {
    @Test
    public void apply_string_evenCharsString(){
        UnaryOperator<String> operator= new EvenOperator();
        assertEquals("2468",operator.apply("12345678"));
    }

    @Test
    public void apply_null_null(){
        UnaryOperator<String> operator= new EvenOperator();
        assertNull(operator.apply(null));
    }

    @Test
    public void apply_emptyString_emptyString(){
        UnaryOperator<String> operator= new EvenOperator();
        assertEquals("",operator.apply(""));
    }

    @Test
    public void apply_oneCharString_String(){
        UnaryOperator<String> operator= new EvenOperator();
        assertEquals("",operator.apply("1"));
    }

}