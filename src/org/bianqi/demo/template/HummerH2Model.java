package org.bianqi.demo.template;
/**
 * H2 悍马
 * <p>Title: HummerH2Model</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:01:09
 * @version 1.0
 */
public class HummerH2Model extends HummerModel {

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声音是这样在...");
	}

	@Override
	public void start() {
		System.out.println("悍马H2发动...");
	}

	@Override
	public void stop() {
		System.out.println("悍马H2停车...");
	}

}
