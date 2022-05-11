package springcontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller
{
	@GetMapping("/")
	public ModelAndView Loginpage(Model model)
	{
	model.addAttribute("message", "welcome java class");
	return new ModelAndView("welcomepage");
	
}
}