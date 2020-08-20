package com.company.actions;

import com.company.Action;

public class ToUpperCaseAction implements Action {

    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str.toUpperCase();
    }
}
