package com.atkt.service.user;

import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;

import java.util.List;

/**
 * This the UserJpa service to add delete and list the Users.
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    /**
     * Return list of UserJpa.
     * @return List of products
     */
    public List<User> listUsers();

    /**
     * Add the UserJpa to database.
     */
    public Long createUser(User user);

    /**
     * Delete the indicated product from database.
     * @param userid product id.
     */
    public void deleteUser(final Long userId);
}
