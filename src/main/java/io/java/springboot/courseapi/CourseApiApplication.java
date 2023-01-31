package io.java.springboot.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"io.java.springboot.courseapi.TopicController", "io.java.springboot.courseapi.TopicService", "io.java.springboot.courseapi.TopicRepository"})
//basePackageClasses=TopicController.class
public class CourseApiApplication {

//	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(CourseApiApplication.class);
//    }
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
