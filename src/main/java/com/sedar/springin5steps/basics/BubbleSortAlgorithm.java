package com.sedar.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements sortAlgorithm {
	
	public int[] sort(int[] numbers) {
		return  numbers;
	}

}
