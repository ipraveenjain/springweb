package pbj.springmvc.dao;

import pbj.springmvc.model.Login;
import pbj.springmvc.model.User;
import pbj.springmvc.prop.PropertiesCache;

public class UserDaoImpl implements UserDao {



	public int register(User user) {

		PropertiesCache cache = PropertiesCache.getInstance();
		cache.setProperty(user.getUsername(), user.getPassword());
		return 1;
	}

	public User validateUser(Login login) {

		User user = null;
		String password = PropertiesCache.getInstance().getProperty(login.getUsername());

		if (password != null) {
			user = new User();
			user.setUsername(login.getUsername());
			user.setPassword(password);
		}

		return user;
	}

}
