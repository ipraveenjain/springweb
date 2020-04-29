package pbj.springmvc.service;

import pbj.springmvc.model.Login;
import pbj.springmvc.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
