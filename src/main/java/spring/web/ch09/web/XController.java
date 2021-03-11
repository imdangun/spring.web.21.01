package spring.web.ch09.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.web.ch09.service.XService;

@RestController
@RequestMapping("/ch09/x")
public class XController {
	@Autowired private XService xService;
	
	@GetMapping("/addNum")
	public int addNum() {
		return xService.addNum();
	}
	
	@GetMapping("/addNum2")
	public int addNum2() {
		return xService.addNum2();
	}
	
	@GetMapping("/addNum2NoX")
	public int addNum2NoX() {
		return xService.addNum2NoX();
	}
	
	@GetMapping("/addNum3")
	public int addNum3() {
		return xService.addNum3();
	}
	
	@GetMapping("/getNums")
	public List<Integer> getNums() {
		return xService.getNums();
	}
}
