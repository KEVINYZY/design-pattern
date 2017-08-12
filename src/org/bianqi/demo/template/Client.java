package org.bianqi.demo.template;
/**
 * 使用这个模型
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:03:17
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) {
		HummerH1Model model = new HummerH1Model();
		model.setAlarm(true);
		model.run();
//		HummerModel model2 = new HummerH2Model();
//		model2.run();
	}
}
