package com.sedar.springin5steps.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sedar.springin5steps.SpringIn5StepsBasicApplication;

//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	// get the bean from context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
	 int actualResult =	binarySearch.binarySearch(new int[] {}, 3);
	 assertEquals(3, actualResult);
	}

}
