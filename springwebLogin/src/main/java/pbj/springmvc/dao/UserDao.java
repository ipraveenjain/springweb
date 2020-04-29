package pbj.springmvc.dao;

import pbj.springmvc.model.Login;
import pbj.springmvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
