package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

    }

    public static List<String> listHandler(List<String> list,
                                           Predicate<String> predicate,
                                           UnaryOperator<String> operator){
        List<String> resList= new ArrayList<>();
        for (String s: list){
            if(predicate.test(s)){
                resList.add(operator.apply(s));
            }
        }

        return resList;
    }
}
