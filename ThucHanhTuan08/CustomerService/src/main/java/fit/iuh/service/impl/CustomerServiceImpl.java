package fit.iuh.service.impl;




import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fit.iuh.entities.Customer;
import fit.iuh.repository.CustomerRepository;
import fit.iuh.service.CustomerService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(UUID id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

   
    @Override
    public void delete(UUID id) {
        customerRepository.deleteById(id);
    }

	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}


}
