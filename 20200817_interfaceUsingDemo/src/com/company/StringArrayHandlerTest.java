package com.company;

import com.company.actions.TestAction;
import com.company.conditions.TestCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayHandlerTest {
    @Test
    public  void stringsHandle_normalCase(){
        String[] strings={"123","qwerty","123456","14",""};
        String[] expectedArr = {"test","test","test","14",""};
        StringArrayHandler stringArrayHandler=
                new StringArrayHandler(strings,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr,stringArrayHandler.getStrings());
    }

    @Test
    public  void stringsHandle_nullAction_nothing(){
        String[] strings={"123","qwerty","123456","14",""};
        String[] expectedArr={"123","qwerty","123456","14",""};
        StringArrayHandler stringArrayHandler=
                new StringArrayHandler(strings,
                       null,
                        new TestCondition());
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr,stringArrayHandler.getStrings());
    }
    @Test
    public  void stringsHandle_nullCondition_doActionForAll(){
        String[] strings={"123","qwerty","123456","14",""};
        String[] expectedArr={"test","test","test","test","test"};
        StringArrayHandler stringArrayHandler=
                new StringArrayHandler(strings,
                        new TestAction(),
                        null);
        stringArrayHandler.stringsHandle();
        assertArrayEquals(expectedArr,stringArrayHandler.getStrings());
    }

    @Test
    public  void stringsHandle_nullArray_nothing(){

        StringArrayHandler stringArrayHandler=
                new StringArrayHandler(null,
                        new TestAction(),
                        new TestCondition());
        stringArrayHandler.stringsHandle();
        assertNull(stringArrayHandler.getStrings());
    }
}