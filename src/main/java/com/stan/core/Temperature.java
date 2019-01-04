package com.stan.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Temperature {

	@GetMapping(path="/temperature")
	public String getTemperature() {
		return "63F";
	}
}
