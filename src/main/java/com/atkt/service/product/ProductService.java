package com.atkt.service.product;

import com.atkt.model.db.product.Product;

import java.util.List;

/**
 * This the Product service to add delete and list the products.
 * Created with IntelliJ IDEA.
 * UserJpa: kranti
 * Date: 11/2/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductService {
    /**
     * Return list of products.
     * @return List of products
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
