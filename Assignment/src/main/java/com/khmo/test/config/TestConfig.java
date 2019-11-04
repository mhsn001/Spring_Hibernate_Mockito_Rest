package com.khmo.test.config;

/*References: 
 * https://www.baeldung.com/hibernate-4-spring
 * https://www.boraji.com/spring-4-hibernate-5-integration-example-with-zero-xml
 * 
 * Dao unit tests
 * https://howtodoinjava.com/best-practices/how-you-should-unit-test-dao-layer/
 * */

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.khmo.test")
public class TestConfig {
	
	@PostConstruct
	public void init() {
		System.out.println("######################## : Test config" );
	}
	
}