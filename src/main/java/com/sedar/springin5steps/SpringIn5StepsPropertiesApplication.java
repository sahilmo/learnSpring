package com.sedar.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sedar.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class)) {

			com.sedar.springin5steps.properties.SomeExternalService service = 
					applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service.returnServiceURL());
		}

	}

}