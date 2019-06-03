package com.techexpert.springAOP;

import org.springframework.stereotype.Component;

@Component
public class HiBye {
	
	public String sayHi() {
		return "HI!!";
	}
	public String sayBye() {
		return "Bye!!";
	}
	public String saySomething() {
		return "Hi Bye!!";
	}

}
