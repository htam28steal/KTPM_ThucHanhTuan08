package fit.iuh.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import fit.iuh.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
	
}
