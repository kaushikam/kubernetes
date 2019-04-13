package com.kaushikam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
class GreetingController {

	@RequestMapping
	public String hello() {
		return "Hello";
	}
}