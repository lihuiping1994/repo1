package com.lhp.dao;

import com.lhp.domain.Traveller;

import java.util.List;

public interface TravellerDao {

    public List<Traveller> findTravellerById(String id);
}
