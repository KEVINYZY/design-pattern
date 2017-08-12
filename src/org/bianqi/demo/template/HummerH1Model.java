package org.bianqi.demo.template;

/**
 * H1 悍马
 * <p>Title: HummerH1Model</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:00:08
 * @version 1.0
 */
public class HummerH1Model extends HummerModel {
	
	private boolean alarmFlag = true;
	
	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");
	}

	@Override
	protected void start() {
		System.out.println("悍马H1发动...");
	}

	@Override
	protected void stop() {
		System.out.println("悍马H1停车...");
	}
	
	protected boolean isAlarm(){
		return alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}
}







