package com.example.demo;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
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
	
	@GetMapping(path="/hello-world-internatinalized")
	public String helloWorldBeanInternatinalized(@RequestHeader(name ="Accept-Language", required = false)Locale locale) {
		return messageSource.getMessage("good.morninig.message", null,locale);
	//	return "good";
	}

}
