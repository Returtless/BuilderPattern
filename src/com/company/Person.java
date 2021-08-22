package com.company;

import java.util.Optional;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public void happyBirthday() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAge(0);
    }

    @Override
    public String toString() {
        final StringBuilder s = new StringBuilder(surname + " " + name);
        if (hasAddress() && hasAge()) {
            s.append(", ").append(age).append(", ").append(address);
        } else if (hasAge()) {
            s.append(", ").append(age);
        } else if (hasAddress()) {
            s.append(", ").append(address);
        }
        return s.toString();
    }
}
