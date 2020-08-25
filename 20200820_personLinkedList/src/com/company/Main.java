package com.company;
public class Main {

    public static void main(String[] args) {
        PersonLinkedList list = new PersonLinkedList();
        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));
        System.out.println(list);
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);

        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 6"));
        list.add(new Person("Person 3"));

        System.out.println("list before deleting 2");
        System.out.println(list);
        Person p = new Person("Person 4");
        System.out.println(list.find(p));
        System.out.println("----------------");
        list.remove(2);

        System.out.println(list);
    }
}
