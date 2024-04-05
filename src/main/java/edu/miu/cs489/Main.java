package edu.miu.cs489;

import edu.miu.cs489.model.Contact;
import edu.miu.cs489.model.EmailAddress;
import edu.miu.cs489.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact david = new Contact(123122L, "David", "Sanger", "Argos LLC", "Sales Manager");
        david.addPhone(new PhoneNumber("240-133-0011", "Home"));
        david.addPhone(new PhoneNumber("240-112-0123", "Mobile"));
        david.addEmail(new EmailAddress("dave.sang@gmail.com", "Home"));
        david.addEmail(new EmailAddress("dsanger@argos.com", "Work"));

        Contact carlos = new Contact(123123L, "Carlos", "Jimenez", "Zappos", "Director");

        Contact ali = new Contact(123124L, "Ali", "Gafar", "BMI Services", "HR Manager");
        ali.addPhone(new PhoneNumber("412-116-9988", "Work"));
        ali.addEmail(new EmailAddress("ali@bmi.com", "Work"));

        List<Contact> contactList = new ArrayList<Contact>();
        contactList.add(david);
        contactList.add(carlos);
        contactList.add(ali);

        ContactApp contactApp = new ContactApp();
        contactApp.printAllContacts(contactList);
    }
}