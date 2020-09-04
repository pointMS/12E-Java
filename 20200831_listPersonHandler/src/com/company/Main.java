package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("first1", "second1");
        p1.addAddress(new PersonAddress("adr1","post"));
        p1.addAddress(new PersonAddress("adr2","billing"));
        p1.addAddress(new PersonAddress("adr3","email"));
        p1.addAddress(new PersonAddress("adr4","email"));

        Person p2 = new Person("first2", "second2");
        p2.addAddress(new PersonAddress("2adr1","post"));
        p2.addAddress(new PersonAddress("2adr2","billing"));
        p2.addAddress(new PersonAddress("2adr3","email"));
        p2.addAddress(new PersonAddress("2adr4","email"));

        Person p3 = new Person("first3", "second3");
        p3.addAddress(new PersonAddress("3adr1","post"));
        p3.addAddress(new PersonAddress("3adr2","billing"));
        p3.addAddress(new PersonAddress("3adr3","email"));
        p3.addAddress(new PersonAddress("3adr4","email"));

        List<Person> people=new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(PersonListHandler.personListHandler(people));


        PersonListHandler.setType("post");





    }



}
