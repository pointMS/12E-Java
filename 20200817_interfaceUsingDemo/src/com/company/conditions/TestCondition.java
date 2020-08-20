package com.company.conditions;

import com.company.Condition;

public class TestCondition implements Condition {
    @Override
    public boolean test(String str) {
        return str!=null&&str.length()>2;
    }
}
