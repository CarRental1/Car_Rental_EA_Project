package ea.project.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ea.project.dao.IReservationDAO;
import ea.project.domain.Reservation;


/**
 * @author swoven
 *@version 1.0
 */
@Repository
@Transactional
public class ReservationDAOImpl implements IReservationDAO 
{
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void createReservation(Reservation reservation) {
		manager.persist(reservation);
		System.out.println("Reservation Object Saved");
		
	}

	@Override
	public void updateReservation(Reservation reservation) {
		manager.merge(reservation);
		System.out.println("Reservation Object Updated");
		
	}

	@Override
	public List<Reservation> listReservation() {
		List<Reservation> reservationList =manager.createQuery("from Reservation", Reservation.class).getResultList();
		for(Reservation p : reservationList){
			System.out.println(p.getId());
		}
		return reservationList;
	}

	@Override
	public Reservation getReservationById(int id) {		
		Reservation reservation  = (Reservation) manager.getReference(Reservation.class, new Integer(id));
		System.out.println("Reservation loaded successfully");
		return reservation;
	}

	@Override
	public void removeReservation(int id) {
		Reservation reservation = (Reservation) manager.getReference(Reservation.class, new Integer(id));
		if(null != reservation){
			manager.remove(reservation);
		}
		System.out.println("Reservation object deleted");
		
	}

}
