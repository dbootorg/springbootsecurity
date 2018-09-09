package info.inetsolv.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(path="/add",method=RequestMethod.GET)
	@Secured(value= {"ROLE_ADMIN"})
	public String displayHomePage() {
		return "admin.html";
	}
}
