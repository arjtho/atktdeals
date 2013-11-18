package com.atkt.dao.product;

import com.atkt.model.db.product.Product;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
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
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Return list of products.
     *
     * @return
     */
    @Override
    public List<Product> listProducts() {
        Query query =  sessionFactory.getCurrentSession().createQuery("from Product");
        return query.list();
    }

    /**
     * Add the product to database.
     */
    @Override
    public void addProduct() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Delete the indicated product from database.
     *
     * @param productId  product id.
     */
    @Override
    public void removePorduct(Long productId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
