package com.sedar.springin5steps.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("bubble")
	private sortAlgorithm sortAlgorithm;

// Constructor based Auto wiring
//	public BinarySearchImpl(sortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//		System.out.println(this.sortAlgorithm);
//	}

	public int binarySearch(int[] numbers, int NumberToFind) {
		System.out.println(sortAlgorithm);
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);
		// return index
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("Post Construct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("Pre Destroy");
	}
}
