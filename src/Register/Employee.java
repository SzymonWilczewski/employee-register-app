package Register;

import java.util.*;

public abstract class Employee {
    private final String id;
    private String name;
    private String surname;
    private int age;
    private int experience;
    private Address address;

    public Employee(String name, String surname, int age, int experience, Address address) {
        this.id = UUID.randomUUID().toString();
        setName(name);
        setSurname(surname);
        setAge(age);
        setExperience(experience);
        setAddress(address);
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public int getAge() { return age; }

    public int getExperience() { return experience; }

    public Address getAddress() { return address; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract int getValue();

    public void print() {
        System.out.printf("%s %s\nAge: %s, Experience: %s, City: %s\n", this.name, this.surname, this.age, this.experience, this.address.getCity());
    }
}
