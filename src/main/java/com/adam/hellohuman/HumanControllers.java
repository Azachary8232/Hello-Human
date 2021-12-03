package com.adam.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanControllers {

	@RequestMapping("/")
	public String Hello(@RequestParam(value= "name", required= false) String searchquery, @RequestParam(value= "last_name", required= false) String last_name) {
		if(searchquery == null) {
			return "human";
		}
		else if(last_name == null){
			return "human";
		}
		else {
			return "Hello " + searchquery + " " + last_name; 
		}
	}
	
	
	
	
}
