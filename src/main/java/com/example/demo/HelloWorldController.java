package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello Shivani kate";
	}
	
	@GetMapping(path="/hello-world-bean")
	public helloWorldBean helloWorldBean() {
		return new helloWorldBean("Hello Shivani Kate");
	}

	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public helloWorldBean helloWorldPathVariable(@PathVariable String name ) {
		return new helloWorldBean(String.format("Hello Shivani Kate %s", name));
	}

}
