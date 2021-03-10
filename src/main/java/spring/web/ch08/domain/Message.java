package spring.web.ch08.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
	private String to;
	private String subject;
	private String text;
}
