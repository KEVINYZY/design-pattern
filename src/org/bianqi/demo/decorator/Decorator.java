package org.bianqi.demo.decorator;

/**
 * 是你 还有你 一切拜托你 装饰者模式
 * <p>Title: Decorator</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午8:03:31
 * @version 1.0
 */
public class Decorator extends SchoolReport {
	
	private SchoolReport sr;
	
	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}
	
	@Override
	public void report() {
		this.sr.report();
	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
