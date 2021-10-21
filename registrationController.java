package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import springmvc.model.user;
import springmvc.service.UserService;
@Controller
@RequestMapping("/user")
public class registrationController {
	@Autowired
	private UserService userservice;
	
	@ModelAttribute
	public void commonData(Model model) {
		
		model.addAttribute("projectName", "WELCOME");
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
	userservice.createuser(User);
	return "success";

}
	@RequestMapping("/showuser")

	public ModelAndView handleReq(Model model)
	{
		ModelAndView mv=new ModelAndView();

	mv.addObject("userlist",userservice.retrieveuser());
	System.out.println(userservice.retrieveuser().toString());
	mv.setViewName("showuser");
	return mv;
	}
@RequestMapping(path="/updateform",method = RequestMethod.POST)
	
	public String updateRequest(@ModelAttribute("User") user User , Model model)
	{
	System.out.println(User);
	
	userservice.updateuser(User);
	return "success";

}	
@RequestMapping(path="/deleteform",method = RequestMethod.POST)

public String deleteRequest(@ModelAttribute("User") user User, Model model)
{
System.out.println(User.getUsername());
if(User.getUsername().isBlank())
{
	return "redirect:/register";
}
userservice.deleteuser(User.getUsername());

return "success";

}	
}

