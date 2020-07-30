package com.company;

public class Person {
    private String surname;
    private String firstName; //Иван ...... ""
    private String fatherName;

    public Person(String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.fatherName = secondName;
    }
    public Person(String surname, String firstName) {
        this(surname,firstName,"");
    }
    public Person(String surname) {
        this(surname,"","");
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + fatherName + '\'' +
                '}';
    }


    public String toShortString() {
        return surname +
                ((firstName.length()>0)?" "+firstName.substring(0,1)+".":firstName)+
                ((fatherName.length()>0)? fatherName.substring(0,1)+".": fatherName);
    }
}
