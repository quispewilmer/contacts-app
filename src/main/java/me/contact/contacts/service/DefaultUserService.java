package me.contact.contacts.service;

import me.contact.contacts.model.User;
import me.contact.contacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class DefaultUserService implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(User user) throws Exception {
        if(checkIfUserExist(user.getEmail())) {
            throw new Exception("User already exists.");
        }

        User user = new User();

    }

    @Override
    public boolean checkIfUserExist(String email) {
        return false;
    }
}
