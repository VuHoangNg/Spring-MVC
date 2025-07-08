package vn.vproject.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.vproject.laptopshop.domain.User;
import vn.vproject.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    public User handleSaveUser(User user) {
        User vproject = this.userRepository.save(user);
        System.out.println(vproject);
        return vproject;
    }
}
