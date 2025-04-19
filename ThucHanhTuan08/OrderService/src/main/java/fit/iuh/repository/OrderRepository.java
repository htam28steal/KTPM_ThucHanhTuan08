package fit.iuh.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.iuh.entities.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, UUID>{


}
