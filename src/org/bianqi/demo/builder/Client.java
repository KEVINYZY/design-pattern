package org.bianqi.demo.builder;

/**
 * 客户端(建造者模式)
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:20:26
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
//		BenzModel benz = new BenzModel();
//		ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
//		sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
//		sequence.add("start"); //启动起来
//		sequence.add("stop"); //开了一段就停下来
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		benz.run();
		Director director = new Director();
		
		for(int i = 0;i < 10000; i++){
			director.getABeanzModel().run();
		}
	
	}

}
