package org.bianqi.demo.template;

/**
 *   悍马接口
 * <p>Title: HummerModel</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月6日下午11:57:25
 * @version 1.0
 */
public abstract class HummerModel {
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();

	final public void run(){
		this.start();
		this.engineBoom();
		if(this.isAlarm()){
			this.alarm();
		}
		this.stop();
	}
	
	protected boolean isAlarm(){
		return true;
	}
	
}
