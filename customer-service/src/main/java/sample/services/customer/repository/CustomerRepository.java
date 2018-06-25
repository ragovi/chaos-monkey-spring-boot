package sample.services.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sample.services.customer.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	List<Customer> findByName(String name);
	
}
