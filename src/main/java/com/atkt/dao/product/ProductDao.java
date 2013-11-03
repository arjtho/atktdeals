package com.atkt.dao.product;

import com.atkt.model.db.product.Product;

import java.util.List;

/**
 * This Interface is implemented in ProductDaoImpl. which is used to get add and remove product.
 * Created with IntelliJ IDEA.
 * User: kranti
 * Date: 11/2/13
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductDao {
    /**
     * Return list of products.
     * @return  list of products.
     */
    public List<Product> listProducts();

    /**
     * Add the product to database.
     */
    public void addProduct();

    /**
     * Delete the indicated product from database.
     * @param productId product id.
     */
    public void removePorduct(final Long productId);

}
