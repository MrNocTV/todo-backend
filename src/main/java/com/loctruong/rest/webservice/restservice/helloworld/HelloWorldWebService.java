package com.loctruong.rest.webservice.restservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class HelloWorldWebService {

	@GetMapping(path = "/hello-world-bean/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable String name) {
		// throw new RuntimeException("ERRORRRRORROROR");
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
