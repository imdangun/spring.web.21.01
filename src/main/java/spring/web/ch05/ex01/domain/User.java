package spring.web.ch05.ex01.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private String name;
	private Integer age;
	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	
	private List<String> hobbys;
}
