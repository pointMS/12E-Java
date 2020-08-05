package com.company;

public class Main {

    public static void main(String[] args) {
       Canon5400 p1=new Canon5400();
       Canon5400 p2=new Canon5400();
       Xerox8211 p3 = new Xerox8211();

       printString("hello interface", p3);

    }

    // we use the Printer interface as a type of argument
    public static void printString(String s, Printer p){
        p.print(s);
    }



}
