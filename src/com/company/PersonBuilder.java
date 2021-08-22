package com.company;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Введен некорректный возраст");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не заполнено одно из обязательных полей");
        }
        Person person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}