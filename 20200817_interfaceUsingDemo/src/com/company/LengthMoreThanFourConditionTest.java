package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthMoreThanFourConditionTest {
    @Test
    public void test_LengthMoreThanFour_true(){
        String s="12345";
        Condition condition = new LengthMoreThanFourCondition();
        assertTrue(condition.test(s));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String s="123";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthEqualFour_false(){
        String s="1234";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }
    @Test
    public void test_EmptyString_false(){
        String s="";
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullString_false(){
        String s=null;
        Condition condition = new LengthMoreThanFourCondition();
        assertFalse(condition.test(s));
    }
}