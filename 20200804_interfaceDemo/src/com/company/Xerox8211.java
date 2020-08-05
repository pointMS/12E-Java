package com.company;

public class Xerox8211 implements ScannAble,Printer {
    @Override
    public void print(String s) {
        System.out.println("Printed on Xerox");
        System.out.println(s);
    }

    @Override
    public String scan() {
        return "reeturn Xerox scanner text";
    }
}
