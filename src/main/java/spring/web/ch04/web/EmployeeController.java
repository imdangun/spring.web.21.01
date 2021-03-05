package spring.web.ch04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import spring.web.ch04.domain.Employee;
import spring.web.ch04.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired private EmployeeService empService;
	
	@GetMapping("/ch04/employee/{empId}")
	public String findEmployee(@PathVariable int empId, Model model) {
		Employee emp = empService.getEmployee(empId);
		model.addAttribute("emp", emp);
		
		return "ch04/employee";		
	}
}
