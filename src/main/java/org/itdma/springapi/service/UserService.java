package org.itdma.springapi.service;


import org.itdma.springapi.dto.UserRequestDto;
import org.itdma.springapi.entity.User;
import org.itdma.springapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /// Create User
    public User createUser(UserRequestDto dto) {
        User user = new User();

        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        user.setCreatedOn(dto.getCreatedOn());
        user.setIsactive(dto.getIsactive());

        return userRepository.save(user);
    }

    /// Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(int userId){
        return userRepository.findById(userId).get();
    }

    public User updateUser(UserRequestDto dto, int userId){
        User u= userRepository.findById(userId).get();

            u.setName(dto.getName());
            u.setSurname(dto.getSurname());
            u.setUsername(dto.getUsername());
            u.setEmail(dto.getEmail());
            u.setPassword(dto.getPassword());
            u.setRole(dto.getRole());
            u.setCreatedOn(dto.getCreatedOn());
            u.setIsactive(dto.getIsactive());
            return userRepository.save(u);
    }

    public String deleteUserById(int userId){
        userRepository.deleteById(userId);
        return "User Deleted Successfully";
    }
}
