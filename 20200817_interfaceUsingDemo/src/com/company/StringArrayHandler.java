package com.company;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition=condition;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public void stringsHandle(){
        for (int i =0; i<strings.length;i++){
            if (condition.test(strings[i])){
                strings[i]=action.doAction(strings[i]);
            }
        }
    }
}
