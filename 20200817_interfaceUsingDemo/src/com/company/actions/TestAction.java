package com.company.actions;

import com.company.Action;

public class TestAction implements Action {
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return "test";
    }
}
