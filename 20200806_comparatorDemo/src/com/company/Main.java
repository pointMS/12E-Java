package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        Person[] people = {new Person("Jack",67),
                    new Person("Nick 12",25),
                    new Person("John 123",80),
                    new Person("Anna 1456",18),
                    new Person("Nick 1",18),
                    new Person("Anna 100",23),
        };


        // Comparator
        Comparator<Person> typeOfSorting;
        int key=3;
        switch (key){
            case 1: // sort by age
                System.out.println("sort by age: ");
                typeOfSorting = new PersonComparatorByAge();
                Arrays.sort(people,typeOfSorting);
                break;
            case 2: // sort by name
                System.out.println("sort by name: ");
                typeOfSorting = new PersonComparatorByName();
                Arrays.sort(people,typeOfSorting);
                break;
            case 3: // sort by name length
                System.out.println("sort by name length: ");
                typeOfSorting = new PersonComparatorByNameLength();
                Arrays.sort(people,typeOfSorting);
                break;
            /*
            case 4:
                Arrays.sort(people,(o1,o2)->o1.getAge()-o2.getAge());
                break;
            */

            default:
                System.out.println("sort by default: ");
                Arrays.sort(people);   // use Comparable
        }
        System.out.println(Arrays.toString(people));

    }
}
