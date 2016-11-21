package ea.project.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 * @author swoven
 * @version 1.0
 *Confirmation POJO
 */

@Entity
public class Confirmation implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8276340068505700851L;
	
	@Id @GeneratedValue
	private int id;
	@Column(name="ConfirmationNumber")
	private long confirmationNumber;
	@OneToOne
	@JoinColumn(name="Customer_Id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name="Vehicle_Id")
	private Vehicle vehicle;
	@OneToOne
	@JoinColumn(name="Reservation_Id")
	private Reservation reservation;
	
	public Confirmation(){
		//default
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(long confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
