package spring.web.ch08.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSendException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.ch08.domain.Message;
import spring.web.ch08.service.MailService;

@Controller
@RequestMapping("/ch08/mail")
public class MailController {
	@Autowired private MailService mailService;
	
	@GetMapping
	public void main() {}
	
	@PostMapping
	public String send(Message msg) {
		mailService.send(msg);
		return "ch08/success";
	}
	
	@ExceptionHandler(MailSendException.class)
	public String handle() {
		return "ch08/fail";
	}
}
