package com.techexpert.springAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiByeController {
	
	@Autowired
	HiBye hb;
	
	@GetMapping("hibye")
	public String gethibye() {
		return hb.sayHi()+hb.sayBye();
	}

}
