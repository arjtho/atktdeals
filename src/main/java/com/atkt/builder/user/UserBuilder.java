package com.atkt.builder.user;

import com.atkt.builder.Builder;
import com.atkt.common.user.UserStatus;
import com.atkt.model.service.User;

import java.util.List;

public class UserBuilder implements  Builder<User>{
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserStatus userStatus;
    private List<String> errorFields;
    private String errorMessage;

    public UserBuilder setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public UserBuilder setErrorFields(List<String> errorFields) {
        this.errorFields = errorFields;
        return this;
    }

    public UserBuilder setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public User createUser() {
        return new User(userId, firstName, lastName, email, password, userStatus, errorFields, errorMessage);
    }

    @Override
    public User build() {
        return  createUser();
    }
}