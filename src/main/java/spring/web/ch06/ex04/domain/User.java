package spring.web.ch06.ex04.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Alias("ch06.ex04.user")
public class User {
	private int userId;
	private String userName;
	
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private LocalDate birthday;
}
