package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<>();
    private boolean quit;

    public MobilePhone() {
        this.quit = false;
        ArrayList<Contacts> contacts = new ArrayList<>();
    }

    public void printContacts(){
        System.out.println("There are " + contacts.size() + " contacts in list.");
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1)+ ". " + contacts.get(i));
        }
    }

    public void addContact(String name, long phoneNumber){
        Contacts contact = new Contacts(name, phoneNumber);
        contacts.add(contact);
        System.out.println("You have added " + contact.getName() + " to the contact list.");
    }

    public void findContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            if (Objects.equals(name, contacts.get(i).getName())) {
                System.out.println("Contact " + contacts.get(i).getName() + " was found.");
                break;
            }
        }
    }

    public void updateContact(String existingContact,String newContactName, long newContactNum){
        for (Contacts contact : contacts) {
            if (Objects.equals(existingContact, contact.getName())) {
                var object = contact;
                var oldObject = new Contacts(object.getName(), object.getPhoneNumber());
                object.setName(newContactName);
                object.setPhoneNumber(newContactNum);
                System.out.println("Contact Updated from " + oldObject + "\nTo: " + object);
            }
        }
    }

    public void removeContact(String existingContact){
        for(int i = 0; i<contacts.size();i++){
            if(Objects.equals(existingContact,contacts.get(i).getName())){
                var object = contacts.get(i);
                contacts.remove(object);
                System.out.println("Contact '"+ object.getName() +"' has been removed");
            }
        }
    }

}
