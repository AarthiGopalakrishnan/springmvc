package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_credentials")

public class user {
	@Id
	
	@Column(length=50,name="uname")
private String username;
	
	@Column(length=50, name="password")
private String userpass;
	
	@Column(length=100,name="email")
private String useremail;
	
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpass() {
	return userpass;
}
public void setUserpass(String userpass) {
	this.userpass = userpass;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
@Override
public String toString()
{
	return "User [username=" + username +", userpass="+ userpass +",useremail="+useremail+"]";
}

}

