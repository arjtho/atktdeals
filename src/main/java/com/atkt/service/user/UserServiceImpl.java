package com.atkt.service.user;

import com.atkt.assempler.user.UserAssembler;
import com.atkt.dao.user.UserDao;
import com.atkt.helper.db.user.UserDbHelper;
import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the implementation of the UserJpa service.
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * Return list of Users.
     * @return List of Users
     */
    @Override
    @Transactional
    public List<User> listUsers() {
        UserAssembler userAssembler = userDao.listUsers();
        return  userAssembler.assemble();
    }

    /**
     * Add the UserJpa to database.
     */
    @Override
    @Transactional
    public Long createUser(User user) {
        UserDbHelper userDbHelper= new UserDbHelper();
        UserJpa userJpa = userDbHelper.getUserJpa(user);
        return userDao.createUser(userJpa);
    }

    /**
     * Delete the indicated product from database.
     *
     * @param userid product id.
     */
    @Override
    @Transactional
    public void deleteUser(Long userId) {
    }
}
