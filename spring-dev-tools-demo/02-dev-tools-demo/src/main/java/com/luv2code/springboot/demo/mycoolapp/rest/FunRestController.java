package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;


	@GetMapping("/teaminfo")
	public String teamInfo(){
		return "Caoch name is "+coachName+" and team name is "+teamName;

	}

		
	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	// expose new endpoint for /workout
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hie hard 5k!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return " Today hello";
	}

}
