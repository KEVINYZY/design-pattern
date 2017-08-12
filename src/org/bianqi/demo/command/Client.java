package org.bianqi.demo.command;

public class Client {

	public static void main(String[] args) {
		Invoker xiaosan = new Invoker();
		Command command = new AddRequirementCommand();
		xiaosan.setCommand(command);
		xiaosan.action();
	}

}
