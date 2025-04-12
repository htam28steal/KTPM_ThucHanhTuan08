package fit.iuh.service;

import java.util.List;
import java.util.UUID;

import fit.iuh.entities.Product;

public interface ProductService {
    List<Product> getAll();
    Product getById(UUID id);
    Product create(Product product);
    Product update(UUID id, Product product);
    void delete(UUID id);
}