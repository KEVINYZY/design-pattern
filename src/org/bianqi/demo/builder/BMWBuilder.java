package org.bianqi.demo.builder;

import java.util.ArrayList;
/**
 * 宝马建造
 * <p>Title: BMWBuilder</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:25:45
 * @version 1.0
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSquence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
