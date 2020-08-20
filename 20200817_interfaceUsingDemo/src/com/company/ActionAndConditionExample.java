package com.company;

import com.company.Action;
import com.company.Condition;

public class ActionAndConditionExample implements Condition, Action {
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str+"!" ;
    }

    @Override
    public boolean test(String str) {
        return str!=null;
    }
}
