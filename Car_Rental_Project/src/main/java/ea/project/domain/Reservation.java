package ea.project.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author swoven
 * @version 1.0
 *Reservation POJO
 */

@Entity
public class Reservation implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2000174163656047611L;
	
	@Id @GeneratedValue
	private int id;
	@Column(name="PickUpDate")
	private Date pickUpDate;
	@Column(name="PickUpTime")
	private Date pickUpTime;
	@Column(name="ReturnDate")
	private Date returnDate;
	@Column(name="ReturnTime")
	private Date returnTime;
	
	public Reservation(){
		//default
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public Date getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(Date pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	
	
}
