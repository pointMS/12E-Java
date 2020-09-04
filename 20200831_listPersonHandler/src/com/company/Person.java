package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<PersonAddress> addresses;

    public Person(String firstName, String secondName, List<PersonAddress> addresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addresses = addresses;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<PersonAddress> getAddresses() {
        return new ArrayList<>(addresses);
    }

    public List<PersonAddress> getAddresses(String type) {
       if(type.equals("email")||
               type.equals("post")||
               type.equals("billing")){
           return getAddresses(AddressType.valueOf(type.toUpperCase()));
       }
        return new ArrayList<>();
    }

    public List<PersonAddress> getAddresses(AddressType type){
        List<PersonAddress> res=new ArrayList<>();
        for (PersonAddress address: addresses){
            //if(address.getType().equals(type.name().toLowerCase())){
            if(address.getTypeAsEnum().equals(type)){
                res.add(address);
            }
        }
        return res;
    }

    public void addAddress(PersonAddress address){
        if(address!=null){
            if(addresses==null){
                addresses= new ArrayList<>();
            }
            addresses.add(address);
        }
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName +    addresses;
    }
}
