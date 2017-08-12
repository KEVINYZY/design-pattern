package org.bianqi.demo.builder;

import java.util.ArrayList;

/**
 * 要什么我给你建造什么？
 * <p>Title: CarBuilder</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:21:35
 * @version 1.0
 */
public abstract class CarBuilder {
	public abstract void setSequence(ArrayList<String> sequence);
	public abstract CarModel getCarModel();
}
