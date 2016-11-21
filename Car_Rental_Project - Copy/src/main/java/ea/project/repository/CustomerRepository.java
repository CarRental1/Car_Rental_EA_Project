package ea.project.repository;

import org.springframework.data.repository.CrudRepository;

import ea.project.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	 public Customer findByUserName(String userName);

	 public Customer findByUserNameAndPassword(String userName, String password);

}
