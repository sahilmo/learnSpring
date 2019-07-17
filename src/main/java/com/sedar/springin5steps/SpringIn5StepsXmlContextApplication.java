package com.sedar.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sedar.springin5steps.xml.XmlPersonDAO;


public class SpringIn5StepsXmlContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication .class);
	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}"+ 
			(Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

		LOGGER.info("{} {}" + personDAO, personDAO.getXmlJdbcConnection());

		}

	}

}
