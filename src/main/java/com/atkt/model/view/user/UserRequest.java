package com.atkt.model.view.user;

/**
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/14/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserRequest {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

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
}
