package ea.project.service;

import ea.project.domain.User;

public interface UserService {
	public void saveUser(User user);
	public User getUser(String username);
}
