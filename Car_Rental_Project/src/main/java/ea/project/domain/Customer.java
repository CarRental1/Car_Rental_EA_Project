package ea.project.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7229488317098431281L;

	@Id
	@GeneratedValue
	private int customerId;

	@Embedded
	private PersonalDetail personalDetail;
	
	@Embedded
	private BillingAddress billingAddress;
	
	@Embedded
	private CreditCard creditCard;
	
//	@OneToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "userID")
	@Embedded
	private
	User user;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Customer(PersonalDetail personalDetail, BillingAddress billingAddress, CreditCard creditCard) {
		// TODO Auto-generated constructor stub
		this.personalDetail = personalDetail;
		this.billingAddress = billingAddress;
		this.creditCard = creditCard;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}

	public void setPersonalDetail(PersonalDetail personalDetail) {
		this.personalDetail = personalDetail;
	}
//	
//	@Override
//	public String toString() {
//		return personalDetail.getFirstName();
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
