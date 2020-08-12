package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ArrayBookingListTest {

    @Test
    public void getSortedByNameArrayTest(){
        Booking b1=new Booking(
                new StandardRoom("1",2),
                new Person("Nick3"),
                new DateInterval(new MyDate(30,7,2020),
                        new MyDate(10,8,2020))
        );


        Booking b2=new Booking(
                new SuiteRoom("2",2),
                new Person("Nick1"),
                new DateInterval(new MyDate(11,8,2020),
                        new MyDate(13,8,2020))
        );


        Booking b3=new Booking(
                new SuiteRoom("3",2),
                new Person("Nick2"),
                new DateInterval(new MyDate(11,8,2020),
                        new MyDate(13,8,2020))
        );
        BookingList bookingList = new ArrayBookingList(3);

        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        Comparator<Booking> comparator= new BookingComparatorByName();
        Booking[] resArray=bookingList.getSortedArray(comparator);
        Booking[] shouldArray= {b2,b3,b1};
        Assert.assertArrayEquals(resArray,shouldArray);

    }


}
