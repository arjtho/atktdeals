package com.atkt.service.product;

import com.atkt.dao.product.ProductDao;
import com.atkt.model.db.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * This is the implementation of the Product service.
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/2/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;
    /**
     * Return list of products.
     * @return List of products
     */
    @Override
    @Transactional
    public List<Product> listProducts() {
        return productDao.listProducts();
    }

    /**
     * Add the product to database.
     */
    @Override
    @Transactional
    public void addProduct() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Delete the indicated product from database.
     * @param productId product id.
     */
    @Override
    @Transactional
    public void removePorduct(Long productId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
