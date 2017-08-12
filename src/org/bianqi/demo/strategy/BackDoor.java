package org.bianqi.demo.strategy;

public class BackDoor implements IStrategy {
	@Override
	public void opterate() {
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
	}
}
