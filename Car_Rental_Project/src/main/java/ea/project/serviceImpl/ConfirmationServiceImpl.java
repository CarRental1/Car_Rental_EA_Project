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
		this.confirmationDao.createConfirmation(confirmation);
		
	}

	@Override
	public void updateConfirmation(Confirmation confirmation) {
		this.confirmationDao.updateConfirmation(confirmation);
	}

	@Override
	public List<Confirmation> listConfirmation() {
		return this.confirmationDao.listConfirmation();
	}

	@Override
	public Confirmation getConfirmationById(int id) {
		return this.confirmationDao.getConfirmationById(id);
	}

	@Override
	public void removeConfirmationById(long confirmationNumber) {
		this.confirmationDao.removeConfirmationById(confirmationNumber);
	}
	
}
