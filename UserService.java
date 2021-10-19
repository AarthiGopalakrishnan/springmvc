package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.user;

@Service
public class UserService {
	@Autowired
private UserDao userdao;
public int createuser(user User)
{
	return this.userdao.saveUser(User);
}
}
