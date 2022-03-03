package me.contact.contacts.service;

import me.contact.contacts.model.User;

public interface UserService {
    void register(User user) throws Exception;

    boolean checkIfUserExist(String email);
}
