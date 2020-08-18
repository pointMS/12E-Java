package com.company;

public class ToUpperCaseAction implements Action {

    @Override
    public String doAction(String str) {
        return str.toUpperCase();
    }
}
