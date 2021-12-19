package com.sergio.reto2Ciclo4.repository.crudRepository;

import com.sergio.reto2Ciclo4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {

}
