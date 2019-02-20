package com.lhp.service;

import com.lhp.domain.Orders;

import java.util.List;

public interface OrdersService {


    public List<Orders> findAll(int page,int size);

    Orders findById(String id);

}
