package com.atkt.assempler.user;

import com.atkt.assempler.Assembler;
import com.atkt.builder.user.UserBuilder;
import com.atkt.common.user.UserStatus;
import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/15/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserAssembler implements Assembler<User> {

    private List<UserJpa>  userJpaList;

    private UserStatus userStatus;

    public UserAssembler(List<UserJpa> userJpaList, UserStatus userStatus) {
        this.userJpaList = userJpaList;
        this.userStatus = userStatus;
    }

    /**
     *
     * @param userJpaList
     */
    public void setUserJpaList(List<UserJpa> userJpaList) {
        this.userJpaList = userJpaList;
    }

    /**
     *
     * @return
     */
    @Override
    public List<User> assemble() {
        List<User> userList = new ArrayList<User>();
        UserBuilder userBuilder = new UserBuilder();
        for (UserJpa userJpa : userJpaList) {
            userBuilder.setUserId(userJpa.getUserId());
            userBuilder.setEmail(userJpa.getEmail());
            userBuilder.setFirstName(userJpa.getFirstName());
            userBuilder.setLastName(userJpa.getLastName());
            userBuilder.setPassword(userJpa.getPassword());
            userList.add(userBuilder.build());
        }
        return userList;
    }
}
