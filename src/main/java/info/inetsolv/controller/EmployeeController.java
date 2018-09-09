package info.inetsolv.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping(path="/emp")
	@Secured(value= {"ROLE_USER"})
	public String displayEmployeeForm() {
		return "employee.html";
	}

}
