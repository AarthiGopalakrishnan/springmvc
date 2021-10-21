package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.user;

@Service
public class UserService {
	@Autowired
private UserDao userdao;
public void createuser(user User)
{

	 this.userdao.saveUser(User);
}
public List<user> retrieveuser()
{

	return this.userdao.retrieveUser();
}
public void updateuser(user User)
{

	 this.userdao.updateUser(User);
}
public void deleteuser(String User)
{

	 this.userdao.deleteUser(User);
}

}
