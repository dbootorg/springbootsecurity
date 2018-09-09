package info.inetsolv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(path="/login?logout",method=RequestMethod.GET)
	public String displayHomePage() {
		return "home.html";
	}
}
