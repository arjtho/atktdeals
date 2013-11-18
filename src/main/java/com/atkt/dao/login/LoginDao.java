package com.atkt.dao.login;

import com.atkt.builder.user.UserBuilder;
import com.atkt.model.common.user.UserJpa;


/**
 * This Interface is implemented in LoginDaoImpl. which is used to get add and remove Users.
 * Created with IntelliJ IDEA.
 * UserJpa: Mahadev
 * Date: 11/2/13
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LoginDao {

   UserBuilder doLogin(UserJpa userJpa);

}
