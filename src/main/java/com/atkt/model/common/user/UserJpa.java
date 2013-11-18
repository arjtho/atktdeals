package com.atkt.model.common.user;

import javax.persistence.*;

/**
 * UserJpa
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/12/13
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="user")
public class UserJpa {

    /**
     * Default constructor.
     */
    public UserJpa() {

    }

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
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
