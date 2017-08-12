package org.bianqi.demo.facade;
/**
 * 门面模式
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月6日下午11:41:38
 * @version 1.0
 */
public class Client {
	public static void main(String[] args) {
		// LetterProcess letterProcess = new LetterProcessImpl();
		// letterProcess.writeContext("Hello,It's me,do you know who I am? I'm
		// your old lover. I'd like to....");
		// letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		// letterProcess.letterInotoEnvelope();
		// letterProcess.sendLetter();
		ModenPostOffice modenPostOffice = new ModenPostOffice();
		String address = "Happy Road No. 666,God Province,Heaven"; //定义一个地址
		String context = "Hello,It's me,do you know who I am? I'm your old lover.I'd like to....";
		modenPostOffice.sendLetter(context, address);
	}
}
