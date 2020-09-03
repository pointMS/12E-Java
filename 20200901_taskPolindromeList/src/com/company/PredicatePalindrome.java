 package com.company;

import java.util.function.Predicate;

public class PredicatePalindrome implements Predicate<String> {

    @Override
    public boolean test(String s) {
        if (s == null) return false;
        return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);
    }
}
