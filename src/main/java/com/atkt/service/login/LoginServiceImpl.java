package com.atkt.service.login;

import com.atkt.builder.user.UserBuilder;
import com.atkt.dao.user.UserDao;
import com.atkt.helper.db.user.UserDbHelper;
import com.atkt.model.common.user.UserJpa;
import com.atkt.model.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This is the implementation of the UserJpa service.
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    /**
     * @return
     */
    @Override
    @Transactional
    public UserBuilder doLogin(User user) {
        UserDbHelper userDbHelper= new UserDbHelper();
        UserJpa userJpa = userDbHelper.getUserJpa(user);
        UserBuilder userBuilder =  userDao.validateUser(userJpa);
        return userBuilder;
    }
}
