package ea.project.serviceImpl;

import java.util.List;

import ea.project.dao.IReservationDAO;
import ea.project.domain.Reservation;
import ea.project.service.IReservationService;

/**
 * @author swoven
 *@version 1.0
 */
public class ReservationServiceImpl implements IReservationService
{
	private IReservationDAO reservationDao;
	
	
	public IReservationDAO getReservationDao() {
		return reservationDao;
	}

	public void setReservationDao(IReservationDAO reservationDao) {
		this.reservationDao = reservationDao;
	}

	@Override
	public void createReservation(Reservation reservayion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reservation> listReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getReservationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeReservation(int id) {
		// TODO Auto-generated method stub
		
	}

}
