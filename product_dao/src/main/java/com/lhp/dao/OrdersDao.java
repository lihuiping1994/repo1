package com.lhp.dao;

import com.lhp.domain.Orders;

import java.util.List;

public interface OrdersDao {
    public List<Orders> findAll();

    Orders findById(String id);

}
