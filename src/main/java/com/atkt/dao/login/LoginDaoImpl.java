package com.atkt.dao.login;

import com.atkt.builder.user.UserBuilder;
import com.atkt.model.common.user.UserJpa;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public UserBuilder doLogin(UserJpa userJpa) {
         return null;
    }
}
