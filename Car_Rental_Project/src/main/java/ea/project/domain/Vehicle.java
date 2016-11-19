package ea.project.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Bharat Pandey
 *
 */
@Entity
public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1705588213249003920L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	private Integer vehicleId;
	@OneToOne
	private VehicleClass vehicleClass;
	@OneToOne
	private Category category;
	private String description;
	private int capacity;
	private int bags; 
	private double price;
	private String specialFeatures;
	@Transient
	private MultipartFile  vehicleImage;
	
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public VehicleClass getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(VehicleClass vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getBags() {
		return bags;
	}
	public void setBags(int bags) {
		this.bags = bags;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	public MultipartFile getVehicleImage() {
		return vehicleImage;
	}
	public void setVehicleImage(MultipartFile vehicleImage) {
		this.vehicleImage = vehicleImage;
	}
	
	
	
/*	@Size(min=4, max=50, message="{Product.name.validation}")
	private String name;	
	private double price;	
	private String description;	
	@Size(min=4, max=50, message="{Product.manufacturer.validation}")
	private String manufacturer;	
	@OneToOne(cascade=CascadeType.ALL)
	private Category category;*/

}
