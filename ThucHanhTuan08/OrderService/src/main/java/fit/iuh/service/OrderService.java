package fit.iuh.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import fit.iuh.entities.Order;

public interface OrderService {
	 List<Order> getAllOrders();

	    Optional<Order> getOrderById(UUID id);

	    Order createOrder(Order order);

	    void deleteOrder(UUID id);

}
