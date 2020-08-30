package com.company;

import java.util.function.UnaryOperator;

public class EvenOperator implements UnaryOperator<String>{
    @Override
    public String apply(String s) {                 // String -> StringBuffer -> String
        if(s==null) return null;                    //       -> StringBuilder ->
        StringBuilder sRes= new StringBuilder(s.length());
        for (int i=1;i<s.length();i+=2){
            sRes.append(s.charAt(i));
        }
        return sRes.toString();
    }
}
