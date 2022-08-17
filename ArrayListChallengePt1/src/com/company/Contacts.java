package com.company;

public class Contacts {
    private String name;
    private long phoneNumber;

    public Contacts(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Phone Number= " + phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public Contacts setName(String name) {
        this.name = name;
        return null;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Contacts setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return null;
    }

}
