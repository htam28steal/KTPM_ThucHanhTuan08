package fit.iuh.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.iuh.entities.Product;
import fit.iuh.repository.ProductRepository;
import fit.iuh.service.ProductService;
import lombok.RequiredArgsConstructor;

@Service

public class ProductServiceImpl implements ProductService{

	@Autowired
    private  ProductRepository productRepository;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getById(UUID id) {
		  return productRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found"));
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		 return productRepository.save(product);
	}

	@Override
	public Product update(UUID id, Product product) {
		 Product existing = getById(id);
	        existing.setName(product.getName());
	        existing.setPrice(product.getPrice());
	        existing.setDescription(product.getDescription());
	        existing.setQuantity(product.getQuantity());
	        return productRepository.save(existing);
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		 productRepository.deleteById(id);
	}

}
