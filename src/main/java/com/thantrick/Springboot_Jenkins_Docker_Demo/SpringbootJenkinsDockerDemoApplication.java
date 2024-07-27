package com.thantrick.Springboot_Jenkins_Docker_Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class SpringbootJenkinsDockerDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDockerDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerDemoApplication.class, args);
	}

	@GetMapping("/api")
	public void TestApi(){
		logger.info("TestApi called....!!!!");
	}

}
