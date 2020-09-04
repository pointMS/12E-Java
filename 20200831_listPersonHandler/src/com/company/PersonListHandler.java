package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonListHandler {
    private static String type="email";

    public static List<String> personListHandler(List<Person> people){
        List<String> list=new ArrayList<>();
        if(people!=null){
            for (Person person: people){
                List<PersonAddress> tempAddressList = person.getAddresses(type);
                String nameString = person.getFirstName() + ' ' + person.getSecondName();
                for (PersonAddress adr : tempAddressList){
                    list.add(adr.getAddress()+' '+ nameString);
                }
            }
        }
        return list;
    }



    public static void setType(String type) {
        PersonListHandler.type = type;
    }
    /*
    public static List<String> personListHandler(List<Person> people){
        return personListHandler(people, "email");
    }

     */
}
