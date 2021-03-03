package spring.web.ch03.ex03;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {
	private List<String> fruits;
	private Location location;
}
