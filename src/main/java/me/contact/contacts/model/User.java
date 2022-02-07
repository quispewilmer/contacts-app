package me.contact.contacts.model;

public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private String photo;

    public User() {
    }

    public User(String username, String password, String phoneNumber, String photo) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
