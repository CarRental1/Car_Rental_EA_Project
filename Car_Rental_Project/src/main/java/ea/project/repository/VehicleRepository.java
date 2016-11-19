package ea.project.repository;

import org.springframework.data.repository.CrudRepository;

import ea.project.domain.Vehicle;


public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
