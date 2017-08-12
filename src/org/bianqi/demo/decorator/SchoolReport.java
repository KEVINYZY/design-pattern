package org.bianqi.demo.decorator;

/**
 * 成绩单的抽象类
 * <p>Title: SchoolReport</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:56:43
 * @version 1.0
 */
public abstract class SchoolReport {
	
	public abstract void report();
	
	public abstract void sign(String name);
}
