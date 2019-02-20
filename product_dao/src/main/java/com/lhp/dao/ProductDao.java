package com.lhp.dao;

import com.lhp.domain.Product;
import java.util.List;

public interface ProductDao {

    public List<Product> findAll();

    void save(Product product);

    public Product findById(int productId);

}
