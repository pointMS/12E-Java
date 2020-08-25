package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> list = new ArrayList<>(100);
	    ArrayList<String> arrayList = new ArrayList<>();


        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add(0,"str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");

        System.out.println(list);
        if(list.size()>7) {
            System.out.println(list.get(7));
        }
        System.out.println("---------------- FOR ---------------");
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.remove(0);


        System.out.println(list.size());
        System.out.println("---------------- FOR-EACH ---------------");
        for (String s:list){
            System.out.println(s);
        }

        System.out.println("---------- Sort list");
        list.sort(new StringComparator());
        System.out.println(list);

        System.out.println(list.indexOf("str6"));

        List<Person> people = new ArrayList<>();
        Person person = new Person("Jack2");
        people.add(new Person("Jack1"));
        people.add(new Person("Jack2"));
        people.add(new Person("Jack3"));

        System.out.println(people.indexOf(person));
    }
}
