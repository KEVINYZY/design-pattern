package org.bianqi.demo.singleton;

public class SingletonPattern {
	private static final SingletonPattern SINGLETON_PATTERN = new SingletonPattern();

	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return SINGLETON_PATTERN;
	}
}
