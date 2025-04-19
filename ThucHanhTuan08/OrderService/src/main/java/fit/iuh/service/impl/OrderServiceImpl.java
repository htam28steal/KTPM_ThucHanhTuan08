package fit.iuh.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import fit.iuh.entities.Order;
import fit.iuh.repository.OrderRepository;
import fit.iuh.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
    private  OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		 return orderRepository.findAll();

	}

	@Override
	public Optional<Order> getOrderById(UUID id) {
		// TODO Auto-generated method stub
		  return orderRepository.findById(id);

	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
	        Order savedOrder = orderRepository.save(order);
	        return savedOrder;

	}

	@Override
	public void deleteOrder(UUID id) {
		orderRepository.deleteById(id);

		
	}

}
