package me.contact.contacts.model;

import me.contact.contacts.annotation.validation.MatchPasswords;
import me.contact.contacts.annotation.validation.ValidPhone;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@MatchPasswords
public class User {
    @NotNull
    @NotEmpty
    private String username;

    @NotNull
    @NotEmpty
    @ValidPhone
    private String phoneNumber;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String repeatPassword;

    private String photo;

    public User() {
    }

    public User(String username, String phoneNumber, String password, String repeatPassword, String photo) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
