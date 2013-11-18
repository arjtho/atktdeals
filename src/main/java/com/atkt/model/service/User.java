package com.atkt.model.service;

import com.atkt.common.user.UserStatus;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/14/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserStatus userStatus;
    private List<String> errorFields;
    private String errorMessage;

    public User(Long userId, String firstName, String lastName, String email,
                String password, UserStatus userStatus, List<String> errorFields, String errorMessage) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userStatus = userStatus;
        this.errorFields = errorFields;
        this.errorMessage = errorMessage;
    }

    public List<String> getErrorFields() {
        return errorFields;
    }

    public void setErrorFields(List<String> errorFields) {
        this.errorFields = errorFields;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns a hash code value for the object. This method is
     * @return a hash code value for this object.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime * 1;
        result = result + firstName == null?0:firstName.hashCode();
        result = result + lastName == null?0:lastName.hashCode();
        result = result + email == null?0:email.hashCode();
        return result;
    }

    /**
     * equals method
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     *         argument; {@code false} otherwise.
     * @see #hashCode()
     * @see java.util.HashMap
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        } else if(this.getClass() != obj.getClass()) {
            return false;
        } else if (this == obj) {
            return true;
        }
        final User other = ((User) obj);
        return this.getEmail().equals(other.getEmail());
    }
}
