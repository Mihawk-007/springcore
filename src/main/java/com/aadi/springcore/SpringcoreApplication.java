package com.aadi.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Note on @SpringBootApplication annotation. The annotation consist of three:
 * @EnableAutoConfiguration - Enable auto configuration support.
 * @ComponoentScan - Scans for component in the base package and all subpackages recursively.
 * @Configuration - Which indicate a class is Bean using @Bean annotation.
 */
// @SpringBootApplication(
//		scanBasePackages = {"com.aadi.springcore", "com.aadi.util"}
//)
@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
