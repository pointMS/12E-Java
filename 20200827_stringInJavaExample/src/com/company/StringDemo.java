package com.company;

public class StringDemo {

    public static void main(String[] args) {
     // StringPool
     // interning
     // immutable

            String s="hello";
            String s1="hello";
            String s2=new String("hello");

        // s has the same reference as s1 but not the same as s2
        System.out.println(s==s1);          // true
        System.out.println(s==s2);          // false
        // the text values of s and s1 and s2 are equals
        System.out.println(s.equals(s1));   // true
        System.out.println(s.equals(s2));   // true


        System.out.println("---------------------------------");
        s=s.toUpperCase();
        System.out.println(s==s1); //true or false?
        // false, because s is a new String not same as s1



        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder= new StringBuilder();



    }

}
