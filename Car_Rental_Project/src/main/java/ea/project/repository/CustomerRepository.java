package ea.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ea.project.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	 @Query("SELECT c FROM Customer c WHERE c.user.userName = :userName")
	 public Customer findCustomerByUserName(@Param("userName") String userName);
	 
	 //@Query("SELECT c FROM Customer c WHERE c.userName = :userName and c.password =: password")
//	 public Customer findCustomerByUserNameAndPassword(String userName, String password);

}
