package com.company;
import java.util.Arrays;


        /*
        String[]
        Иванов Иван Иванович
        Николаев Николай
        Петрова

        -> Person[]
        Иванов И.И.
        Николаев Н.
        Петрова

         */



public class Main {

    public static void main(String[] args) {
	    String[] names= {
	            "Иванов Ивван Иванович",
                "Перров Петр",
                "Николаев",
                "Сидоров Джон Иванович"
        };

	    Person[] persons= getPersonFromArrayOfString(names);
        System.out.println(Arrays.toString(persons));
        System.out.println("-----------------------------");
        printPersons(persons);
    }
    public static Person[] getPersonFromArrayOfString(String[] names){
        Person[] persons=null;
        if(names!=null) {
            persons = new Person[names.length];
            for (int i=0;i<names.length;++i){
                String[] nameStrings = names[i].split(" ");
                switch (nameStrings.length){
                    case 1: persons[i] = new Person(nameStrings[0]);break;
                    case 2: persons[i] = new Person(nameStrings[0],nameStrings[1]);break;
                    case 3: persons[i] = new Person(nameStrings[0],nameStrings[1],nameStrings[2]);break;
                }
            }

        }
        return persons;
    }

    public static void printPersons(Person[] persons){
        for(Person p:persons){
            System.out.println(p.toShortString());
        }
    }

}
