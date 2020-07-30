package com.company;

public abstract class Card {
    private Person person;
    private String number;

    public Card(Person person, String number) {
        this.person = person;
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public String getNumber() {
        return number;
    }

    public abstract String toSecureString();

    }

