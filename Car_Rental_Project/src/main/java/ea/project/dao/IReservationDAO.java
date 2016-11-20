package ea.project.dao;

import java.util.List;

import ea.project.domain.Reservation;

/**
 * @author swoven
 *@version 1.0
 */
public interface IReservationDAO 
{
	public void createReservation(Reservation reservayion);
	public void updateReservation(Reservation reservation);
	public List<Reservation> listReservation();
	public Reservation getReservationById(int id);
	public void removeReservation(int id);
}
