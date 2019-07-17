package com.sedar.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("quick")
public class QuickSortAlgortihm implements sortAlgorithm{

	public int[] sort(int[] numbers) {
		return  numbers;
	}
}
