package me.contact.contacts.repository;

import me.contact.contacts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User, Long> {
}
