package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        PersonAddress address
                = new PersonAddress("adr1",AddressType.BILLING);
        System.out.println(address.getType());
        System.out.println(address.getType().equals(AddressType.POST));
        System.out.println(address.getType()==AddressType.POST);
        //System.out.println(address.getType()==AddressType.valueOf("email"));
        PersonAddress address1=null;
        try {
            address1
                    = new PersonAddress("adr1","EMAIL");

        } catch (Exception ex){}
        System.out.println(address1); //if type not correct the address would not create


        System.out.println("\n --------- print all possible AddressTypes ---------------");
        AddressType[] addressTypes=AddressType.values();
        for(int i = 0;i<addressTypes.length;i++){
            System.out.println(addressTypes[i]);
        }
        System.out.println(" ----------------------- \n");

        System.out.println(address.getType().test());
        System.out.println(address.getType());
        System.out.println("--------------------------");
        address.send();




    }



}
