package com.company;

import java.util.function.Predicate;

public class LengthEvenPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if(s==null) return false;
        return s.length()%2==0;
    }
}
