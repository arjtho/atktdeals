package com.atkt.dao.user;

import com.atkt.assempler.user.UserAssembler;
import com.atkt.builder.user.UserBuilder;
import com.atkt.common.user.UserStatus;
import com.atkt.model.common.user.UserJpa;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Return list of users.
     * @return
     */
    @Override
    public UserAssembler listUsers() {
        UserAssembler userAssembler = null;
        Query query =  sessionFactory.getCurrentSession().createQuery("from UserJpa");
        List<UserJpa> userJpaList = query.list();
        if(userJpaList != null) {
            userAssembler = new UserAssembler(userJpaList, null);
        }
        return userAssembler;
    }

    /**
     * Add the userJpa to database.
     */
    @Override
    public Long createUser(UserJpa userJpa) {
        Long userid = (Long) sessionFactory.getCurrentSession().save(userJpa);
        return userid;
    }

    /**
     * Delete the indicated userJpa from database.
     *
     */
    @Override
    public void deleteUser(Long userId) {
    }

    /**
     *
     * @param userJpa @return
     * @return
     */
    @Override
    public UserAssembler getUser(UserJpa userJpa) {
        UserAssembler userAssembler = null;
        Query query =  sessionFactory.getCurrentSession().createQuery("from UserJpa where email=:email");
        query.setParameter("email", userJpa.getEmail());
        List<UserJpa> userJpaList = query.list();
        if(userJpaList != null) {
            userAssembler = new UserAssembler(userJpaList, null);
        }
        return userAssembler;
    }

    /**
     *
     * @param userJpa
     * @return
     */
    @Override
    public UserBuilder validateUser(UserJpa userJpa) {
        UserBuilder userBuilder = new UserBuilder();
        Criteria criteria =  sessionFactory.getCurrentSession().createCriteria(UserJpa.class)
                .setProjection( Projections.projectionList()
                        .add( Projections.property("firstName"))
                        .add( Projections.property("lastName"))
                        .add( Projections.property("email"))
                )
                .add(Restrictions.eq("email", userJpa.getEmail()))
                .add(Restrictions.eq("password", userJpa.getPassword()));
        Object result = criteria.uniqueResult();
        if(result != null) {
            Object[] resultArray = (Object[]) result;
            userBuilder.setFirstName((String)resultArray[0]);
            userBuilder.setLastName((String)resultArray[1]);
            userBuilder.setEmail((String)resultArray[2]);
            userBuilder.setUserStatus(UserStatus.SUCCESS);
        } else {
            userBuilder.setUserStatus(UserStatus.FAIL);
        }
        return userBuilder;
    }
}
