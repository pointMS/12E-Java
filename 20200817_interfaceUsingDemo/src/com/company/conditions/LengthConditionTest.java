package com.company.conditions;

import com.company.Condition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConditionTest {
    @Test
    public void test_LengthMoreThanFour_true(){
        String s="12345";
        Condition condition = new LengthCondition(4);
        assertTrue(condition.test(s));
    }

    @Test
    public void test_LengthLessThanFour_false(){
        String s="123";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_LengthEqualFour_false(){
        String s="1234";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }
    @Test
    public void test_EmptyString_false(){
        String s="";
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }

    @Test
    public void test_NullString_false(){
        String s=null;
        Condition condition = new LengthCondition(4);
        assertFalse(condition.test(s));
    }
    @Test
    public void test_LengthMoreThanZero_true(){
        Condition condition = new LengthCondition(0);
        boolean res=(condition.test("1")==true)&&
                (condition.test("123")==true)&&
                (condition.test("")==false) &&
                (condition.test(null)==false);

        assertTrue(res);
    }

}