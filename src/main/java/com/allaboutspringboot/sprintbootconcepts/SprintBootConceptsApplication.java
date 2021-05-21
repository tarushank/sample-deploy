package com.allaboutspringboot.sprintbootconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SprintBootConceptsApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SprintBootConceptsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SprintBootConceptsApplication.class, args);
		LOGGER.info("MAIN method executed.");
	}

}
