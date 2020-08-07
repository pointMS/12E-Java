package com.company;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    /* // by Name
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //by name and age
    @Override
    public int compareTo(Person person) {
        int nameComparing = this.name.compareTo(person.name);
        return (nameComparing == 0) ?
                this.age - person.age : nameComparing;
    }


/* // by age
    @Override
    public int compareTo(Person person) {
        return this.age-person.age;
    }

 */


}
