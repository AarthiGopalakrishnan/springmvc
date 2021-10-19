package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/control")
public class homeController {
@RequestMapping("/home")
	public String home(Model model)
{
	model.addAttribute("username","aarthi");
	model.addAttribute("id",1213);
return "home";
}
@RequestMapping("/about")

public String about(Model mod)
{
	List<String> course=new ArrayList<String>();
	course.add("java");
	course.add("jsp");
	
	mod.addAttribute("list",course);
	return "about";
}
@RequestMapping("/model")
public ModelAndView sendingData()
{
	ModelAndView mv=new ModelAndView();
	
	mv.addObject("name", "Rincy banu");
	mv.addObject("id", 2328);
	
	List<Integer> marks=new ArrayList<Integer>();
	marks.add(78);
	marks.add(83);
	marks.add(74);
	mv.addObject("marks",marks);
	
	mv.setViewName("modelandview");
	return mv;
	
	
}
}
