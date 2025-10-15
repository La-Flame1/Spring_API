package org.itdma.springapi.api.model;

public class User {
    private final int userId;
    private final String name;
    private final String surname;
    private final String username;
    private final String email;
    private final String password;
    private final String role;
    private final String createdOn;
    private final Boolean isactive;

    public User(int userId, String name, String surname, String username, String email,
                String password, String role, String createdOn, Boolean isactive) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdOn = createdOn;
        this.isactive = isactive;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public Boolean getIsactive() {
        return isactive;
    }
}
