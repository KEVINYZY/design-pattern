package org.bianqi.demo.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
	
	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSquence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
