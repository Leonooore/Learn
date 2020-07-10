package learn.contactsandmessagesapp;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private ArrayList<Message> messages;

    public Contact(String name, String phone, String email, ArrayList<Message> messages) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.messages = messages;
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.messages = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("Name: " + this.name +
                "\nPhone number: " + this.phone +
                "\nEmail: " + this.email );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
