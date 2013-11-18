package com.atkt.service.login;

import com.atkt.builder.user.UserBuilder;
import com.atkt.model.service.User;

/**
 * This the UserJpa service to add delete and list the Users.
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoginService {
    /**
     *
     * @return
     * @param user
     */
    public UserBuilder doLogin(User user);
}
