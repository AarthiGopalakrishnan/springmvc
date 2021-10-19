package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;
import springmvc.service.UserService;
@Controller
public class registrationController {
	@Autowired
	private UserService userservice;
	
	@ModelAttribute
	public void commonData(Model model) {
		
		model.addAttribute("projectName", "online shopping kart!");
	}
	@RequestMapping("/register")
	public String register()
	{
		return "registration";
		
	}
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	
	public String handleRequest(@ModelAttribute("User") user User , Model model)
	{
		//process a request
	System.out.println(User);
	//model.addAttribute("user",User);
	if(User.getUsername().isBlank())
	{
		return "redirect:/register";
	}
	this.userservice.createuser(User);
		return "success";

}
	
}
/*	@RequestParam("username") String username,
@RequestParam("userpass") String password,
@RequestParam("usermail") String email,
Model model)
{
model.addAttribute("name",username);
model.addAttribute("pass",password);
model.addAttribute("email",email); */
