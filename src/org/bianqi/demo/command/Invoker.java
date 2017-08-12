package org.bianqi.demo.command;

/**
 * 
 * <p>Title: Invoker</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月8日下午7:50:52
 * @version 1.0
 */
public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
		
	public void action(){
		this.command.execute();
	}
	
}
