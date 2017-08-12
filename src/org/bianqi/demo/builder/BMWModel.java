package org.bianqi.demo.builder;

/**
 * 宝马
 * <p>Title: BMWModel</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:19:26
 * @version 1.0
 */
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马车跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车应该这样停车...");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车的引擎是这个声音的...");
	}

}
