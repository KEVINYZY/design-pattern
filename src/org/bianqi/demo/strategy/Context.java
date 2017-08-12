package org.bianqi.demo.strategy;

public class Context {
	private IStrategy iStrategy;

	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	public  void operate(){
		this.iStrategy.opterate();
	}
}
