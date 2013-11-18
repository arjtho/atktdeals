package com.atkt.helper.view.user;

import com.atkt.builder.user.UserBuilder;
import com.atkt.model.view.user.UserRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Mahadev
 * Date: 11/15/13
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserViewHelper {

    /**
     * UserBuilder object from user request params.
     * @param userRequest
     * @return
     */
    public UserBuilder getUserBuilder(UserRequest userRequest) {
        UserBuilder userBuilder = new UserBuilder()
                .setEmail(userRequest.getEmail())
                .setFirstName(userRequest.getFirstName())
                .setLastName(userRequest.getLastName())
                .setPassword(userRequest.getPassword());
        return userBuilder;
    }

}
