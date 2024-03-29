package com.challenge.invoice.service;

import com.challenge.invoice.entity.User;
import com.challenge.invoice.exception.MessageException;
import com.challenge.invoice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(User user) throws MessageException {
        if (repository.findByEmail(user.getEmail()).isPresent()) {
            throw new MessageException("Email já utilizado");
        }
        return repository.save(user);
    }

}
