package ea.project.service;

import java.util.List;

import ea.project.domain.Vehicle;

public interface VehicleService {

	public void saveVehicle(Vehicle vehicle);

	public List<Vehicle> getAllVehicles();

}
