package ea.project.repository;

import org.springframework.data.repository.CrudRepository;

import ea.project.domain.Vehicle;

/**
 * @author Bharat Pandey
 *
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
