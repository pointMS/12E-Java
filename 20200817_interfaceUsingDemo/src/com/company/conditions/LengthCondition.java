package com.company.conditions;

import com.company.Condition;

public class LengthCondition implements Condition {
    private int length;

    public LengthCondition(int length) {
        this.length = length;
    }

    @Override
    public boolean test(String str) {
        return str!=null&&str.length()>length;
    }
}
