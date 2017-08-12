package org.bianqi.demo.observer;

public class Client {
	public static void main(String[] args) {
		
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		Observer liuSi = new LiuSi();
		
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.addObserver(liuSi);
		
		hanFeiZi.haveBreakfast();
		
	}
}
