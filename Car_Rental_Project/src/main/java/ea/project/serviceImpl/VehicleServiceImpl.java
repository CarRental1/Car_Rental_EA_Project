package ea.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ea.project.domain.Vehicle;
import ea.project.repository.VehicleRepository;
import ea.project.service.VehicleService;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public void saveVehicle(Vehicle vehicle){
		vehicleRepository.save(vehicle);
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return (List<Vehicle>) vehicleRepository.findAll();
	}

}
