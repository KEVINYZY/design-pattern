package org.bianqi.demo.singleton;

public class Minister {
	public static void main(String[] args) {
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo();
		
	}
}
