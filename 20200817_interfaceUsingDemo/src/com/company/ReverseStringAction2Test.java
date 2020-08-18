package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringAction2Test {
    @Test
    public void doActionNormalStringShouldBeReversed(){
        String str = "1234";
        Action action = new ReverseStringAction2();
        assertEquals("4321",action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str = "";
        Action action = new ReverseStringAction2();
        assertEquals("",action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str = null;
        Action action = new ReverseStringAction2();
        assertNull(action.doAction(str));
    }

}