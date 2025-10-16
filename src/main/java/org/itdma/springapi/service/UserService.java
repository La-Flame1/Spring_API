package org.itdma.springapi.service;

import org.itdma.springapi.api.model.User;
    import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {

        /// Sample Data
        userList = new ArrayList<>();

        User user1 = new User(1, "John", "Doe", "john", "", "123456", "user", "2020-01-01", true);
        User user2 = new User(2, "Jane", "Doe", "jane", "", "123456", "user", "2020-01-01", true);
        User user3 = new User(3, "Bob", "Doe", "bob", "", "123456", "user", "2020-01-01", true);
        User user4 = new User(4, "Mike", "Doe", "mike", "", "123456", "user", "2020-01-01", true);
        User user5 = new User(5, "Jessica", "Doe", "jessica", "", "123456", "user", "2020-01-01", true);

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }


    public Optional<User> getUser(int userId) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            try {
            if (user.getUserId() == userId) {
                optional = Optional.of(user);
                return optional;
            }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUser(String name) {
        for (User user : userList) {
            try {
                if (user.getName().equals(name)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserSurname(String surname) {
        for (User user : userList) {
            try {
                if (user.getSurname().equals(surname)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserUsername(String username) {
        for (User user : userList) {
            try {
                if (user.getUsername().equals(username)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserEmail(String email) {
        for (User user : userList) {
            try {
                if (user.getEmail().equals(email)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserPassword(String password) {
        for (User user : userList) {
            try {
                if (user.getPassword().equals(password)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserRole(String role) {
        for (User user : userList) {
            try {
                if (user.getRole().equals(role)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserCreatedOn(String createdOn) {
        for (User user : userList) {
            try {
                if (user.getCreatedOn().equals(createdOn)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User getNamedUserIsactive(Boolean isactive) {
        for (User user : userList) {
            try {
                if (user.getIsactive().equals(isactive)) {
                    return user;
                }}
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
