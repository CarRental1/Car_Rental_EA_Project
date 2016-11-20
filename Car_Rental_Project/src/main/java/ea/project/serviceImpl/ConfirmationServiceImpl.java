package ea.project.serviceImpl;

import java.util.List;

import ea.project.dao.IConfirmationDAO;
import ea.project.domain.Confirmation;
import ea.project.service.IConfirmationService;

/**
 * @author swoven
 * @version 1.0
 */
public class ConfirmationServiceImpl implements IConfirmationService
{
	private IConfirmationDAO confirmationDao;
	
	public IConfirmationDAO getConfirmationDao() {
		return confirmationDao;
	}

	public void setConfirmationDao(IConfirmationDAO confirmationDao) {
		this.confirmationDao = confirmationDao;
	}

	@Override
	public void createConfirmation(Confirmation confirmation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReservation(Confirmation confirmation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Confirmation> listConfirmation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Confirmation getConfirmationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeConfirmationById(long confirmationNumber) {
		// TODO Auto-generated method stub
		
	}
	
}
