package com.lhp.service;

import com.lhp.domain.Product;

import java.util.List;

public interface ProdectService {
    public List<Product> findAll();

    void save(Product product);

}
