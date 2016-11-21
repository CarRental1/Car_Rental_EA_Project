package ea.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ea.project.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	 @Query("SELECT c FROM Customer c WHERE c.customerId = :customerId")
	 public Customer findCustomerById(@Param("customerId") int customerId);

}
