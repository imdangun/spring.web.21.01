package spring.web.ch05.ex01.sub.domain;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	@NotEmpty @Size(min=2, max=4)
	private String name;
	
	@NotNull @Max(100) @PositiveOrZero
	private Integer age;
	
	@NotBlank @Email(message="이메일 주소를 입력하세요.")
	private String email;
	
	@NotNull
	@PastOrPresent
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	
	@NotNull
	@Size(min=2, max=3, message="취미를 2개 이상 선택하세요.")
	private List<String> hobbys;
}
/*
@NotNull : null
@NotEmpty: null ""
@NotBlank: null "" " "
*/