package edu.miu.cs489;

import edu.miu.cs489.model.Contact;

import java.util.Comparator;
import java.util.List;

public class ContactApp {

    public void printAllContacts(List<Contact> contacts) {
        StringBuilder sb = new StringBuilder();
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getLastname))
                .forEach(contact -> {
                    if (!sb.isEmpty()) sb.append(", ").append("\n");
                    sb.append(contact.toJSON());
                });
        System.out.println(sb);
    }
}
