package spring.web.ch02.home;

import lombok.Setter;

@Setter
public class Number {
	private int num;
	
	public double getNum() {
		return num + (int)(Math.random() * 10) / 10.0;
	}
}
