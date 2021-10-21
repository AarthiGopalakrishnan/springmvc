package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.user;
import java.util.List;
@Repository
public class UserDao {
@Autowired
private HibernateTemplate hibernatetemplate;
@Transactional
public void saveUser(user User)
{
	 this.hibernatetemplate.save(User);
}
public List<user> retrieveUser()
{
	return this.hibernatetemplate.loadAll(user.class);
}
@Transactional
public void updateUser(user User)
{
	 this.hibernatetemplate.update(User);
}
@Transactional
public void deleteUser(String username)
{
	user Userobj=this.hibernatetemplate.load(user.class, username);

	 this.hibernatetemplate.delete(Userobj);
}
}
