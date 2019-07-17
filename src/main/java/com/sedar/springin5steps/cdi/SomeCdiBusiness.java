package com.sedar.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO SomeCdiDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return SomeCdiDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
		SomeCdiDAO = someCDIDAO;
	}
	
	
}
