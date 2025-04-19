package fit.iuh.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.iuh.entities.Order;
import fit.iuh.service.OrderService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	@Autowired
    private  OrderService oderService;
	


	    @GetMapping
	    public List<Order> getOrders() {
	        return oderService.getAllOrders();
	    }

	    @PostMapping
	    public Order create(@RequestBody Order o) {
	        o.getItems().forEach(item -> {
	            String productId = item.getProductId();
	            String url = "http://localhost:8087/products/" + productId;
	            if (productId == null) {
	                throw new RuntimeException("Product not found with id: " + productId);
	            }
	        });
	        return OrderService.createOrder(o); 
	    }

	    @GetMapping("/{id}")
	    public Order get(@PathVariable UUID id) {
	        return OrderService.getOrderById(UUID).orElseThrow(() -> new RuntimeException("Order not found"));
	    }

}
