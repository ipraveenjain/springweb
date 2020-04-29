package pbj.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import pbj.springmvc.dao.UserDao;
import pbj.springmvc.model.Login;
import pbj.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
