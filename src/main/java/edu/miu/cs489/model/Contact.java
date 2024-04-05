package edu.miu.cs489.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private Long contactId;
    private String firstname;
    private String lastname;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumberList;
    private List<EmailAddress> emailAddressList;

    public Contact() {
    }

    public Contact(Long contactId, String firstname, String lastname, String company, String jobTitle) {
        this.contactId = contactId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.jobTitle = jobTitle;
        this.emailAddressList = new ArrayList<EmailAddress>();
        this.phoneNumberList = new ArrayList<PhoneNumber>();
    }

    public void addPhone(PhoneNumber phoneNumber) {
        this.phoneNumberList.add(phoneNumber);
    }

    public void addEmail(EmailAddress emailAddress) {
        this.emailAddressList.add(emailAddress);
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddress> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumberList=" + phoneNumberList +
                ", emailAddressList=" + emailAddressList +
                '}';
    }

    public String toJSON() {
        return String.format("{\"contactId\":%s," +
                        " \"firstname\":\"%s\"," +
                        " \"lastname\":\"%s\"," +
                        " \"company\":\"%s\"," +
                        " \"jobTitle\":\"%s\"," +
                        " \"phoneNumberList\":%s," +
                        " \"emailAddressList\":%s}",
                contactId, firstname, lastname, company, jobTitle, phoneListInJSON(), emailListInJSON());
    }

    public String phoneListInJSON() {
        StringBuilder sb = new StringBuilder();
        phoneNumberList
                .forEach(phoneNumber -> {
                    if(!sb.isEmpty()) sb.append(", ");
                    sb.append(phoneNumber.toJSON());
                });
        return sb.toString();
    }

    public String emailListInJSON() {
        StringBuilder sb = new StringBuilder();
        emailAddressList
                .forEach(emailAddress -> {
                    if(!sb.isEmpty()) sb.append(", ");
                    sb.append(emailAddress.toJSON());
                });
        return sb.toString();
    }
}
