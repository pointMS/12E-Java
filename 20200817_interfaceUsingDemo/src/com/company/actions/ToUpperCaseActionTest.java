package com.company.actions;

import com.company.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseActionTest {
    @Test
    public void doActionNormalStringShouldBeUpperCase(){
        String str = "qweRTyuiIOPйё-.фыв";
        Action action = new ToUpperCaseAction();
        assertEquals("QWERTYUIIOPЙЁ-.ФЫВ",action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldReturnEmptyString(){
        String str = "";
        Action action = new ToUpperCaseAction();
        assertEquals("",action.doAction(str));
    }

    @Test
    public void doActionNullShouldReturnNull(){
        String str = null;
        Action action = new ToUpperCaseAction();
        assertNull(action.doAction(str));
    }

}