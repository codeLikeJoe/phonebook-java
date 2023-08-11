package com.phone;

public class Message {
    private String recipient;
    private String text;
    private int id;

    public Message(String name, String text, int id) {
        this.recipient = name;
        this.text = text;
        this.id = id;
    }

    public void getDetails() {
        System.out.println("Contact Name: " + recipient +
                "\nMessage: " + text +
                "\nID: " + id);
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
