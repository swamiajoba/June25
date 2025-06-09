package com.bean;

import javax.persistence.Embeddable;

@Embeddable
public class MyContacts {
    private String contactId;

    public MyContacts() {
    }

    public MyContacts(String contactId) {
        this.contactId = contactId;
    }



    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        return "MyContacts{" +

                " contactId='" + contactId + '\'' +
                '}';
    }
}
