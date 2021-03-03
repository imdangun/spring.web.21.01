package spring.web.ch03.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurveyController {
	@PostMapping("/ch03/ex03/survey")
	public String survey(Answer answer) {
		return "ch03/ex03/surveyOut";
	}
}
