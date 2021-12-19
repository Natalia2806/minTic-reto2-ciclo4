package com.sergio.reto2Ciclo4.repository.crudRepository;

import com.sergio.reto2Ciclo4.model.Product;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
     public List<Product> findByPriceLessThanEqual(double price);
    public List<Product> findByDescriptionContainingIgnoreCase(String description);

}
