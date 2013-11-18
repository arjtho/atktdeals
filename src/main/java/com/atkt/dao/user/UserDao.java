package com.atkt.dao.user;

import com.atkt.assempler.user.UserAssembler;
import com.atkt.builder.user.UserBuilder;
import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;

import java.util.List;

/**
 * This Interface is implemented in UserDaoImpl. which is used to get add and remove Users.
 * Created with IntelliJ IDEA.
 * UserJpa: Mahadev
 * Date: 11/2/13
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    /**
     * Return list of products.
     * @return  list of products.
     */
    public UserAssembler listUsers();

    /**
     * Get userJpa
     *
     * @param userJpa @return
     */
    public UserAssembler getUser(UserJpa userJpa);

    /**
     * Validate userJpa.
     *
     *
     * @param user @return
     * @param userJpa
     */
    public UserBuilder validateUser(UserJpa userJpa);

    /**
     * Add the UserJpa to database.
     */
    public Long createUser(UserJpa userJpa);

    /**
     * Delete the indicated userJpa from database.
     */
    public void deleteUser(final Long userId);
}
