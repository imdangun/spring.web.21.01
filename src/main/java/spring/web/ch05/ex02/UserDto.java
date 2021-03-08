package spring.web.ch05.ex02;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	@NotBlank private String userId;
	@NotBlank private String userPw;	
}
