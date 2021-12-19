package com.sergio.reto2Ciclo4.repository.crudRepository;


import com.sergio.reto2Ciclo4.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
