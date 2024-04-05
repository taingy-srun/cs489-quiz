package edu.miu.cs489.model;

public class PhoneNumber {
    private String phoneNo;
    private String label;

    public PhoneNumber() {
    }

    public PhoneNumber(String phone, String label) {
        this.phoneNo = phone;
        this.label = label;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phone='" + phoneNo + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public String toJSON() {
        return String.format("{" +
                "\"phoneNo\":\"%s\"," +
                " \"label\":\"%s\"}",
                phoneNo, label);
    }
}
