
package fit.iuh.service;

import java.util.List;
import java.util.UUID;

import fit.iuh.entities.Customer;

public interface CustomerService {
    List<Customer> getAll();
    Customer getById(UUID id);
    Customer create(Customer customer);
    void delete(UUID id);
    
}
